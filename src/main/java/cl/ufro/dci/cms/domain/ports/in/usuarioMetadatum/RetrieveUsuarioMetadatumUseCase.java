package cl.ufro.dci.cms.domain.ports.in.usuarioMetadatum;

import cl.ufro.dci.cms.domain.model.UsuarioMetadatum;

import java.util.List;
import java.util.Optional;

public interface RetrieveUsuarioMetadatumUseCase {
    Optional<UsuarioMetadatum> getUsuarioMetadatumById (Integer id);
    List<UsuarioMetadatum> getAllUsuariosMetadatum();
}
