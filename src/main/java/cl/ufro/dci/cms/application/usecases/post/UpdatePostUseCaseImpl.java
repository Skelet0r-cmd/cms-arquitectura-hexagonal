package cl.ufro.dci.cms.application.usecases.post;

import cl.ufro.dci.cms.domain.model.Post;
import cl.ufro.dci.cms.domain.ports.in.post.UpdatePostUseCase;
import cl.ufro.dci.cms.domain.ports.out.PostRepositoryPort;

import java.util.Optional;

public class UpdatePostUseCaseImpl implements UpdatePostUseCase {

    private final PostRepositoryPort postRepositoryPort;

    public UpdatePostUseCaseImpl(PostRepositoryPort postRepositoryPort) {
        this.postRepositoryPort = postRepositoryPort;
    }

    @Override
    public Optional<Post> updatePost(Integer id, Post updatedPost) {
        return postRepositoryPort.update(updatedPost);
    }
}
