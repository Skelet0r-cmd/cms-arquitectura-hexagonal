package cl.ufro.dci.cms.domain.ports.out;

import cl.ufro.dci.cms.domain.model.Contenido;

import java.util.List;
import java.util.Optional;

public interface ContenidoRepositoryPort {
    Contenido save(Contenido contenido);
    Optional<Contenido> findById(Integer id);
    List<Contenido> findAll();
    Optional<Contenido> update(Contenido contenido);
    boolean deleteById(Integer id);
}
