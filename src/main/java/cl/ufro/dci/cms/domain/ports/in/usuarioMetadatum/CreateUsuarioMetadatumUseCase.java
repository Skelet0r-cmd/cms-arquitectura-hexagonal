package cl.ufro.dci.cms.domain.ports.in.usuarioMetadatum;

import cl.ufro.dci.cms.domain.model.UsuarioMetadatum;

public interface CreateUsuarioMetadatumUseCase {
    UsuarioMetadatum createUsuarioMetadatum(UsuarioMetadatum usuarioMetadatum);
}
