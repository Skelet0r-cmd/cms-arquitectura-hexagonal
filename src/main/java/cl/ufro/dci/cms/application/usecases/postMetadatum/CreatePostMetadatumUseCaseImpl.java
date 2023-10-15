package cl.ufro.dci.cms.application.usecases.postMetadatum;

import cl.ufro.dci.cms.domain.model.PostMetadatum;
import cl.ufro.dci.cms.domain.ports.in.postMetadatum.CreatePostMetadatumUseCase;
import cl.ufro.dci.cms.domain.ports.out.PostMetadatumRepositoryPort;

public class CreatePostMetadatumUseCaseImpl implements CreatePostMetadatumUseCase {

    private final PostMetadatumRepositoryPort postMetadatumRepositoryPort;

    public CreatePostMetadatumUseCaseImpl(PostMetadatumRepositoryPort postMetadatumRepositoryPort) {
        this.postMetadatumRepositoryPort = postMetadatumRepositoryPort;
    }

    @Override
    public PostMetadatum createPostMetadatum(PostMetadatum postMetadatum) {
        return postMetadatumRepositoryPort.save(postMetadatum);
    }
}
