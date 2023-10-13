package cl.ufro.dci.cms.infrastructure.repositories;

import cl.ufro.dci.cms.infrastructure.entities.ComentarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaComentarioRepository extends JpaRepository<ComentarioEntity, Integer> {
}
