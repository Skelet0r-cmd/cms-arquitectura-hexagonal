package cl.ufro.dci.cms.infrastructure.repositories;

import cl.ufro.dci.cms.domain.model.GrupoPermiso;
import cl.ufro.dci.cms.domain.ports.out.GrupoPermisoRepositoryPort;
import cl.ufro.dci.cms.infrastructure.entities.GrupoPermisoEntity;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class JpaGrupoPermisoRepositoryAdapter implements GrupoPermisoRepositoryPort {
    private final JpaGrupoPermisoRepository jpaGrupoPermisoRepository;

    public JpaGrupoPermisoRepositoryAdapter(JpaGrupoPermisoRepository jpaGrupoPermisoRepository) {
        this.jpaGrupoPermisoRepository = jpaGrupoPermisoRepository;
    }

    @Override
    public GrupoPermiso save(GrupoPermiso grupoPermiso) {
        GrupoPermisoEntity grupoPermisoEntity = GrupoPermisoEntity.fromDomainModel(grupoPermiso);
        GrupoPermisoEntity savedGrupoPermisoEntity =jpaGrupoPermisoRepository.save(grupoPermisoEntity);
        return savedGrupoPermisoEntity.toDomainModel();
    }

    @Override
    public Optional<GrupoPermiso> findById(Integer id) {
        return jpaGrupoPermisoRepository.findById(id).map(GrupoPermisoEntity::toDomainModel);
    }

    @Override
    public List<GrupoPermiso> findAll() {
        return jpaGrupoPermisoRepository.findAll().stream()
                .map(GrupoPermisoEntity::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<GrupoPermiso> update(GrupoPermiso grupoPermiso) {
        if (jpaGrupoPermisoRepository.existsById(grupoPermiso.getId())){
            GrupoPermisoEntity comentarioEntity = GrupoPermisoEntity.fromDomainModel(grupoPermiso);
            GrupoPermisoEntity updatedComentarioEntity = jpaGrupoPermisoRepository.save(comentarioEntity);
            return Optional.of(updatedComentarioEntity.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Integer id) {
        if (jpaGrupoPermisoRepository.existsById(id)){
            jpaGrupoPermisoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
