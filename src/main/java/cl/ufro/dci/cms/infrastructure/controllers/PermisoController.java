package cl.ufro.dci.cms.infrastructure.controllers;

import cl.ufro.dci.cms.application.services.PermisoService;
import cl.ufro.dci.cms.domain.model.Permiso;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/permisos")
public class PermisoController {
    private final PermisoService permisoService;

    public PermisoController(PermisoService permisoService) {
        this.permisoService = permisoService;
    }

    @PostMapping
    public ResponseEntity<Permiso> createPermiso(@RequestBody Permiso permiso) {
        Permiso createdPermiso = permisoService.createPermiso(permiso);
        return new ResponseEntity<>(createdPermiso, HttpStatus.CREATED);
    }

    @GetMapping("/{permisoId}")
    public ResponseEntity<Permiso> getPermisoById(@PathVariable Integer permisoId) {
        return permisoService.getPermisoById(permisoId)
                .map(task -> new ResponseEntity<>(task, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping
    public ResponseEntity<List<Permiso>> getAllPermisos() {
        List<Permiso> permisos = permisoService.getAllGPermisos();
        return new ResponseEntity<>(permisos, HttpStatus.OK);
    }

    @PutMapping("/{permisoId}")
    public ResponseEntity<Permiso> updatePermiso(@PathVariable Integer permisoId, @RequestBody Permiso updatedPermiso) {
        return permisoService.updatePermiso(permisoId, updatedPermiso)
                .map(task -> new ResponseEntity<>(task, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{permisoId}")
    public ResponseEntity<Void> deletePermisoById(@PathVariable Integer permisoId) {
        if (permisoService.deletePermiso(permisoId)) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
