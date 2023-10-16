package cl.ufro.dci.cms.infrastructure.repositories;

import cl.ufro.dci.cms.infrastructure.entities.PostMetadatumEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaPostMetadatumRepository extends JpaRepository<PostMetadatumEntity, Integer> {
}
