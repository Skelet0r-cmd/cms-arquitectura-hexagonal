package cl.ufro.dci.cms.application.services;

import cl.ufro.dci.cms.domain.model.Categoria;
import cl.ufro.dci.cms.domain.ports.in.categoria.CreateCategoriaUseCase;
import cl.ufro.dci.cms.domain.ports.in.categoria.DeleteCategoriaUseCase;
import cl.ufro.dci.cms.domain.ports.in.categoria.RetrieveCategoriaUseCase;
import cl.ufro.dci.cms.domain.ports.in.categoria.UpdateCategoriaUseCase;

import java.util.List;
import java.util.Optional;

public class CategoriaService implements CreateCategoriaUseCase, DeleteCategoriaUseCase,
        RetrieveCategoriaUseCase, UpdateCategoriaUseCase {
    private final CreateCategoriaUseCase createCategoriaUseCase;
    private final DeleteCategoriaUseCase deleteCategoriaUseCase;
    private final RetrieveCategoriaUseCase retrieveCategoriaUseCase;
    private final UpdateCategoriaUseCase updateCategoriaUseCase;

    public CategoriaService(CreateCategoriaUseCase createCategoriaUseCase,
                            DeleteCategoriaUseCase deleteCategoriaUseCase,
                            RetrieveCategoriaUseCase retrieveCategoriaUseCase,
                            UpdateCategoriaUseCase updateCategoriaUseCase) {
        this.createCategoriaUseCase = createCategoriaUseCase;
        this.deleteCategoriaUseCase = deleteCategoriaUseCase;
        this.retrieveCategoriaUseCase = retrieveCategoriaUseCase;
        this.updateCategoriaUseCase = updateCategoriaUseCase;
    }

    @Override
    public Categoria createCategoria(Categoria categoria) {
        return createCategoriaUseCase.createCategoria(categoria);
    }

    @Override
    public boolean deleteCategoria(Integer id) {
        return deleteCategoriaUseCase.deleteCategoria(id);
    }

    @Override
    public Optional<Categoria> getCategoriaById(Integer id) {
        return retrieveCategoriaUseCase.getCategoriaById(id);
    }

    @Override
    public List<Categoria> getAllCategorias() {
        return retrieveCategoriaUseCase.getAllCategorias();
    }

    @Override
    public Optional<Categoria> updateCategoria(Integer id, Categoria updatedCategoria) {
        return updateCategoriaUseCase.updateCategoria(id,updatedCategoria);
    }
}
