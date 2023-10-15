package cl.ufro.dci.cms.application.usecases.post;

import cl.ufro.dci.cms.domain.model.AdditionalPostInfo;
import cl.ufro.dci.cms.domain.ports.in.post.GetAdditionalPostInfoUseCase;
import cl.ufro.dci.cms.domain.ports.out.ExternalServicePort;

public class GetAdditionalPostInfoUseCaseImpl implements GetAdditionalPostInfoUseCase {

    private final ExternalServicePort externalServicePort;

    public GetAdditionalPostInfoUseCaseImpl(ExternalServicePort externalServicePort) {
        this.externalServicePort = externalServicePort;
    }

    @Override
    public AdditionalPostInfo getAdditionalPostInfo(Integer postId) {
        return externalServicePort.getAdditionalPostInfo(postId);
    }
}
