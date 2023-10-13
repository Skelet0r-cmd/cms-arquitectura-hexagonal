package cl.ufro.dci.cms.infrastructure.repositories;

import cl.ufro.dci.cms.infrastructure.entities.GrupoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaGrupoRepository extends JpaRepository<GrupoEntity, Integer> {
}
