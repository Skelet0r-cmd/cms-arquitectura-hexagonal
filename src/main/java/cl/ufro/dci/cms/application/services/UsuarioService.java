package cl.ufro.dci.cms.application.services;

import cl.ufro.dci.cms.domain.model.AdditionalUsuarioInfo;
import cl.ufro.dci.cms.domain.model.Usuario;
import cl.ufro.dci.cms.domain.ports.in.usuario.*;
import cl.ufro.dci.cms.domain.ports.out.ExternalServicePort;
import org.hibernate.sql.Update;

import java.util.List;
import java.util.Optional;

public class UsuarioService implements CreateUsuarioUseCase, DeleteUsuarioUseCase,
        GetAdditionalUsuarioInfoUseCase, RetrieveUsuarioUseCase, UpdateUsuarioUseCase {
    private final CreateUsuarioUseCase createUsuarioUseCase;
    private final DeleteUsuarioUseCase deleteUsuarioUseCase;
    private final ExternalServicePort externalServicePort;
    private final RetrieveUsuarioUseCase retrieveUsuarioUseCase;
    private final UpdateUsuarioUseCase updateUsuarioUseCase;

    public UsuarioService(CreateUsuarioUseCase createUsuarioUseCase, DeleteUsuarioUseCase deleteUsuarioUseCase,
                          ExternalServicePort externalServicePort, RetrieveUsuarioUseCase retrieveUsuarioUseCase,
                          UpdateUsuarioUseCase updateUsuarioUseCase) {
        this.createUsuarioUseCase = createUsuarioUseCase;
        this.deleteUsuarioUseCase = deleteUsuarioUseCase;
        this.externalServicePort = externalServicePort;
        this.retrieveUsuarioUseCase = retrieveUsuarioUseCase;
        this.updateUsuarioUseCase = updateUsuarioUseCase;
    }

    @Override
    public Usuario createUsuario(Usuario usuario) {
        return createUsuarioUseCase.createUsuario(usuario);
    }

    @Override
    public boolean deleteUsuario(Integer id) {
        return deleteUsuarioUseCase.deleteUsuario(id);
    }

    @Override
    public AdditionalUsuarioInfo getAdditionalUsuarioInfo(Integer usuarioId) {
        return externalServicePort.getAdditionalUsuarioInfo(usuarioId);
    }

    @Override
    public Optional<Usuario> getUsuarioById(Integer id) {
        return retrieveUsuarioUseCase.getUsuarioById(id);
    }

    @Override
    public List<Usuario> getAllUsuarios() {
        return retrieveUsuarioUseCase.getAllUsuarios();
    }

    @Override
    public Optional<Usuario> updateUsuario(Integer id, Usuario updatedUsuario) {
        return updateUsuarioUseCase.updateUsuario(id,updatedUsuario);
    }
}
