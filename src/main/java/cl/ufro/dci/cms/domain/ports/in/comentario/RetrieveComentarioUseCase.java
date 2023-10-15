package cl.ufro.dci.cms.domain.ports.in.comentario;

import cl.ufro.dci.cms.domain.model.Comentario;

import java.util.List;
import java.util.Optional;

public interface RetrieveComentarioUseCase {
    Optional<Comentario> getComentarioById (Integer id);
    List<Comentario> getAllComentarios();
}
