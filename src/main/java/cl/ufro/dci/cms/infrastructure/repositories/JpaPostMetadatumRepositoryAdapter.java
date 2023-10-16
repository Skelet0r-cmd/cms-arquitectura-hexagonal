package cl.ufro.dci.cms.infrastructure.repositories;

import cl.ufro.dci.cms.domain.model.PostMetadatum;
import cl.ufro.dci.cms.domain.ports.out.PostMetadatumRepositoryPort;
import cl.ufro.dci.cms.infrastructure.entities.PostMetadatumEntity;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class JpaPostMetadatumRepositoryAdapter implements PostMetadatumRepositoryPort {
    private final  JpaPostMetadatumRepository jpaPostMetadatumRepository;

    public JpaPostMetadatumRepositoryAdapter(JpaPostMetadatumRepository jpaPostMetadatumRepository) {
        this.jpaPostMetadatumRepository = jpaPostMetadatumRepository;
    }

    @Override
    public PostMetadatum save(PostMetadatum postMetadatum) {
        PostMetadatumEntity postMetadatumEntity = PostMetadatumEntity.fromDomainModel(postMetadatum);
        PostMetadatumEntity savedPostMetadatumEntity =jpaPostMetadatumRepository.save(postMetadatumEntity);
        return savedPostMetadatumEntity.toDomainModel();
    }

    @Override
    public Optional<PostMetadatum> findById(Integer id) {
        return jpaPostMetadatumRepository.findById(id).map(PostMetadatumEntity::toDomainModel);
    }

    @Override
    public List<PostMetadatum> findAll() {
        return jpaPostMetadatumRepository.findAll().stream()
                .map(PostMetadatumEntity::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<PostMetadatum> update(PostMetadatum postMetadatum) {
        if (jpaPostMetadatumRepository.existsById(postMetadatum.getId())){
            PostMetadatumEntity grupoEntity = PostMetadatumEntity.fromDomainModel(postMetadatum);
            PostMetadatumEntity updatedGrupoEntity = jpaPostMetadatumRepository.save(grupoEntity);
            return Optional.of(updatedGrupoEntity.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Integer id) {
        if (jpaPostMetadatumRepository.existsById(id)){
            jpaPostMetadatumRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
