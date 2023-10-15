package cl.ufro.dci.cms.domain.ports.in.comentario;

import cl.ufro.dci.cms.domain.model.Comentario;

public interface CreateComentarioUseCase {
    Comentario createComentario(Comentario comentario);
}
