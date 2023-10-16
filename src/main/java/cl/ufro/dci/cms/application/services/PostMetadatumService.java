package cl.ufro.dci.cms.application.services;

import cl.ufro.dci.cms.domain.model.PostMetadatum;
import cl.ufro.dci.cms.domain.ports.in.postMetadatum.CreatePostMetadatumUseCase;
import cl.ufro.dci.cms.domain.ports.in.postMetadatum.DeletePostMetadatumUseCase;
import cl.ufro.dci.cms.domain.ports.in.postMetadatum.RetrievePostMetadatumUseCase;
import cl.ufro.dci.cms.domain.ports.in.postMetadatum.UpdatePostMetadatumUseCase;

import java.util.List;
import java.util.Optional;

public class PostMetadatumService implements CreatePostMetadatumUseCase, DeletePostMetadatumUseCase,
         RetrievePostMetadatumUseCase, UpdatePostMetadatumUseCase {
    private final CreatePostMetadatumUseCase createPostMetadatumUseCase;
    private final DeletePostMetadatumUseCase deletePostMetadatumUseCase;
    private final RetrievePostMetadatumUseCase retrievePostMetadatumUseCase;
    private final UpdatePostMetadatumUseCase updatePostMetadatumUseCase;

    public PostMetadatumService(CreatePostMetadatumUseCase createPostMetadatumUseCase,
                                DeletePostMetadatumUseCase deletePostMetadatumUseCase,
                                RetrievePostMetadatumUseCase retrievePostMetadatumUseCase,
                                UpdatePostMetadatumUseCase updatePostMetadatumUseCase) {
        this.createPostMetadatumUseCase = createPostMetadatumUseCase;
        this.deletePostMetadatumUseCase = deletePostMetadatumUseCase;
        this.retrievePostMetadatumUseCase = retrievePostMetadatumUseCase;
        this.updatePostMetadatumUseCase = updatePostMetadatumUseCase;
    }

    @Override
    public PostMetadatum createPostMetadatum(PostMetadatum postMetadatum) {
        return createPostMetadatumUseCase.createPostMetadatum(postMetadatum);
    }

    @Override
    public boolean deletePostMetadatum(Integer id) {
        return deletePostMetadatumUseCase.deletePostMetadatum(id);
    }

    @Override
    public Optional<PostMetadatum> getPostMetadatumById(Integer id) {
        return retrievePostMetadatumUseCase.getPostMetadatumById(id);
    }

    @Override
    public List<PostMetadatum> getAllGPostsMetadatum() {
        return retrievePostMetadatumUseCase.getAllGPostsMetadatum();
    }

    @Override
    public Optional<PostMetadatum> updatePostMetadatum(Integer id, PostMetadatum updatedPostMetadatum) {
        return updatePostMetadatumUseCase.updatePostMetadatum(id,updatedPostMetadatum);
    }
}
