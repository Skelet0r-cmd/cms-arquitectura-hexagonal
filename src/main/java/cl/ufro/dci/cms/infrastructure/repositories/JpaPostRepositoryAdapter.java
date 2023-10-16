package cl.ufro.dci.cms.infrastructure.repositories;

import cl.ufro.dci.cms.domain.model.Post;
import cl.ufro.dci.cms.domain.ports.out.PostRepositoryPort;
import cl.ufro.dci.cms.infrastructure.entities.PostEntity;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class JpaPostRepositoryAdapter implements PostRepositoryPort {
    private final  JpaPostRepository jpaPostRepository;

    public JpaPostRepositoryAdapter(JpaPostRepository jpaPostRepository) {
        this.jpaPostRepository = jpaPostRepository;
    }

    @Override
    public Post save(Post post) {
        PostEntity postEntity = PostEntity.fromDomainModel(post);
        PostEntity savedPostEntity =jpaPostRepository.save(postEntity);
        return savedPostEntity.toDomainModel();
    }

    @Override
    public Optional<Post> findById(Integer id) {
        return jpaPostRepository.findById(id).map(PostEntity::toDomainModel);
    }

    @Override
    public List<Post> findAll() {
        return jpaPostRepository.findAll().stream()
                .map(PostEntity::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Post> update(Post post) {
        if (jpaPostRepository.existsById(post.getId())){
            PostEntity postEntity = PostEntity.fromDomainModel(post);
            PostEntity updatedPostEntity = jpaPostRepository.save(postEntity);
            return Optional.of(updatedPostEntity.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Integer id) {
        if (jpaPostRepository.existsById(id)){
            jpaPostRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
