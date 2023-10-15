package cl.ufro.dci.cms.domain.ports.out;

import cl.ufro.dci.cms.domain.model.GrupoPermiso;

import java.util.List;
import java.util.Optional;

public interface GrupoPermisoRepositoryPort {
    GrupoPermiso save(GrupoPermiso grupoPermiso);
    Optional<GrupoPermiso> findById(Integer id);
    List<GrupoPermiso> findAll();
    Optional<GrupoPermiso> update(GrupoPermiso grupoPermiso);
    boolean deleteById(Integer id);
}
