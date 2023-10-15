package cl.ufro.dci.cms.application.usecases.postMetadatum;

import cl.ufro.dci.cms.domain.ports.in.postMetadatum.DeletePostMetadatumUseCase;
import cl.ufro.dci.cms.domain.ports.out.PostMetadatumRepositoryPort;

public class DeletePostMetadatumUseCaseImpl implements DeletePostMetadatumUseCase {

    private final PostMetadatumRepositoryPort postMetadatumRepositoryPort;

    public DeletePostMetadatumUseCaseImpl(PostMetadatumRepositoryPort postMetadatumRepositoryPort) {
        this.postMetadatumRepositoryPort = postMetadatumRepositoryPort;
    }

    @Override
    public boolean deletePostMetadatum(Integer id) {
        return postMetadatumRepositoryPort.deleteById(id);
    }
}
