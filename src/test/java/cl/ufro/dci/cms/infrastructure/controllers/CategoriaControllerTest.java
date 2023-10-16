package cl.ufro.dci.cms.infrastructure.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import cl.ufro.dci.cms.application.services.CategoriaService;
import cl.ufro.dci.cms.application.usecases.categoria.RetrieveCategoriaUseCaseImpl;
import cl.ufro.dci.cms.domain.model.Categoria;
import cl.ufro.dci.cms.domain.ports.in.categoria.CreateCategoriaUseCase;
import cl.ufro.dci.cms.domain.ports.in.categoria.DeleteCategoriaUseCase;
import cl.ufro.dci.cms.domain.ports.in.categoria.UpdateCategoriaUseCase;
import cl.ufro.dci.cms.infrastructure.repositories.JpaCategoriaRepository;
import cl.ufro.dci.cms.infrastructure.repositories.JpaCategoriaRepositoryAdapter;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {CategoriaController.class})
@ExtendWith(SpringExtension.class)
class CategoriaControllerTest {
    @Autowired
    private CategoriaController categoriaController;

    @MockBean
    private CategoriaService categoriaService;
    @Test
    void testCreateCategoria() {
        CreateCategoriaUseCase createCategoriaUseCase = mock(CreateCategoriaUseCase.class);
        when(createCategoriaUseCase.createCategoria(Mockito.<Categoria>any())).thenReturn(new Categoria(1, "Nombre",
                "Descripcion", LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant(), 1));
        DeleteCategoriaUseCase deleteCategoriaUseCase = mock(DeleteCategoriaUseCase.class);
        CategoriaController categoriaController = new CategoriaController(
                new CategoriaService(createCategoriaUseCase, deleteCategoriaUseCase,
                        new RetrieveCategoriaUseCaseImpl(new JpaCategoriaRepositoryAdapter(mock(JpaCategoriaRepository.class))),
                        mock(UpdateCategoriaUseCase.class)));
        ResponseEntity<Categoria> actualCreateCategoriaResult = categoriaController.createCategoria(new Categoria(1,
                "Nombre", "Descripcion", LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant(), 1));
        assertTrue(actualCreateCategoriaResult.hasBody());
        assertTrue(actualCreateCategoriaResult.getHeaders().isEmpty());
        assertEquals(201, actualCreateCategoriaResult.getStatusCodeValue());
        verify(createCategoriaUseCase).createCategoria(Mockito.<Categoria>any());
    }

    @Test
    void testGetCategoriaById() throws Exception {
        Optional<Categoria> emptyResult = Optional.empty();
        when(categoriaService.getCategoriaById(Mockito.<Integer>any())).thenReturn(emptyResult);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api/categorias/{categoriaId}", 1);
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(categoriaController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().isNotFound());
    }

    @Test
    void testGetAllCategorias() throws Exception {
        when(categoriaService.getAllCategorias()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api/categorias");
        MockMvcBuilders.standaloneSetup(categoriaController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    @Test
    void testUpdateCategoria3() {
        CategoriaService categoriaService = mock(CategoriaService.class);
        Optional<Categoria> ofResult = Optional.of(new Categoria(1, "Nombre", "Descripcion",
                LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant(), 1));
        when(categoriaService.updateCategoria(Mockito.<Integer>any(), Mockito.<Categoria>any())).thenReturn(ofResult);
        CategoriaController categoriaController = new CategoriaController(categoriaService);
        ResponseEntity<Categoria> actualUpdateCategoriaResult = categoriaController.updateCategoria(1, new Categoria(1,
                "Nombre", "Descripcion", LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant(), 1));
        assertTrue(actualUpdateCategoriaResult.hasBody());
        assertTrue(actualUpdateCategoriaResult.getHeaders().isEmpty());
        assertEquals(200, actualUpdateCategoriaResult.getStatusCodeValue());
        verify(categoriaService).updateCategoria(Mockito.<Integer>any(), Mockito.<Categoria>any());
    }

    @Test
    void testDeleteCategoriaById() throws Exception {
        when(categoriaService.deleteCategoria(Mockito.<Integer>any())).thenReturn(true);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/api/categorias/{categoriaId}", 1);
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(categoriaController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().isNoContent());
    }
}

