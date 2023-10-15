package cl.ufro.dci.cms.application.usecases.usuario;

import cl.ufro.dci.cms.domain.model.Usuario;
import cl.ufro.dci.cms.domain.ports.in.usuario.CreateUsuarioUseCase;
import cl.ufro.dci.cms.domain.ports.out.UsuarioRepositoryPort;

public class CreateUsuarioUseCaseImpl implements CreateUsuarioUseCase {

    private final UsuarioRepositoryPort usuarioRepositoryPort;

    public CreateUsuarioUseCaseImpl(UsuarioRepositoryPort usuarioRepositoryPort) {
        this.usuarioRepositoryPort = usuarioRepositoryPort;
    }

    @Override
    public Usuario createUsuario(Usuario usuario) {
        return usuarioRepositoryPort.save(usuario);
    }
}
