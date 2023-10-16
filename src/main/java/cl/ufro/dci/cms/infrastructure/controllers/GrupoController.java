package cl.ufro.dci.cms.infrastructure.controllers;

import cl.ufro.dci.cms.application.services.GrupoService;
import cl.ufro.dci.cms.domain.model.Grupo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/grupos")
public class GrupoController {
    private final GrupoService grupoService;

    public GrupoController(GrupoService grupoService) {
        this.grupoService = grupoService;
    }

    @PostMapping
    public ResponseEntity<Grupo> createGrupo(@RequestBody Grupo grupo) {
        Grupo createdGrupo = grupoService.createGrupo(grupo);
        return new ResponseEntity<>(createdGrupo, HttpStatus.CREATED);
    }

    @GetMapping("/{grupoId}")
    public ResponseEntity<Grupo> getGrupoById(@PathVariable Integer grupoId) {
        return grupoService.getGrupoById(grupoId)
                .map(task -> new ResponseEntity<>(task, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping
    public ResponseEntity<List<Grupo>> getAllGrupos() {
        List<Grupo> grupos = grupoService.getAllGrupos();
        return new ResponseEntity<>(grupos, HttpStatus.OK);
    }

    @PutMapping("/{grupoId}")
    public ResponseEntity<Grupo> updateGrupo(@PathVariable Integer grupoId, @RequestBody Grupo updatedGrupo) {
        return grupoService.updateGrupo(grupoId, updatedGrupo)
                .map(task -> new ResponseEntity<>(task, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{grupoId}")
    public ResponseEntity<Void> deleteGrupoById(@PathVariable Integer grupoId) {
        if (grupoService.deleteGrupo(grupoId)) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
