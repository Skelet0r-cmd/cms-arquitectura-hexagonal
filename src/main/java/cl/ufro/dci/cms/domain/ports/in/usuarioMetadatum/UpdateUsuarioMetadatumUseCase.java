package cl.ufro.dci.cms.domain.ports.in.usuarioMetadatum;

import cl.ufro.dci.cms.domain.model.UsuarioMetadatum;

import java.util.Optional;

public interface UpdateUsuarioMetadatumUseCase {
    Optional<UsuarioMetadatum> updateUsuarioMetadatum (Integer id, UsuarioMetadatum updateUsuarioMetadatum);
}
