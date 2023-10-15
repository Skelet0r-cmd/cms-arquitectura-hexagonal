package cl.ufro.dci.cms.domain.ports.out;

import cl.ufro.dci.cms.domain.model.Comentario;

import java.util.List;
import java.util.Optional;

public interface ComentarioRepositoryPort {
    Comentario save(Comentario comentario);
    Optional<Comentario> findById(Integer id);
    List<Comentario> findAll();
    Optional<Comentario> update(Comentario comentario);
    boolean deleteById(Integer id);
}
