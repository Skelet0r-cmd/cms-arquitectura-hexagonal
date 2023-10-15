package cl.ufro.dci.cms.application.usecases.post;

import cl.ufro.dci.cms.domain.model.Post;
import cl.ufro.dci.cms.domain.ports.in.post.CreatePostUseCase;
import cl.ufro.dci.cms.domain.ports.out.PostRepositoryPort;

public class CreatePostUseCaseImpl implements CreatePostUseCase {

    private final PostRepositoryPort postRepositoryPort;

    public CreatePostUseCaseImpl(PostRepositoryPort postRepositoryPort) {
        this.postRepositoryPort = postRepositoryPort;
    }

    @Override
    public Post createPost(Post post) {
        return postRepositoryPort.save(post);
    }
}
