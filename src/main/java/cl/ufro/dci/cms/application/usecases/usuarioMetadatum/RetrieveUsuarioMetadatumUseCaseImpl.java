package cl.ufro.dci.cms.application.usecases.usuarioMetadatum;

import cl.ufro.dci.cms.domain.model.UsuarioMetadatum;
import cl.ufro.dci.cms.domain.ports.in.usuarioMetadatum.CreateUsuarioMetadatumUseCase;
import cl.ufro.dci.cms.domain.ports.in.usuarioMetadatum.RetrieveUsuarioMetadatumUseCase;
import cl.ufro.dci.cms.domain.ports.out.UsuarioMetadatumRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveUsuarioMetadatumUseCaseImpl implements RetrieveUsuarioMetadatumUseCase {

    private final UsuarioMetadatumRepositoryPort usuarioMetadatumRepositoryPort;

    public RetrieveUsuarioMetadatumUseCaseImpl(UsuarioMetadatumRepositoryPort usuarioMetadatumRepositoryPort) {
        this.usuarioMetadatumRepositoryPort = usuarioMetadatumRepositoryPort;
    }

    @Override
    public Optional<UsuarioMetadatum> getUsuarioMetadatumById(Integer id) {
        return usuarioMetadatumRepositoryPort.findById(id);
    }

    @Override
    public List<UsuarioMetadatum> getAllUsuariosMetadatum() {
        return usuarioMetadatumRepositoryPort.findAll();
    }
}
