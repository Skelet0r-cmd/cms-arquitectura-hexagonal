package cl.ufro.dci.cms.domain.ports.in.permiso;

import cl.ufro.dci.cms.domain.model.Permiso;

import java.util.List;
import java.util.Optional;

public interface RetrievePermisoUseCase {
    Optional<Permiso> getPermisoById (Integer id);
    List<Permiso> getAllGPermisos();
}
