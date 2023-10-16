package cl.ufro.dci.cms.application.services;

import cl.ufro.dci.cms.domain.model.AdditionalPostInfo;
import cl.ufro.dci.cms.domain.model.Post;
import cl.ufro.dci.cms.domain.ports.in.post.*;
import cl.ufro.dci.cms.domain.ports.out.ExternalServicePort;

import java.util.List;
import java.util.Optional;

public class PostService implements CreatePostUseCase, DeletePostUseCase,
        cl.ufro.dci.cms.domain.ports.in.post.GetAdditionalPostInfoUseCase, RetrievePostUseCase, UpdatePostUseCase {
    private final CreatePostUseCase createPostUseCase;
    private final DeletePostUseCase deletePostUseCase;
    private final GetAdditionalPostInfoUseCase getAdditionalPostInfoUseCase;
    private final RetrievePostUseCase retrievePostUseCase;
    private final UpdatePostUseCase updatePostUseCase;

    public PostService(CreatePostUseCase createPostUseCase, DeletePostUseCase deletePostUseCase,
                       GetAdditionalPostInfoUseCase getAdditionalPostInfoUseCase, RetrievePostUseCase retrievePostUseCase,
                       UpdatePostUseCase updatePostUseCase) {
        this.createPostUseCase = createPostUseCase;
        this.deletePostUseCase = deletePostUseCase;
        this.getAdditionalPostInfoUseCase = getAdditionalPostInfoUseCase;
        this.retrievePostUseCase = retrievePostUseCase;
        this.updatePostUseCase = updatePostUseCase;
    }

    @Override
    public Post createPost(Post post) {
        return createPostUseCase.createPost(post);
    }

    @Override
    public boolean deletePost(Integer id) {
        return deletePostUseCase.deletePost(id);
    }

    @Override
    public AdditionalPostInfo getAdditionalPostInfo(Integer postId) {
        return getAdditionalPostInfoUseCase.getAdditionalPostInfo(postId);
    }

    @Override
    public Optional<Post> getPostById(Integer id) {
        return retrievePostUseCase.getPostById(id);
    }

    @Override
    public List<Post> getAllGPosts() {
        return retrievePostUseCase.getAllGPosts();
    }

    @Override
    public Optional<Post> updatePost(Integer id, Post updatedPost) {
        return updatePostUseCase.updatePost(id,updatedPost);
    }
}
