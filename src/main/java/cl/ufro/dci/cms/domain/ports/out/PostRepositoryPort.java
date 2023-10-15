package cl.ufro.dci.cms.domain.ports.out;

import cl.ufro.dci.cms.domain.model.Post;

import java.util.List;
import java.util.Optional;

public interface PostRepositoryPort {
    Post save(Post post);
    Optional<Post> findById(Integer id);
    List<Post> findAll();
    Optional<Post> update(Post post);
    boolean deleteById(Integer id);
}
