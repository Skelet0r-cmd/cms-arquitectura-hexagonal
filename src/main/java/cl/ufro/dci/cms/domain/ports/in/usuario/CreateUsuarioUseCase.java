package cl.ufro.dci.cms.domain.ports.in.usuario;

import cl.ufro.dci.cms.domain.model.Usuario;

public interface CreateUsuarioUseCase {
    Usuario createUsuario(Usuario usuario);
}
