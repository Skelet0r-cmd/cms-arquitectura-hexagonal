package cl.ufro.dci.cms.infrastructure.controllers;

import cl.ufro.dci.cms.application.services.ComentarioService;
import cl.ufro.dci.cms.domain.model.AdditionalComentarioInfo;
import cl.ufro.dci.cms.domain.model.Comentario;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comentarios")
public class ComentarioController {
    private final ComentarioService comentarioService;

    public ComentarioController(ComentarioService comentarioService) {
        this.comentarioService = comentarioService;
    }

    @PostMapping
    public ResponseEntity<Comentario> createComentario(@RequestBody Comentario comentario) {
        Comentario createdComentario = comentarioService.createComentario(comentario);
        return new ResponseEntity<>(createdComentario, HttpStatus.CREATED);
    }

    @GetMapping("/{comentarioId}")
    public ResponseEntity<Comentario> getComentarioById(@PathVariable Integer comentarioId) {
        return comentarioService.getComentarioById(comentarioId)
                .map(task -> new ResponseEntity<>(task, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping
    public ResponseEntity<List<Comentario>> getAllComentarios() {
        List<Comentario> comentarios = comentarioService.getAllComentarios();
        return new ResponseEntity<>(comentarios, HttpStatus.OK);
    }

    @PutMapping("/{comentarioId}")
    public ResponseEntity<Comentario> updateComentario(@PathVariable Integer comentarioId, @RequestBody Comentario updatedComentario) {
        return comentarioService.updateComentario(comentarioId, updatedComentario)
                .map(task -> new ResponseEntity<>(task, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{comentarioId}")
    public ResponseEntity<Void> deleteComentarioById(@PathVariable Integer comentarioId) {
        if (comentarioService.deleteComentario(comentarioId)) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{comentarioId}/additional-info")
    public ResponseEntity<AdditionalComentarioInfo> getAdditionalComentarioInfo(@PathVariable Integer comentarioId) {
        AdditionalComentarioInfo additionalComentarioInfo = comentarioService.getAdditionalComentarioInfo(comentarioId);
        return new ResponseEntity<>(additionalComentarioInfo, HttpStatus.OK);
    }
}
