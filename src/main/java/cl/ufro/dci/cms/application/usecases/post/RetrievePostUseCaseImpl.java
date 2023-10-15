 package cl.ufro.dci.cms.application.usecases.post;

import cl.ufro.dci.cms.domain.model.Post;
import cl.ufro.dci.cms.domain.ports.in.post.RetrievePostUseCase;
import cl.ufro.dci.cms.domain.ports.out.PostRepositoryPort;

import java.util.List;
import java.util.Optional;

 public class RetrievePostUseCaseImpl implements RetrievePostUseCase {

    private final PostRepositoryPort postRepositoryPort;

    public RetrievePostUseCaseImpl(PostRepositoryPort postRepositoryPort) {
        this.postRepositoryPort = postRepositoryPort;
    }

     @Override
     public Optional<Post> getPostById(Integer id) {
         return postRepositoryPort.findById(id);
     }

     @Override
     public List<Post> getAllGPosts() {
         return postRepositoryPort.findAll();
     }
 }
