package cl.ufro.dci.cms.infrastructure.controllers;

import cl.ufro.dci.cms.application.services.UsuarioMetadatumService;
import cl.ufro.dci.cms.domain.model.UsuarioMetadatum;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuariosMetadatums")
public class UsuarioMetadatumController {
    private final UsuarioMetadatumService usuarioMetadatumService;

    public UsuarioMetadatumController(UsuarioMetadatumService usuarioMetadatumService) {
        this.usuarioMetadatumService = usuarioMetadatumService;
    }

    @PostMapping
    public ResponseEntity<UsuarioMetadatum> createUsuarioMetadatum(@RequestBody UsuarioMetadatum usuarioMetadatum) {
        UsuarioMetadatum createdUsuarioMetadatum = usuarioMetadatumService.createUsuarioMetadatum(usuarioMetadatum);
        return new ResponseEntity<>(createdUsuarioMetadatum, HttpStatus.CREATED);
    }

    @GetMapping("/{UsuarioMetadatumId}")
    public ResponseEntity<UsuarioMetadatum> getUsuarioMetadatumById(@PathVariable Integer UsuarioMetadatumId) {
        return usuarioMetadatumService.getUsuarioMetadatumById(UsuarioMetadatumId)
                .map(task -> new ResponseEntity<>(task, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping
    public ResponseEntity<List<UsuarioMetadatum>> getAllUsuariosMetadatums() {
        List<UsuarioMetadatum> usuariosMetadatums =  usuarioMetadatumService.getAllUsuariosMetadatum();
        return new ResponseEntity<>(usuariosMetadatums, HttpStatus.OK);
    }

    @PutMapping("/{UsuarioMetadatumId}")
    public ResponseEntity<UsuarioMetadatum> updateUsuarioMetadatum(@PathVariable Integer UsuarioMetadatumId, @RequestBody UsuarioMetadatum usuarioMetadatum) {
        return usuarioMetadatumService.updateUsuarioMetadatum(UsuarioMetadatumId, usuarioMetadatum)
                .map(task -> new ResponseEntity<>(task, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{UsuarioMetadatumId}")
    public ResponseEntity<Void> deleteUsuarioMetadatumById(@PathVariable Integer UsuarioMetadatumId) {
        if (usuarioMetadatumService.deleteUsuarioMetadatum(UsuarioMetadatumId)) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
