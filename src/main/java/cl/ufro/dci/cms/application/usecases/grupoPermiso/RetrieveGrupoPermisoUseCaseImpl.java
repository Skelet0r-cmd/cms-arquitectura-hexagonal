package cl.ufro.dci.cms.application.usecases.grupoPermiso;

import cl.ufro.dci.cms.domain.model.GrupoPermiso;
import cl.ufro.dci.cms.domain.ports.in.grupoPermiso.CreateGrupoPermisoUseCase;
import cl.ufro.dci.cms.domain.ports.in.grupoPermiso.RetrieveGrupoPermisoUseCase;
import cl.ufro.dci.cms.domain.ports.out.GrupoPermisoRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveGrupoPermisoUseCaseImpl implements RetrieveGrupoPermisoUseCase {

    private final GrupoPermisoRepositoryPort grupoPermisoRepositoryPort;

    public RetrieveGrupoPermisoUseCaseImpl(GrupoPermisoRepositoryPort grupoPermisoRepositoryPort) {
        this.grupoPermisoRepositoryPort = grupoPermisoRepositoryPort;
    }

    @Override
    public Optional<GrupoPermiso> getGrupoPermisoById(Integer id) {
        return grupoPermisoRepositoryPort.findById(id);
    }

    @Override
    public List<GrupoPermiso> getAllGruposPermisos() {
        return grupoPermisoRepositoryPort.findAll();
    }
}
