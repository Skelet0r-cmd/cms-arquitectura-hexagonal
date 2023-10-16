package cl.ufro.dci.cms.infrastructure.repositories;

import cl.ufro.dci.cms.domain.model.Comentario;
import cl.ufro.dci.cms.domain.ports.out.ComentarioRepositoryPort;
import cl.ufro.dci.cms.infrastructure.entities.ComentarioEntity;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class JpaComentarioRepositoryAdapter implements ComentarioRepositoryPort {
    private final JpaComentarioRepository jpaComentarioRepository;

    public JpaComentarioRepositoryAdapter(JpaComentarioRepository jpaComentarioRepository) {
        this.jpaComentarioRepository = jpaComentarioRepository;
    }

    @Override
    public Comentario save(Comentario comentario) {
        ComentarioEntity comentarioEntity = ComentarioEntity.fromDomainModel(comentario);
        ComentarioEntity savedComentarioEntity =jpaComentarioRepository.save(comentarioEntity);
        return savedComentarioEntity.toDomainModel();
    }

    @Override
    public Optional<Comentario> findById(Integer id) {
        return jpaComentarioRepository.findById(id).map(ComentarioEntity::toDomainModel);
    }

    @Override
    public List<Comentario> findAll() {
        return jpaComentarioRepository.findAll().stream()
                .map(ComentarioEntity::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Comentario> update(Comentario comentario) {
        if (jpaComentarioRepository.existsById(comentario.getId())){
            ComentarioEntity comentarioEntity = ComentarioEntity.fromDomainModel(comentario);
            ComentarioEntity updatedComentarioEntity = jpaComentarioRepository.save(comentarioEntity);
            return Optional.of(updatedComentarioEntity.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Integer id) {
        if (jpaComentarioRepository.existsById(id)){
            jpaComentarioRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
