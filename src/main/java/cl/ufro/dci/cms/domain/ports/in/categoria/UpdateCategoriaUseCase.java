package cl.ufro.dci.cms.domain.ports.in.categoria;

import cl.ufro.dci.cms.domain.model.Categoria;

import java.util.List;
import java.util.Optional;

public interface UpdateCategoriaUseCase {
    Optional<Categoria> updateCategoria (Integer id, Categoria updateCategoria);
}
