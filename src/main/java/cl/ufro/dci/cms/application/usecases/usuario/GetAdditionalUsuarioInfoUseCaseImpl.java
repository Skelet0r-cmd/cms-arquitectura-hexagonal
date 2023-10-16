package cl.ufro.dci.cms.application.usecases.usuario;

import cl.ufro.dci.cms.domain.model.AdditionalUsuarioInfo;
import cl.ufro.dci.cms.domain.ports.in.usuario.GetAdditionalUsuarioInfoUseCase;
import cl.ufro.dci.cms.domain.ports.out.ExternalServicePort;

public class GetAdditionalUsuarioInfoUseCaseImpl implements GetAdditionalUsuarioInfoUseCase {

    private final ExternalServicePort externalServicePort;

    public GetAdditionalUsuarioInfoUseCaseImpl(ExternalServicePort externalServicePort) {
        this.externalServicePort = externalServicePort;
    }

    @Override
    public AdditionalUsuarioInfo getAdditionalUsuarioInfo(Integer usuarioId) {
        return externalServicePort.getAdditionalUsuarioInfo(usuarioId);
    }
}
