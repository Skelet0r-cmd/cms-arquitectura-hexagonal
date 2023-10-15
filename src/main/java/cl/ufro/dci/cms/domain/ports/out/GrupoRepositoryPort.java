package cl.ufro.dci.cms.domain.ports.out;

import cl.ufro.dci.cms.domain.model.Grupo;

import java.util.List;
import java.util.Optional;

public interface GrupoRepositoryPort {
    Grupo save(Grupo grupo);
    Optional<Grupo> findById(Integer id);
    List<Grupo> findAll();
    Optional<Grupo> update(Grupo grupo);
    boolean deleteById(Integer id);
}
