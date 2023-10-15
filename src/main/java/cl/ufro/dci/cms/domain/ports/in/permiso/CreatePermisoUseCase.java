package cl.ufro.dci.cms.domain.ports.in.permiso;

import cl.ufro.dci.cms.domain.model.Permiso;

public interface CreatePermisoUseCase {
    Permiso createPermiso(Permiso permiso);
}
