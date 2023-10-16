package cl.ufro.dci.cms.infrastructure.repositories;


import cl.ufro.dci.cms.domain.model.Contenido;
import cl.ufro.dci.cms.domain.ports.out.ContenidoRepositoryPort;
import cl.ufro.dci.cms.infrastructure.entities.ContenidoEntity;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class JpaContenidoRepositoryAdapter implements ContenidoRepositoryPort {
    private final JpaContenidoRepository jpaContenidoRepository;

    public JpaContenidoRepositoryAdapter(JpaContenidoRepository jpaContenidoRepository) {
        this.jpaContenidoRepository = jpaContenidoRepository;
    }

    @Override
    public Contenido save(Contenido contenido) {
        ContenidoEntity contenidoEntity = ContenidoEntity.fromDomainModel(contenido);
        ContenidoEntity savedContenidoEntity =jpaContenidoRepository.save(contenidoEntity);
        return savedContenidoEntity.toDomainModel();
    }

    @Override
    public Optional<Contenido> findById(Integer id) {
        return jpaContenidoRepository.findById(id).map(ContenidoEntity::toDomainModel);
    }

    @Override
    public List<Contenido> findAll() {
        return jpaContenidoRepository.findAll().stream()
                .map(ContenidoEntity::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Contenido> update(Contenido contenido) {
        if (jpaContenidoRepository.existsById(contenido.getId())){
            ContenidoEntity comentarioEntity = ContenidoEntity.fromDomainModel(contenido);
            ContenidoEntity updatedComentarioEntity = jpaContenidoRepository.save(comentarioEntity);
            return Optional.of(updatedComentarioEntity.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Integer id) {
        if (jpaContenidoRepository.existsById(id)){
            jpaContenidoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
