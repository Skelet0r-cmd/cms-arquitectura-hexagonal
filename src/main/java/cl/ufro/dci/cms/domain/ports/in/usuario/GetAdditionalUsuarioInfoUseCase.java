package cl.ufro.dci.cms.domain.ports.in.usuario;

import cl.ufro.dci.cms.domain.model.AdditionalUsuarioInfo;

public interface GetAdditionalUsuarioInfoUseCase {
    AdditionalUsuarioInfo getAdditionalUsuarioInfo(Integer usuarioId);
}
