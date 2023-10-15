package cl.ufro.dci.cms.application.usecases.permiso;

import cl.ufro.dci.cms.domain.model.Permiso;
import cl.ufro.dci.cms.domain.ports.in.permiso.CreatePermisoUseCase;
import cl.ufro.dci.cms.domain.ports.in.permiso.RetrievePermisoUseCase;
import cl.ufro.dci.cms.domain.ports.out.PermisoRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrievePermisoUseCaseImpl implements RetrievePermisoUseCase {

    private final PermisoRepositoryPort permisoRepositoryPort;

    public RetrievePermisoUseCaseImpl(PermisoRepositoryPort permisoRepositoryPort) {
        this.permisoRepositoryPort = permisoRepositoryPort;
    }

    @Override
    public Optional<Permiso> getPermisoById(Integer id) {
        return permisoRepositoryPort.findById(id);
    }

    @Override
    public List<Permiso> getAllGPermisos() {
        return permisoRepositoryPort.findAll();
    }
}
