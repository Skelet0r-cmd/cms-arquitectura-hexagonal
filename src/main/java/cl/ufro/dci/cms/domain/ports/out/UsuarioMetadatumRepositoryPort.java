package cl.ufro.dci.cms.domain.ports.out;

import cl.ufro.dci.cms.domain.model.Usuario;
import cl.ufro.dci.cms.domain.model.UsuarioMetadatum;

import java.util.List;
import java.util.Optional;

public interface UsuarioMetadatumRepositoryPort {
    UsuarioMetadatum save(UsuarioMetadatum usuarioMetadatum);
    Optional<UsuarioMetadatum> findById(Integer id);
    List<UsuarioMetadatum> findAll();
    Optional<UsuarioMetadatum> update(UsuarioMetadatum usuarioMetadatum);
    boolean deleteById(Integer id);
}
