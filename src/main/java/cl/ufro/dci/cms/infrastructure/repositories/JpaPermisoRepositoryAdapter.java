package cl.ufro.dci.cms.infrastructure.repositories;

import cl.ufro.dci.cms.domain.model.Permiso;
import cl.ufro.dci.cms.domain.ports.out.PermisoRepositoryPort;
import cl.ufro.dci.cms.infrastructure.entities.PermisoEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Component
public class JpaPermisoRepositoryAdapter implements PermisoRepositoryPort {
    private final  JpaPermisoRepository jpaPermisoRepository;

    public JpaPermisoRepositoryAdapter(JpaPermisoRepository jpaPermisoRepository) {
        this.jpaPermisoRepository = jpaPermisoRepository;
    }

    @Override
    public Permiso save(Permiso permiso) {
        PermisoEntity permisoEntity = PermisoEntity.fromDomainModel(permiso);
        PermisoEntity savedPermisoEntity =jpaPermisoRepository.save(permisoEntity);
        return savedPermisoEntity.toDomainModel();
    }

    @Override
    public Optional<Permiso> findById(Integer id) {
        return jpaPermisoRepository.findById(id).map(PermisoEntity::toDomainModel);
    }

    @Override
    public List<Permiso> findAll() {
        return jpaPermisoRepository.findAll().stream()
                .map(PermisoEntity::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Permiso> update(Permiso permiso) {
        if (jpaPermisoRepository.existsById(permiso.getId())){
            PermisoEntity grupoEntity = PermisoEntity.fromDomainModel(permiso);
            PermisoEntity updatedGrupoEntity = jpaPermisoRepository.save(grupoEntity);
            return Optional.of(updatedGrupoEntity.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Integer id) {
        if (jpaPermisoRepository.existsById(id)){
            jpaPermisoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
