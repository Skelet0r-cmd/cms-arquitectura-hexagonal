package cl.ufro.dci.cms.domain.ports.in.post;

import cl.ufro.dci.cms.domain.model.Post;

import java.util.Optional;

public interface UpdatePostUseCase {
    Optional<Post> updatePost (Integer id, Post updatePost);
}
