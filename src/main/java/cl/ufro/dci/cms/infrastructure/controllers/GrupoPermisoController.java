package cl.ufro.dci.cms.infrastructure.controllers;

import cl.ufro.dci.cms.application.services.GrupoPermisoService;
import cl.ufro.dci.cms.domain.model.GrupoPermiso;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gruposPermisos")
public class GrupoPermisoController {
    private final GrupoPermisoService grupoPermisoService;

    public GrupoPermisoController(GrupoPermisoService grupoPermisoService) {
        this.grupoPermisoService = grupoPermisoService;
    }

    @PostMapping
    public ResponseEntity<GrupoPermiso> createGrupoPermiso(@RequestBody GrupoPermiso grupoPermiso) {
        GrupoPermiso createdGrupoPermiso = grupoPermisoService.createGrupoPermiso(grupoPermiso);
        return new ResponseEntity<>(createdGrupoPermiso, HttpStatus.CREATED);
    }

    @GetMapping("/{grupoPermisoId}")
    public ResponseEntity<GrupoPermiso> getGrupoPermisoById(@PathVariable Integer grupoPermisoId) {
        return grupoPermisoService.getGrupoPermisoById(grupoPermisoId)
                .map(task -> new ResponseEntity<>(task, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping
    public ResponseEntity<List<GrupoPermiso>> getAllGruposPermisos() {
        List<GrupoPermiso> gruposPermisos = grupoPermisoService.getAllGruposPermisos();
        return new ResponseEntity<>(gruposPermisos, HttpStatus.OK);
    }

    @PutMapping("/{grupoPermisoId}")
    public ResponseEntity<GrupoPermiso> updateGrupoPermiso(@PathVariable Integer grupoPermisoId, @RequestBody GrupoPermiso updatedGrupoPermiso) {
        return grupoPermisoService.updateGrupoPermiso(grupoPermisoId, updatedGrupoPermiso)
                .map(task -> new ResponseEntity<>(task, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{grupoPermisoId}")
    public ResponseEntity<Void> deleteGrupoPermisoById(@PathVariable Integer grupoPermisoId) {
        if (grupoPermisoService.deleteGrupoPermiso(grupoPermisoId)) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
