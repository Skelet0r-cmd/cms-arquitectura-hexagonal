package cl.ufro.dci.cms.domain.ports.in.grupoPermiso;

import cl.ufro.dci.cms.domain.model.GrupoPermiso;

public interface CreateGrupoPermisoUseCase {
    GrupoPermiso createGrupoPermiso(GrupoPermiso grupoPermiso);
}
