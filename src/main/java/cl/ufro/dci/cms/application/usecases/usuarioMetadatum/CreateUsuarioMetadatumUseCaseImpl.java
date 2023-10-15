package cl.ufro.dci.cms.application.usecases.usuarioMetadatum;

import cl.ufro.dci.cms.domain.model.UsuarioMetadatum;
import cl.ufro.dci.cms.domain.ports.in.usuarioMetadatum.CreateUsuarioMetadatumUseCase;
import cl.ufro.dci.cms.domain.ports.out.UsuarioMetadatumRepositoryPort;

public class CreateUsuarioMetadatumUseCaseImpl implements CreateUsuarioMetadatumUseCase {

    private final UsuarioMetadatumRepositoryPort usuarioMetadatumRepositoryPort;

    public CreateUsuarioMetadatumUseCaseImpl(UsuarioMetadatumRepositoryPort usuarioMetadatumRepositoryPort) {
        this.usuarioMetadatumRepositoryPort = usuarioMetadatumRepositoryPort;
    }

    @Override
    public UsuarioMetadatum createUsuarioMetadatum(UsuarioMetadatum usuarioMetadatum) {
        return usuarioMetadatumRepositoryPort.save(usuarioMetadatum);
    }
}
