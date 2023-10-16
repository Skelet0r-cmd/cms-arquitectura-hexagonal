package cl.ufro.dci.cms.infrastructure.repositories;

import cl.ufro.dci.cms.domain.model.Categoria;
import cl.ufro.dci.cms.domain.ports.out.CategoriaRepositoryPort;
import cl.ufro.dci.cms.infrastructure.entities.CategoriaEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JpaCategoriaRepositoryAdapter implements CategoriaRepositoryPort {
    private final JpaCategoriaRepository jpaCategoriaRepository;

    public JpaCategoriaRepositoryAdapter(JpaCategoriaRepository jpaCategoriaRepository) {
        this.jpaCategoriaRepository = jpaCategoriaRepository;
    }

    @Override
    public Categoria save(Categoria categoria) {
        CategoriaEntity categoriaEntity = CategoriaEntity.fromDomainModel(categoria);
        CategoriaEntity savedCategoriaEntity =jpaCategoriaRepository.save(categoriaEntity);
        return savedCategoriaEntity.toDomainModel();
    }

    @Override
    public Optional<Categoria> findById(Integer id) {
        return jpaCategoriaRepository.findById(id).map(CategoriaEntity::toDomainModel);
    }

    @Override
    public List<Categoria> findAll() {
        return jpaCategoriaRepository.findAll().stream()
                .map(CategoriaEntity::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Categoria> update(Categoria categoria) {
        if (jpaCategoriaRepository.existsById(categoria.getId())){
            CategoriaEntity categoriaEntity = CategoriaEntity.fromDomainModel(categoria);
            CategoriaEntity updatedCategoriaEntity = jpaCategoriaRepository.save(categoriaEntity);
            return Optional.of(updatedCategoriaEntity.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Integer id) {
        if (jpaCategoriaRepository.existsById(id)){
            jpaCategoriaRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
