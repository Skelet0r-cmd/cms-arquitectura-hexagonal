package cl.ufro.dci.cms.application.usecases.permiso;

import cl.ufro.dci.cms.domain.model.Permiso;
import cl.ufro.dci.cms.domain.ports.in.permiso.CreatePermisoUseCase;
import cl.ufro.dci.cms.domain.ports.in.permiso.UpdatePermisoUseCase;
import cl.ufro.dci.cms.domain.ports.out.PermisoRepositoryPort;

import java.util.Optional;

public class UpdatePermisoUseCaseImpl implements UpdatePermisoUseCase {

    private final PermisoRepositoryPort permisoRepositoryPort;

    public UpdatePermisoUseCaseImpl(PermisoRepositoryPort permisoRepositoryPort) {
        this.permisoRepositoryPort = permisoRepositoryPort;
    }

    @Override
    public Optional<Permiso> updatePermiso(Integer id, Permiso updatedPermiso) {
        return permisoRepositoryPort.update(updatedPermiso);
    }
}
