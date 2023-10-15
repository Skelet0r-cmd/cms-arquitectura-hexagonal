package cl.ufro.dci.cms.domain.ports.out;

import cl.ufro.dci.cms.domain.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioRepositoryPort {
    Usuario save(Usuario usuario);
    Optional<Usuario> findById(Integer id);
    List<Usuario> findAll();
    Optional<Usuario> update(Usuario usuario);
    boolean deleteById(Integer id);
}
