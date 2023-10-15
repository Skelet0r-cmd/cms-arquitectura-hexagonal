package cl.ufro.dci.cms.application.usecases.usuario;

import cl.ufro.dci.cms.domain.model.Usuario;
import cl.ufro.dci.cms.domain.ports.in.usuario.CreateUsuarioUseCase;
import cl.ufro.dci.cms.domain.ports.in.usuario.UpdateUsuarioUseCase;
import cl.ufro.dci.cms.domain.ports.out.UsuarioRepositoryPort;

import java.util.Optional;

public class UpdateUsuarioUseCaseImpl implements UpdateUsuarioUseCase {

    private final UsuarioRepositoryPort usuarioRepositoryPort;

    public UpdateUsuarioUseCaseImpl(UsuarioRepositoryPort usuarioRepositoryPort) {
        this.usuarioRepositoryPort = usuarioRepositoryPort;
    }

    @Override
    public Optional<Usuario> updateUsuario(Integer id, Usuario updatedUsuario) {
        return usuarioRepositoryPort.update(updatedUsuario);
    }
}
