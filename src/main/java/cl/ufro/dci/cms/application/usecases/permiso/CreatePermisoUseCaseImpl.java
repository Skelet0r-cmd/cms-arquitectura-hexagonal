package cl.ufro.dci.cms.application.usecases.permiso;

import cl.ufro.dci.cms.domain.model.GrupoPermiso;
import cl.ufro.dci.cms.domain.model.Permiso;
import cl.ufro.dci.cms.domain.ports.in.grupoPermiso.CreateGrupoPermisoUseCase;
import cl.ufro.dci.cms.domain.ports.in.permiso.CreatePermisoUseCase;
import cl.ufro.dci.cms.domain.ports.out.GrupoPermisoRepositoryPort;
import cl.ufro.dci.cms.domain.ports.out.PermisoRepositoryPort;

public class CreatePermisoUseCaseImpl implements CreatePermisoUseCase {

    private final PermisoRepositoryPort permisoRepositoryPort;

    public CreatePermisoUseCaseImpl(PermisoRepositoryPort permisoRepositoryPort) {
        this.permisoRepositoryPort = permisoRepositoryPort;
    }

    @Override
    public Permiso createPermiso(Permiso permiso) {
        return permisoRepositoryPort.save(permiso);
    }
}
