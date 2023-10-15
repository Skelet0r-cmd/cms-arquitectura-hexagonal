package cl.ufro.dci.cms.domain.ports.out;

import cl.ufro.dci.cms.domain.model.Permiso;

import java.util.List;
import java.util.Optional;

public interface PermisoRepositoryPort {
    Permiso save(Permiso permiso);
    Optional<Permiso> findById(Integer id);
    List<Permiso> findAll();
    Optional<Permiso> update(Permiso permiso);
    boolean deleteById(Integer id);
}
