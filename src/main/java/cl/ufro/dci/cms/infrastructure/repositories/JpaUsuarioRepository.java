package cl.ufro.dci.cms.infrastructure.repositories;

import cl.ufro.dci.cms.infrastructure.entities.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaUsuarioRepository extends JpaRepository<UsuarioEntity, Integer> {
}
