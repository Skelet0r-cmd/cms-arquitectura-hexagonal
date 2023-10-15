package cl.ufro.dci.cms.domain.ports.out;

import cl.ufro.dci.cms.domain.model.AdditionalComentarioInfo;
import cl.ufro.dci.cms.domain.model.AdditionalPostInfo;
import cl.ufro.dci.cms.domain.model.AdditionalUsuarioInfo;

public interface ExternalServicePort {
    AdditionalComentarioInfo getAdditionalComentarioInfo(Integer comentarioId);
    AdditionalPostInfo getAdditionalPostInfo(Integer postId);
    AdditionalUsuarioInfo getAdditionalUsuarioInfo(Integer usuarioId);
}
