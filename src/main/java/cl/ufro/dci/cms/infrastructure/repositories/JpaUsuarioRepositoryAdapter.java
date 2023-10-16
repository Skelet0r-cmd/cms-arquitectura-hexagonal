package cl.ufro.dci.cms.infrastructure.repositories;

import cl.ufro.dci.cms.domain.model.Usuario;
import cl.ufro.dci.cms.domain.ports.out.UsuarioRepositoryPort;
import cl.ufro.dci.cms.infrastructure.entities.UsuarioEntity;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class JpaUsuarioRepositoryAdapter implements UsuarioRepositoryPort {
    private final  JpaUsuarioRepository jpaUsuarioRepository;

    public JpaUsuarioRepositoryAdapter(JpaUsuarioRepository jpaUsuarioRepository) {
        this.jpaUsuarioRepository = jpaUsuarioRepository;
    }

    @Override
    public Usuario save(Usuario usuario) {
        UsuarioEntity usuarioEntity = UsuarioEntity.fromDomainModel(usuario);
        UsuarioEntity savedUsuarioEntity = jpaUsuarioRepository.save(usuarioEntity);
        return savedUsuarioEntity.toDomainModel();
    }

    @Override
    public Optional<Usuario> findById(Integer id) {
        return jpaUsuarioRepository.findById(id).map(UsuarioEntity::toDomainModel);
    }

    @Override
    public List<Usuario> findAll() {
        return jpaUsuarioRepository.findAll().stream()
                .map(UsuarioEntity::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Usuario> update(Usuario usuario) {
        if (jpaUsuarioRepository.existsById(usuario.getId())){
            UsuarioEntity usuarioEntity = UsuarioEntity.fromDomainModel(usuario);
            UsuarioEntity updatedUsuarioEntity = jpaUsuarioRepository.save(usuarioEntity);
            return Optional.of(updatedUsuarioEntity.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Integer id) {
        if (jpaUsuarioRepository.existsById(id)){
            jpaUsuarioRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
