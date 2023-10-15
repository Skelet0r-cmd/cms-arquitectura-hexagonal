package cl.ufro.dci.cms.application.usecases.grupoPermiso;

import cl.ufro.dci.cms.domain.ports.in.grupoPermiso.DeleteGrupoPermisoUseCase;
import cl.ufro.dci.cms.domain.ports.out.GrupoPermisoRepositoryPort;

public class DeleteGrupoPermisoUseCaseImpl implements DeleteGrupoPermisoUseCase {

    private final GrupoPermisoRepositoryPort grupoPermisoRepositoryPort;

    public DeleteGrupoPermisoUseCaseImpl(GrupoPermisoRepositoryPort grupoPermisoRepositoryPort) {
        this.grupoPermisoRepositoryPort = grupoPermisoRepositoryPort;
    }

    @Override
    public boolean deleteGrupoPermiso(Integer id) {
        return grupoPermisoRepositoryPort.deleteById(id);
    }
}
