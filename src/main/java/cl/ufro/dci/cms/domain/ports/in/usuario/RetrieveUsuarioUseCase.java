package cl.ufro.dci.cms.domain.ports.in.usuario;

import cl.ufro.dci.cms.domain.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface RetrieveUsuarioUseCase {
    Optional<Usuario> getUsuarioById (Integer id);
    List<Usuario> getAllUsuarios();
}
