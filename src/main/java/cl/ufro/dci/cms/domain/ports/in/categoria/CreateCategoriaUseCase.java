package cl.ufro.dci.cms.domain.ports.in.categoria;

import cl.ufro.dci.cms.domain.model.Categoria;

public interface CreateCategoriaUseCase {
    Categoria createCategoria (Categoria categoria);
}
