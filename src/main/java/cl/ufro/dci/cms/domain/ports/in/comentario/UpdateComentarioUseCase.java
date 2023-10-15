package cl.ufro.dci.cms.domain.ports.in.comentario;

import cl.ufro.dci.cms.domain.model.Comentario;

import java.util.Optional;

public interface UpdateComentarioUseCase {
    Optional<Comentario> updateComentario (Integer id, Comentario updateComentario);
}
