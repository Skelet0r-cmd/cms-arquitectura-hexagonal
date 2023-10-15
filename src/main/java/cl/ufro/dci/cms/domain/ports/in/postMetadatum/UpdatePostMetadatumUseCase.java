package cl.ufro.dci.cms.domain.ports.in.postMetadatum;

import cl.ufro.dci.cms.domain.model.PostMetadatum;

import java.util.Optional;

public interface UpdatePostMetadatumUseCase {
    Optional<PostMetadatum> updatePostMetadatum (Integer id, PostMetadatum updatedPostMetadatum);
}
