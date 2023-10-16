package cl.ufro.dci.cms.infrastructure.controllers;

import cl.ufro.dci.cms.application.services.UsuarioService;
import cl.ufro.dci.cms.domain.model.AdditionalUsuarioInfo;
import cl.ufro.dci.cms.domain.model.Usuario;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<Usuario> createUsuario(@RequestBody Usuario usuario) {
        Usuario createdUsuario = usuarioService.createUsuario(usuario);
        return new ResponseEntity<>(createdUsuario, HttpStatus.CREATED);
    }

    @GetMapping("/{UsuarioId}")
    public ResponseEntity<Usuario> getUsuarioById(@PathVariable Integer UsuarioId) {
        return usuarioService.getUsuarioById(UsuarioId)
                .map(task -> new ResponseEntity<>(task, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> getAllUsuarios() {
        List<Usuario> usuarios = usuarioService.getAllUsuarios();
        return new ResponseEntity<>(usuarios, HttpStatus.OK);
    }

    @PutMapping("/{UsuarioId}")
    public ResponseEntity<Usuario> updateUsuario(@PathVariable Integer UsuarioId, @RequestBody Usuario updatedUsuario) {
        return usuarioService.updateUsuario(UsuarioId, updatedUsuario)
                .map(task -> new ResponseEntity<>(task, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{UsuarioId}")
    public ResponseEntity<Void> deleteUsuarioById(@PathVariable Integer UsuarioId) {
        if (usuarioService.deleteUsuario(UsuarioId)) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{UsuarioId}/additional-info")
    public ResponseEntity<AdditionalUsuarioInfo> getAdditionalUsuarioInfo(@PathVariable Integer UsuarioId) {
        AdditionalUsuarioInfo additionalUsuarioInfo = usuarioService.getAdditionalUsuarioInfo(UsuarioId);
        return new ResponseEntity<>(additionalUsuarioInfo, HttpStatus.OK);
    }
}
