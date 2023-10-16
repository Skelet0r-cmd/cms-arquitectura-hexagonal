package cl.ufro.dci.cms.infrastructure.config;

import cl.ufro.dci.cms.application.services.*;
import cl.ufro.dci.cms.application.usecases.categoria.CreateCategoriaUseCaseImpl;
import cl.ufro.dci.cms.application.usecases.categoria.DeleteCategoriaUseCaseImpl;
import cl.ufro.dci.cms.application.usecases.categoria.RetrieveCategoriaUseCaseImpl;
import cl.ufro.dci.cms.application.usecases.categoria.UpdateCategoriaUseCaseImpl;
import cl.ufro.dci.cms.application.usecases.comentario.*;
import cl.ufro.dci.cms.application.usecases.contenido.CreateContenidoUseCaseImpl;
import cl.ufro.dci.cms.application.usecases.contenido.DeleteContenidoUseCaseImpl;
import cl.ufro.dci.cms.application.usecases.contenido.RetrieveContenidoUseCaseImpl;
import cl.ufro.dci.cms.application.usecases.contenido.UpdateContenidoUseCaseImpl;
import cl.ufro.dci.cms.application.usecases.grupo.CreateGrupoUseCaseImpl;
import cl.ufro.dci.cms.application.usecases.grupo.DeleteGrupoUseCaseImpl;
import cl.ufro.dci.cms.application.usecases.grupo.RetrieveGrupoUseCaseImpl;
import cl.ufro.dci.cms.application.usecases.grupo.UpdateGrupoUseCaseImpl;
import cl.ufro.dci.cms.application.usecases.grupoPermiso.CreateGrupoPermisoUseCaseImpl;
import cl.ufro.dci.cms.application.usecases.grupoPermiso.DeleteGrupoPermisoUseCaseImpl;
import cl.ufro.dci.cms.application.usecases.grupoPermiso.RetrieveGrupoPermisoUseCaseImpl;
import cl.ufro.dci.cms.application.usecases.grupoPermiso.UpdateGrupoPermisoUseCaseImpl;
import cl.ufro.dci.cms.application.usecases.permiso.CreatePermisoUseCaseImpl;
import cl.ufro.dci.cms.application.usecases.permiso.DeletePermisoUseCaseImpl;
import cl.ufro.dci.cms.application.usecases.permiso.RetrievePermisoUseCaseImpl;
import cl.ufro.dci.cms.application.usecases.permiso.UpdatePermisoUseCaseImpl;
import cl.ufro.dci.cms.application.usecases.post.*;
import cl.ufro.dci.cms.application.usecases.usuario.*;
import cl.ufro.dci.cms.application.usecases.usuarioMetadatum.CreateUsuarioMetadatumUseCaseImpl;
import cl.ufro.dci.cms.application.usecases.usuarioMetadatum.DeleteUsuarioMetadatumUseCaseImpl;
import cl.ufro.dci.cms.application.usecases.usuarioMetadatum.RetrieveUsuarioMetadatumUseCaseImpl;
import cl.ufro.dci.cms.application.usecases.usuarioMetadatum.UpdateUsuarioMetadatumUseCaseImpl;
import cl.ufro.dci.cms.domain.ports.in.comentario.GetAdditionalComentarioInfoUseCase;
import cl.ufro.dci.cms.domain.ports.in.post.GetAdditionalPostInfoUseCase;
import cl.ufro.dci.cms.domain.ports.in.usuario.GetAdditionalUsuarioInfoUseCase;
import cl.ufro.dci.cms.domain.ports.out.*;
import cl.ufro.dci.cms.infrastructure.adapters.ExternalServiceAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public CategoriaService categoriaService(CategoriaRepositoryPort categoriaRepositoryPort) {
        return new CategoriaService(
                new CreateCategoriaUseCaseImpl(categoriaRepositoryPort),
                new DeleteCategoriaUseCaseImpl(categoriaRepositoryPort),
                new RetrieveCategoriaUseCaseImpl(categoriaRepositoryPort),
                new UpdateCategoriaUseCaseImpl(categoriaRepositoryPort)
        );
    }

    @Bean
    public ComentarioService comentarioService(ComentarioRepositoryPort comentarioRepositoryPort,
                                               GetAdditionalComentarioInfoUseCase getAdditionalComentarioInfoUseCase) {
        return new ComentarioService(
                new CreateComentarioUseCaseImpl(comentarioRepositoryPort),
                new DeleteComentarioUseCaseImpl(comentarioRepositoryPort),
                getAdditionalComentarioInfoUseCase,
                new RetrieveComentarioUseCaseImpl(comentarioRepositoryPort),
                new UpdateComentarioUseCaseImpl(comentarioRepositoryPort)
        );
    }
    @Bean
    public ContenidoService ContenidoService(ContenidoRepositoryPort contenidoRepositoryPort) {
        return new ContenidoService(
                new CreateContenidoUseCaseImpl(contenidoRepositoryPort),
                new DeleteContenidoUseCaseImpl(contenidoRepositoryPort),
                new RetrieveContenidoUseCaseImpl(contenidoRepositoryPort),
                new UpdateContenidoUseCaseImpl(contenidoRepositoryPort)
        );
    }

    @Bean
    public GrupoService grupoService(GrupoRepositoryPort grupoRepositoryPort) {
        return new GrupoService(
                new CreateGrupoUseCaseImpl(grupoRepositoryPort),
                new DeleteGrupoUseCaseImpl(grupoRepositoryPort),
                new RetrieveGrupoUseCaseImpl(grupoRepositoryPort),
                new UpdateGrupoUseCaseImpl(grupoRepositoryPort)
        );
    }

    @Bean
    public GrupoPermisoService grupoPermisoService(GrupoPermisoRepositoryPort grupoPermisoRepositoryPort) {
        return new GrupoPermisoService(
                new CreateGrupoPermisoUseCaseImpl(grupoPermisoRepositoryPort),
                new DeleteGrupoPermisoUseCaseImpl(grupoPermisoRepositoryPort),
                new RetrieveGrupoPermisoUseCaseImpl(grupoPermisoRepositoryPort),
                new UpdateGrupoPermisoUseCaseImpl(grupoPermisoRepositoryPort)
        );
    }

    @Bean
    public PermisoService permisoService(PermisoRepositoryPort permisoRepositoryPort) {
        return new PermisoService(
                new CreatePermisoUseCaseImpl(permisoRepositoryPort),
                new DeletePermisoUseCaseImpl(permisoRepositoryPort),
                new RetrievePermisoUseCaseImpl(permisoRepositoryPort),
                new UpdatePermisoUseCaseImpl(permisoRepositoryPort)
        );
    }

    @Bean
    public PostService postService(PostRepositoryPort postRepositoryPort,
                                   GetAdditionalPostInfoUseCase getAdditionalPostInfoUseCase) {
        return new PostService(
                new CreatePostUseCaseImpl(postRepositoryPort),
                new DeletePostUseCaseImpl(postRepositoryPort),
                getAdditionalPostInfoUseCase,
                new RetrievePostUseCaseImpl(postRepositoryPort),
                new UpdatePostUseCaseImpl(postRepositoryPort)
        );
    }

    @Bean
    public UsuarioMetadatumService usuarioMetadatumService(UsuarioMetadatumRepositoryPort usuarioMetadatumRepositoryPort) {
        return new UsuarioMetadatumService(
                new CreateUsuarioMetadatumUseCaseImpl(usuarioMetadatumRepositoryPort),
                new DeleteUsuarioMetadatumUseCaseImpl(usuarioMetadatumRepositoryPort),
                new RetrieveUsuarioMetadatumUseCaseImpl(usuarioMetadatumRepositoryPort),
                new UpdateUsuarioMetadatumUseCaseImpl(usuarioMetadatumRepositoryPort)
        );
    }

    @Bean
    public UsuarioService usuarioService(UsuarioRepositoryPort usuarioRepositoryPort,
                                   GetAdditionalUsuarioInfoUseCase getAdditionalUsuarioInfoUseCase) {
        return new UsuarioService(
                new CreateUsuarioUseCaseImpl(usuarioRepositoryPort),
                new DeleteUsuarioUseCaseImpl(usuarioRepositoryPort),
                getAdditionalUsuarioInfoUseCase,
                new RetrieveUsuarioUseCaseImpl(usuarioRepositoryPort),
                new UpdateUsuarioUseCaseImpl(usuarioRepositoryPort)
        );
    }

    @Bean
    public GetAdditionalComentarioInfoUseCase getAdditionalComentarioInfoUseCase(ExternalServicePort externalServicePort) {
        return new GetAdditionalComentarioInfoUseCaseImpl(externalServicePort);
    }

    @Bean
    public GetAdditionalPostInfoUseCase getAdditionalPostInfoUseCase(ExternalServicePort externalServicePort) {
        return new GetAdditionalPostInfoUseCaseImpl(externalServicePort);
    }

    @Bean
    public GetAdditionalUsuarioInfoUseCase additionalUsuarioInfoUseCase(ExternalServicePort externalServicePort) {
        return new GetAdditionalUsuarioInfoUseCaseImpl(externalServicePort);
    }

    @Bean
    public ExternalServicePort externalServicePort() {
        return new ExternalServiceAdapter();
    }
}