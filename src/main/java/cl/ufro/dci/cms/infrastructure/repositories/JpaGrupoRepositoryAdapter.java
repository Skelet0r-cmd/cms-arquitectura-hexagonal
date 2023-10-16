package cl.ufro.dci.cms.infrastructure.repositories;

import cl.ufro.dci.cms.domain.model.Grupo;
import cl.ufro.dci.cms.domain.ports.out.GrupoRepositoryPort;
import cl.ufro.dci.cms.infrastructure.entities.GrupoEntity;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class JpaGrupoRepositoryAdapter implements GrupoRepositoryPort {
    private final JpaGrupoRepository jpaGrupoRepository;

    public JpaGrupoRepositoryAdapter(JpaGrupoRepository jpaGrupoRepository) {
        this.jpaGrupoRepository = jpaGrupoRepository;
    }

    @Override
    public Grupo save(Grupo grupo) {
        GrupoEntity grupoEntity = GrupoEntity.fromDomainModel(grupo);
        GrupoEntity savedGrupoEntity =jpaGrupoRepository.save(grupoEntity);
        return savedGrupoEntity.toDomainModel();
    }

    @Override
    public Optional<Grupo> findById(Integer id) {
        return jpaGrupoRepository.findById(id).map(GrupoEntity::toDomainModel);
    }

    @Override
    public List<Grupo> findAll() {
        return jpaGrupoRepository.findAll().stream()
                .map(GrupoEntity::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Grupo> update(Grupo grupo) {
        if (jpaGrupoRepository.existsById(grupo.getId())){
            GrupoEntity grupoEntity = GrupoEntity.fromDomainModel(grupo);
            GrupoEntity updatedGrupoEntity = jpaGrupoRepository.save(grupoEntity);
            return Optional.of(updatedGrupoEntity.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Integer id) {
        if (jpaGrupoRepository.existsById(id)){
            jpaGrupoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
