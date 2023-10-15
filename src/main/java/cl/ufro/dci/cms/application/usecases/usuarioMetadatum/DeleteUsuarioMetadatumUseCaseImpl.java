package cl.ufro.dci.cms.application.usecases.usuarioMetadatum;

import cl.ufro.dci.cms.domain.model.UsuarioMetadatum;
import cl.ufro.dci.cms.domain.ports.in.usuarioMetadatum.CreateUsuarioMetadatumUseCase;
import cl.ufro.dci.cms.domain.ports.in.usuarioMetadatum.DeleteUsuarioMetadatumUseCase;
import cl.ufro.dci.cms.domain.ports.out.UsuarioMetadatumRepositoryPort;

public class DeleteUsuarioMetadatumUseCaseImpl implements DeleteUsuarioMetadatumUseCase {

    private final UsuarioMetadatumRepositoryPort usuarioMetadatumRepositoryPort;

    public DeleteUsuarioMetadatumUseCaseImpl(UsuarioMetadatumRepositoryPort usuarioMetadatumRepositoryPort) {
        this.usuarioMetadatumRepositoryPort = usuarioMetadatumRepositoryPort;
    }

    @Override
    public boolean deleteUsuarioMetadatum(Integer id) {
        return usuarioMetadatumRepositoryPort.deleteById(id);
    }
}
