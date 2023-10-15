package cl.ufro.dci.cms.domain.ports.in.post;

import cl.ufro.dci.cms.domain.model.Post;

import java.util.List;
import java.util.Optional;

public interface RetrievePostUseCase {
    Optional<Post> getPostById (Integer id);
    List<Post> getAllGPosts();
}
