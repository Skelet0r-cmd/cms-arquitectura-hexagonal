package cl.ufro.dci.cms.application.usecases.grupoPermiso;

import cl.ufro.dci.cms.domain.model.GrupoPermiso;
import cl.ufro.dci.cms.domain.ports.in.grupoPermiso.CreateGrupoPermisoUseCase;
import cl.ufro.dci.cms.domain.ports.out.GrupoPermisoRepositoryPort;

public class CreateGrupoPermisoUseCaseImpl implements CreateGrupoPermisoUseCase {

    private final GrupoPermisoRepositoryPort grupoPermisoRepositoryPort;

    public CreateGrupoPermisoUseCaseImpl(GrupoPermisoRepositoryPort grupoPermisoRepositoryPort) {
        this.grupoPermisoRepositoryPort = grupoPermisoRepositoryPort;
    }

    @Override
    public GrupoPermiso createGrupoPermiso(GrupoPermiso grupoPermiso) {
        return grupoPermisoRepositoryPort.save(grupoPermiso);
    }
}
