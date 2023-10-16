package cl.ufro.dci.cms.infrastructure.controllers;

import cl.ufro.dci.cms.application.services.ContenidoService;
import cl.ufro.dci.cms.domain.model.Contenido;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contenidos")
public class ContenidoController {
    private final ContenidoService contenidoService;

    public ContenidoController(ContenidoService contenidoService) {
        this.contenidoService = contenidoService;
    }

    @PostMapping
    public ResponseEntity<Contenido> createContenido(@RequestBody Contenido contenido) {
        Contenido createdContenido = contenidoService.createContenido(contenido);
        return new ResponseEntity<>(createdContenido, HttpStatus.CREATED);
    }

    @GetMapping("/{contenidoId}")
    public ResponseEntity<Contenido> getContenidoById(@PathVariable Integer contenidoId) {
        return contenidoService.getContenidoById(contenidoId)
                .map(task -> new ResponseEntity<>(task, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping
    public ResponseEntity<List<Contenido>> getAllContenidos() {
        List<Contenido> contenidos = contenidoService.getAllContenidos();
        return new ResponseEntity<>(contenidos, HttpStatus.OK);
    }

    @PutMapping("/{contenidoId}")
    public ResponseEntity<Contenido> updateContenido(@PathVariable Integer contenidoId, @RequestBody Contenido updatedContenido) {
        return contenidoService.updateContenido(contenidoId, updatedContenido)
                .map(task -> new ResponseEntity<>(task, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{contenidoId}")
    public ResponseEntity<Void> deleteContenidoById(@PathVariable Integer contenidoId) {
        if (contenidoService.deleteContenido(contenidoId)) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
