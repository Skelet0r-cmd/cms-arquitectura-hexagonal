package cl.ufro.dci.cms.domain.ports.out;

import cl.ufro.dci.cms.domain.model.PostMetadatum;

import java.util.List;
import java.util.Optional;

public interface PostMetadatumRepositoryPort {
    PostMetadatum save(PostMetadatum postMetadatum);
    Optional<PostMetadatum> findById(Integer id);
    List<PostMetadatum> findAll();
    Optional<PostMetadatum> update(PostMetadatum postMetadatum);
    boolean deleteById(Integer id);
}
