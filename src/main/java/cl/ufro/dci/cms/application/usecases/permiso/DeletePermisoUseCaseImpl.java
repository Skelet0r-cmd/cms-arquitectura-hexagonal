package cl.ufro.dci.cms.application.usecases.permiso;

import cl.ufro.dci.cms.domain.model.Permiso;
import cl.ufro.dci.cms.domain.ports.in.permiso.CreatePermisoUseCase;
import cl.ufro.dci.cms.domain.ports.in.permiso.DeletePermisoUseCase;
import cl.ufro.dci.cms.domain.ports.out.PermisoRepositoryPort;

public class DeletePermisoUseCaseImpl implements DeletePermisoUseCase {

    private final PermisoRepositoryPort permisoRepositoryPort;

    public DeletePermisoUseCaseImpl(PermisoRepositoryPort permisoRepositoryPort) {
        this.permisoRepositoryPort = permisoRepositoryPort;
    }

    @Override
    public boolean deletePermiso(Integer id) {
        return permisoRepositoryPort.deleteById(id);
    }
}
