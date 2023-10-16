package cl.ufro.dci.cms.application.services;

import cl.ufro.dci.cms.domain.model.Permiso;
import cl.ufro.dci.cms.domain.ports.in.permiso.CreatePermisoUseCase;
import cl.ufro.dci.cms.domain.ports.in.permiso.DeletePermisoUseCase;
import cl.ufro.dci.cms.domain.ports.in.permiso.RetrievePermisoUseCase;
import cl.ufro.dci.cms.domain.ports.in.permiso.UpdatePermisoUseCase;

import java.util.List;
import java.util.Optional;

public class PermisoService implements CreatePermisoUseCase, DeletePermisoUseCase,
        RetrievePermisoUseCase, UpdatePermisoUseCase {
    private final CreatePermisoUseCase createPermisoUseCase;
    private final DeletePermisoUseCase deletePermisoUseCase;
    private final RetrievePermisoUseCase retrievePermisoUseCase;
    private final UpdatePermisoUseCase updatePermisoUseCase;

    public PermisoService(CreatePermisoUseCase createPermisoUseCase, DeletePermisoUseCase deletePermisoUseCase,
                          RetrievePermisoUseCase retrievePermisoUseCase, UpdatePermisoUseCase updatePermisoUseCase) {
        this.createPermisoUseCase = createPermisoUseCase;
        this.deletePermisoUseCase = deletePermisoUseCase;
        this.retrievePermisoUseCase = retrievePermisoUseCase;
        this.updatePermisoUseCase = updatePermisoUseCase;
    }

    @Override
    public Permiso createPermiso(Permiso permiso) {
        return createPermisoUseCase.createPermiso(permiso);
    }

    @Override
    public boolean deletePermiso(Integer id) {
        return deletePermisoUseCase.deletePermiso(id);
    }

    @Override
    public Optional<Permiso> getPermisoById(Integer id) {
        return retrievePermisoUseCase.getPermisoById(id);
    }

    @Override
    public List<Permiso> getAllGPermisos() {
        return retrievePermisoUseCase.getAllGPermisos();
    }

    @Override
    public Optional<Permiso> updatePermiso(Integer id, Permiso updatedPermiso) {
        return updatePermisoUseCase.updatePermiso(id,updatedPermiso);
    }
}
