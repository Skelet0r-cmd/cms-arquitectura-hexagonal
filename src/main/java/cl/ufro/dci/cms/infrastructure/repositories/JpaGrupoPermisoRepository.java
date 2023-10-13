package cl.ufro.dci.cms.infrastructure.repositories;

import cl.ufro.dci.cms.infrastructure.entities.GrupoPermisoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaGrupoPermisoRepository extends JpaRepository<GrupoPermisoEntity, Integer> {
}
