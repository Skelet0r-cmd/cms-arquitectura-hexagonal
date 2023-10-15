package cl.ufro.dci.cms.domain.ports.in.usuario;

import cl.ufro.dci.cms.domain.model.Usuario;

import java.util.Optional;

public interface UpdateUsuarioUseCase {
    Optional<Usuario> updateUsuario (Integer id, Usuario updatedUsuario);
}
