package cl.ufro.dci.cms.domain.ports.in.permiso;

import cl.ufro.dci.cms.domain.model.Permiso;

import java.util.Optional;

public interface UpdatePermisoUseCase {
    Optional<Permiso> updatePermiso (Integer id, Permiso updatePermiso);
}
