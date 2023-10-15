package cl.ufro.dci.cms.domain.ports.in.comentario;

import cl.ufro.dci.cms.domain.model.AdditionalComentarioInfo;

public interface GetAdditionalComentarioInfoUseCase {
    AdditionalComentarioInfo getAdditionalComentarioInfo(Integer comentarioId);
}
