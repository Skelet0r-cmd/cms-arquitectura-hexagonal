package cl.ufro.dci.cms.infrastructure.repositories;

import cl.ufro.dci.cms.infrastructure.entities.ContenidoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaContenidoRepository extends JpaRepository<ContenidoEntity, Integer> {
}
