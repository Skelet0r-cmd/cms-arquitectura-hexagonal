package cl.ufro.dci.cms.application.usecases.post;

import cl.ufro.dci.cms.domain.model.Post;
import cl.ufro.dci.cms.domain.ports.in.post.DeletePostUseCase;
import cl.ufro.dci.cms.domain.ports.out.PostRepositoryPort;

public class DeletePostUseCaseImpl implements DeletePostUseCase {

    private final PostRepositoryPort postRepositoryPort;

    public DeletePostUseCaseImpl(PostRepositoryPort postRepositoryPort) {
        this.postRepositoryPort = postRepositoryPort;
    }

    @Override
    public boolean deletePost(Integer id) {
        return postRepositoryPort.deleteById(id);
    }
}
