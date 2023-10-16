package cl.ufro.dci.cms.infrastructure.controllers;

import cl.ufro.dci.cms.application.services.CategoriaService;
import cl.ufro.dci.cms.domain.model.Categoria;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {
    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @PostMapping
    public ResponseEntity<Categoria> createCategoria(@RequestBody Categoria categoria) {
        Categoria createdCategoria = categoriaService.createCategoria(categoria);
        return new ResponseEntity<>(createdCategoria, HttpStatus.CREATED);
    }

    @GetMapping("/{categoriaId}")
    public ResponseEntity<Categoria> getCategoriaById(@PathVariable Integer categoriaId) {
        return categoriaService.getCategoriaById(categoriaId)
                .map(task -> new ResponseEntity<>(task, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping
    public ResponseEntity<List<Categoria>> getAllCategorias() {
        List<Categoria> categorias = categoriaService.getAllCategorias();
        return new ResponseEntity<>(categorias, HttpStatus.OK);
    }

    @PutMapping("/{categoriaId}")
    public ResponseEntity<Categoria> updateCategoria(@PathVariable Integer categoriaId, @RequestBody Categoria updatedCategoria) {
        return categoriaService.updateCategoria(categoriaId, updatedCategoria)
                .map(task -> new ResponseEntity<>(task, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{categoriaId}")
    public ResponseEntity<Void> deleteCategoriaById(@PathVariable Integer categoriaId) {
        if (categoriaService.deleteCategoria(categoriaId)) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
