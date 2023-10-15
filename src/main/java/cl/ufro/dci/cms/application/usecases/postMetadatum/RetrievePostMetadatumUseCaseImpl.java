package cl.ufro.dci.cms.application.usecases.postMetadatum;

import cl.ufro.dci.cms.domain.model.PostMetadatum;
import cl.ufro.dci.cms.domain.ports.in.postMetadatum.RetrievePostMetadatumUseCase;
import cl.ufro.dci.cms.domain.ports.out.PostMetadatumRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrievePostMetadatumUseCaseImpl implements RetrievePostMetadatumUseCase {

    private final PostMetadatumRepositoryPort postMetadatumRepositoryPort;

    public RetrievePostMetadatumUseCaseImpl(PostMetadatumRepositoryPort postMetadatumRepositoryPort) {
        this.postMetadatumRepositoryPort = postMetadatumRepositoryPort;
    }

    @Override
    public Optional<PostMetadatum> getPostMetadatumById(Integer id) {
        return postMetadatumRepositoryPort.findById(id);
    }

    @Override
    public List<PostMetadatum> getAllGPostsMetadatum() {
        return postMetadatumRepositoryPort.findAll();
    }
}
