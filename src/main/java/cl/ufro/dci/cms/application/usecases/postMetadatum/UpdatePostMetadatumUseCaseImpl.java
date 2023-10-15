package cl.ufro.dci.cms.application.usecases.postMetadatum;

import cl.ufro.dci.cms.domain.model.PostMetadatum;
import cl.ufro.dci.cms.domain.ports.in.postMetadatum.UpdatePostMetadatumUseCase;
import cl.ufro.dci.cms.domain.ports.out.PostMetadatumRepositoryPort;

import java.util.Optional;

public class UpdatePostMetadatumUseCaseImpl implements UpdatePostMetadatumUseCase {

    private final PostMetadatumRepositoryPort postMetadatumRepositoryPort;

    public UpdatePostMetadatumUseCaseImpl(PostMetadatumRepositoryPort postMetadatumRepositoryPort) {
        this.postMetadatumRepositoryPort = postMetadatumRepositoryPort;
    }

    @Override
    public Optional<PostMetadatum> updatePostMetadatum(Integer id, PostMetadatum updatedPostMetadatum) {
        return postMetadatumRepositoryPort.update(updatedPostMetadatum);
    }
}
