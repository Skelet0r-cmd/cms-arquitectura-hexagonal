package cl.ufro.dci.cms.application.usecases.usuario;

import cl.ufro.dci.cms.domain.model.Usuario;
import cl.ufro.dci.cms.domain.ports.in.usuario.CreateUsuarioUseCase;
import cl.ufro.dci.cms.domain.ports.in.usuario.DeleteUsuarioUseCase;
import cl.ufro.dci.cms.domain.ports.out.UsuarioRepositoryPort;

public class DeleteUsuarioUseCaseImpl implements DeleteUsuarioUseCase {

    private final UsuarioRepositoryPort usuarioRepositoryPort;

    public DeleteUsuarioUseCaseImpl(UsuarioRepositoryPort usuarioRepositoryPort) {
        this.usuarioRepositoryPort = usuarioRepositoryPort;
    }

    @Override
    public boolean deleteUsuario(Integer id) {
        return usuarioRepositoryPort.deleteById(id);
    }
}
