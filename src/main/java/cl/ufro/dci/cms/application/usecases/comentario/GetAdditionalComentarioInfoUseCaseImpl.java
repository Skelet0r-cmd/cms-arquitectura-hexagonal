package cl.ufro.dci.cms.application.usecases.comentario;

import cl.ufro.dci.cms.domain.model.AdditionalComentarioInfo;
import cl.ufro.dci.cms.domain.ports.in.comentario.GetAdditionalComentarioInfoUseCase;
import cl.ufro.dci.cms.domain.ports.out.ExternalServicePort;

public class GetAdditionalComentarioInfoUseCaseImpl implements GetAdditionalComentarioInfoUseCase {

    private final ExternalServicePort externalServicePort;

    public GetAdditionalComentarioInfoUseCaseImpl(ExternalServicePort externalServicePort) {
        this.externalServicePort = externalServicePort;
    }

    @Override
    public AdditionalComentarioInfo getAdditionalComentarioInfo(Integer comentarioId) {
        return externalServicePort.getAdditionalComentarioInfo(comentarioId);
    }
}
