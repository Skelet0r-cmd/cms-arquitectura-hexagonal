package cl.ufro.dci.cms.application.usecases.grupoPermiso;

import cl.ufro.dci.cms.domain.model.GrupoPermiso;
import cl.ufro.dci.cms.domain.ports.in.grupoPermiso.UpdateGrupoPermisoUseCase;
import cl.ufro.dci.cms.domain.ports.out.GrupoPermisoRepositoryPort;

import java.util.Optional;

public class UpdateGrupoPermisoUseCaseImpl implements UpdateGrupoPermisoUseCase {

    private final GrupoPermisoRepositoryPort grupoPermisoRepositoryPort;

    public UpdateGrupoPermisoUseCaseImpl(GrupoPermisoRepositoryPort grupoPermisoRepositoryPort) {
        this.grupoPermisoRepositoryPort = grupoPermisoRepositoryPort;
    }

    @Override
    public Optional<GrupoPermiso> updateGrupoPermiso(Integer id, GrupoPermiso updatedGrupoPermiso) {
        return grupoPermisoRepositoryPort.update(updatedGrupoPermiso);
    }
}
