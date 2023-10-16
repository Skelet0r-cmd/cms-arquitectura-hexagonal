package cl.ufro.dci.cms.infrastructure.repositories;

import cl.ufro.dci.cms.infrastructure.entities.CategoriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaCategoriaRepository extends JpaRepository<CategoriaEntity, Integer> {
}
