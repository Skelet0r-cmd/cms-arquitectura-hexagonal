package cl.ufro.dci.cms.infrastructure.repositories;

import cl.ufro.dci.cms.infrastructure.entities.PermisoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaPermisoRepository extends JpaRepository<PermisoEntity, Integer> {
}
