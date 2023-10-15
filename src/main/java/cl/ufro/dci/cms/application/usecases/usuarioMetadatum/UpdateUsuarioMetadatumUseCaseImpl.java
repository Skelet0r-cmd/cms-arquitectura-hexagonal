package cl.ufro.dci.cms.application.usecases.usuarioMetadatum;

import cl.ufro.dci.cms.domain.model.UsuarioMetadatum;
import cl.ufro.dci.cms.domain.ports.in.usuarioMetadatum.CreateUsuarioMetadatumUseCase;
import cl.ufro.dci.cms.domain.ports.in.usuarioMetadatum.UpdateUsuarioMetadatumUseCase;
import cl.ufro.dci.cms.domain.ports.out.UsuarioMetadatumRepositoryPort;

import java.util.Optional;

public class UpdateUsuarioMetadatumUseCaseImpl implements UpdateUsuarioMetadatumUseCase {

    private final UsuarioMetadatumRepositoryPort usuarioMetadatumRepositoryPort;

    public UpdateUsuarioMetadatumUseCaseImpl(UsuarioMetadatumRepositoryPort usuarioMetadatumRepositoryPort) {
        this.usuarioMetadatumRepositoryPort = usuarioMetadatumRepositoryPort;
    }

    @Override
    public Optional<UsuarioMetadatum> updateUsuarioMetadatum(Integer id, UsuarioMetadatum updatedUsuarioMetadatum) {
        return usuarioMetadatumRepositoryPort.update(updatedUsuarioMetadatum);
    }
}
