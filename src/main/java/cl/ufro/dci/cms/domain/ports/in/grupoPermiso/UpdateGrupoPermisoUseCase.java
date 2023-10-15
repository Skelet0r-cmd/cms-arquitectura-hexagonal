package cl.ufro.dci.cms.domain.ports.in.grupoPermiso;

import cl.ufro.dci.cms.domain.model.GrupoPermiso;

import java.util.Optional;

public interface UpdateGrupoPermisoUseCase {
    Optional<GrupoPermiso> updateGrupoPermiso (Integer id, GrupoPermiso updateGrupoPermiso);
}
