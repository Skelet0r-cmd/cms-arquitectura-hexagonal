package cl.ufro.dci.cms.domain.ports.in.postMetadatum;

import cl.ufro.dci.cms.domain.model.PostMetadatum;

import java.util.List;
import java.util.Optional;

public interface RetrievePostMetadatumUseCase {
    Optional<PostMetadatum> getPostMetadatumById (Integer id);
    List<PostMetadatum> getAllGPostsMetadatum();
}
