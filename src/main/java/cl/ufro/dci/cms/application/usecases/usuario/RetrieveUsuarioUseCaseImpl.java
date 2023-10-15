package cl.ufro.dci.cms.application.usecases.usuario;

import cl.ufro.dci.cms.domain.model.Usuario;
import cl.ufro.dci.cms.domain.ports.in.usuario.CreateUsuarioUseCase;
import cl.ufro.dci.cms.domain.ports.in.usuario.RetrieveUsuarioUseCase;
import cl.ufro.dci.cms.domain.ports.out.UsuarioRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveUsuarioUseCaseImpl implements RetrieveUsuarioUseCase {

    private final UsuarioRepositoryPort usuarioRepositoryPort;

    public RetrieveUsuarioUseCaseImpl(UsuarioRepositoryPort usuarioRepositoryPort) {
        this.usuarioRepositoryPort = usuarioRepositoryPort;
    }

    @Override
    public Optional<Usuario> getUsuarioById(Integer id) {
        return usuarioRepositoryPort.findById(id);
    }

    @Override
    public List<Usuario> getAllUsuarios() {
        return usuarioRepositoryPort.findAll();
    }
}
