package cl.ufro.dci.cms.infrastructure.repositories;

import cl.ufro.dci.cms.domain.model.UsuarioMetadatum;
import cl.ufro.dci.cms.domain.ports.out.UsuarioMetadatumRepositoryPort;
import cl.ufro.dci.cms.infrastructure.entities.UsuarioMetadatumEntity;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class JpaUsuarioMetadatumRepositoryAdapter implements UsuarioMetadatumRepositoryPort {
    private final  JpaUsuarioMetadatumRepository jpaUsuarioMetadatumRepository;

    public JpaUsuarioMetadatumRepositoryAdapter(JpaUsuarioMetadatumRepository jpaUsuarioMetadatumRepository) {
        this.jpaUsuarioMetadatumRepository = jpaUsuarioMetadatumRepository;
    }

    @Override
    public UsuarioMetadatum save(UsuarioMetadatum usuarioMetadatum) {
        UsuarioMetadatumEntity usuarioMetadatumEntity = UsuarioMetadatumEntity.fromDomainModel(usuarioMetadatum);
        UsuarioMetadatumEntity savedUsuarioMetadatumEntity = jpaUsuarioMetadatumRepository.save(usuarioMetadatumEntity);
        return savedUsuarioMetadatumEntity.toDomainModel();
    }

    @Override
    public Optional<UsuarioMetadatum> findById(Integer id) {
        return jpaUsuarioMetadatumRepository.findById(id).map(UsuarioMetadatumEntity::toDomainModel);
    }

    @Override
    public List<UsuarioMetadatum> findAll() {
        return jpaUsuarioMetadatumRepository.findAll().stream()
                .map(UsuarioMetadatumEntity::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<UsuarioMetadatum> update(UsuarioMetadatum usuarioMetadatum) {
        if (jpaUsuarioMetadatumRepository.existsById(usuarioMetadatum.getId())){
            UsuarioMetadatumEntity usuarioMetadatumEntity = UsuarioMetadatumEntity.fromDomainModel(usuarioMetadatum);
            UsuarioMetadatumEntity updatedUsuarioMetadatumEntity = jpaUsuarioMetadatumRepository.save(usuarioMetadatumEntity);
            return Optional.of(updatedUsuarioMetadatumEntity.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Integer id) {
        if (jpaUsuarioMetadatumRepository.existsById(id)){
            jpaUsuarioMetadatumRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
