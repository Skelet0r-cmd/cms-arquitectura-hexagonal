package cl.ufro.dci.cms.application.services;

import cl.ufro.dci.cms.domain.model.UsuarioMetadatum;
import cl.ufro.dci.cms.domain.ports.in.usuarioMetadatum.CreateUsuarioMetadatumUseCase;
import cl.ufro.dci.cms.domain.ports.in.usuarioMetadatum.DeleteUsuarioMetadatumUseCase;
import cl.ufro.dci.cms.domain.ports.in.usuarioMetadatum.RetrieveUsuarioMetadatumUseCase;
import cl.ufro.dci.cms.domain.ports.in.usuarioMetadatum.UpdateUsuarioMetadatumUseCase;

import java.util.List;
import java.util.Optional;

public class UsuarioMetadatumService implements CreateUsuarioMetadatumUseCase, DeleteUsuarioMetadatumUseCase,
        RetrieveUsuarioMetadatumUseCase, UpdateUsuarioMetadatumUseCase {
    private final CreateUsuarioMetadatumUseCase createUsuarioMetadatumUseCase;
    private final DeleteUsuarioMetadatumUseCase deleteUsuarioMetadatumUseCase;
    private final RetrieveUsuarioMetadatumUseCase retrieveUsuarioMetadatumUseCase;
    private final UpdateUsuarioMetadatumUseCase updateUsuarioMetadatumUseCase;

    public UsuarioMetadatumService(CreateUsuarioMetadatumUseCase createUsuarioMetadatumUseCase,
                                   DeleteUsuarioMetadatumUseCase deleteUsuarioMetadatumUseCase,
                                   RetrieveUsuarioMetadatumUseCase retrieveUsuarioMetadatumUseCase,
                                   UpdateUsuarioMetadatumUseCase updateUsuarioMetadatumUseCase) {
        this.createUsuarioMetadatumUseCase = createUsuarioMetadatumUseCase;
        this.deleteUsuarioMetadatumUseCase = deleteUsuarioMetadatumUseCase;
        this.retrieveUsuarioMetadatumUseCase = retrieveUsuarioMetadatumUseCase;
        this.updateUsuarioMetadatumUseCase = updateUsuarioMetadatumUseCase;
    }

    @Override
    public UsuarioMetadatum createUsuarioMetadatum(UsuarioMetadatum usuarioMetadatum) {
        return createUsuarioMetadatumUseCase.createUsuarioMetadatum(usuarioMetadatum);
    }

    @Override
    public boolean deleteUsuarioMetadatum(Integer id) {
        return deleteUsuarioMetadatumUseCase.deleteUsuarioMetadatum(id);
    }

    @Override
    public Optional<UsuarioMetadatum> getUsuarioMetadatumById(Integer id) {
        return retrieveUsuarioMetadatumUseCase.getUsuarioMetadatumById(id);
    }

    @Override
    public List<UsuarioMetadatum> getAllUsuariosMetadatum() {
        return retrieveUsuarioMetadatumUseCase.getAllUsuariosMetadatum();
    }

    @Override
    public Optional<UsuarioMetadatum> updateUsuarioMetadatum(Integer id, UsuarioMetadatum updatedUsuarioMetadatum) {
        return updateUsuarioMetadatumUseCase.updateUsuarioMetadatum(id,updatedUsuarioMetadatum);
    }
}
