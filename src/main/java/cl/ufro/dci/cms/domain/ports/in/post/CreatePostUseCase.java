package cl.ufro.dci.cms.domain.ports.in.post;

import cl.ufro.dci.cms.domain.model.Post;

public interface CreatePostUseCase {
    Post createPost(Post post);
}
