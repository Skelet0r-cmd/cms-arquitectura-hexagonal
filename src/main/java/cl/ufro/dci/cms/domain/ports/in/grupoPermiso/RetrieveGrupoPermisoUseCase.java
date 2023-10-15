package cl.ufro.dci.cms.domain.ports.in.grupoPermiso;

import cl.ufro.dci.cms.domain.model.GrupoPermiso;

import java.util.List;
import java.util.Optional;

public interface RetrieveGrupoPermisoUseCase {
    Optional<GrupoPermiso> getGrupoPermisoById (Integer id);
    List<GrupoPermiso> getAllGruposPermisos();
}
