package cl.ufro.dci.cms.domain.ports.in.postMetadatum;

import cl.ufro.dci.cms.domain.model.PostMetadatum;

public interface CreatePostMetadatumUseCase {
    PostMetadatum createPostMetadatum(PostMetadatum postMetadatum);
}
