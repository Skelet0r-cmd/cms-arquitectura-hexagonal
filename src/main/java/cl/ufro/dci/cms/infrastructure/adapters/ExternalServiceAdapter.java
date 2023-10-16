package cl.ufro.dci.cms.infrastructure.adapters;

import cl.ufro.dci.cms.domain.model.AdditionalComentarioInfo;
import cl.ufro.dci.cms.domain.model.AdditionalPostInfo;
import cl.ufro.dci.cms.domain.model.AdditionalUsuarioInfo;
import cl.ufro.dci.cms.domain.ports.out.ExternalServicePort;
import cl.ufro.dci.cms.infrastructure.entities.CategoriaEntity;
import cl.ufro.dci.cms.infrastructure.entities.GrupoEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.time.Instant;

@Component
public class ExternalServiceAdapter implements ExternalServicePort {
    private final RestTemplate restTemplate;

    public ExternalServiceAdapter() {
        this.restTemplate = new RestTemplate();
    }

    @Override
    public AdditionalUsuarioInfo getAdditionalUsuarioInfo(Integer usuarioId) {
        String apiUrl = "https://jsonplaceholder.typicode.com/todos/" + usuarioId;
        ResponseEntity<JsonPlaceholderTodo> response = restTemplate.getForEntity(apiUrl, JsonPlaceholderTodo.class);
        JsonPlaceholderTodo todo = response.getBody();

        if (todo == null) {
            return null;
        }

        apiUrl = "https://jsonplaceholder.typicode.com/users/" + todo.getUserId();
        ResponseEntity<JsonPlaceholderUser> userResponse = restTemplate.getForEntity(apiUrl, JsonPlaceholderUser.class);
        JsonPlaceholderUser user = userResponse.getBody();

        if (user == null) {
            return null;
        }

        return new AdditionalUsuarioInfo(user.getIdGrupoEntity().getId(),user.getIdGrupoEntity().getNombre());
    }
    @Override
    public AdditionalPostInfo getAdditionalPostInfo(Integer postId) {
        String apiUrl = "https://jsonplaceholder.typicode.com/todos/" + postId;
        ResponseEntity<JsonPlaceholderTodo> response = restTemplate.getForEntity(apiUrl, JsonPlaceholderTodo.class);
        JsonPlaceholderTodo todo = response.getBody();

        if (todo == null) {
            return null;
        }

        apiUrl = "https://jsonplaceholder.typicode.com/posts/" + todo.getPostId();
        ResponseEntity<JsonPlaceholderPost> postResponse = restTemplate.getForEntity(apiUrl, JsonPlaceholderPost.class);
        JsonPlaceholderPost post = postResponse.getBody();

        if (post == null) {
            return null;
        }

        return new AdditionalPostInfo(post.getIdCategoriaEntity().getId(),post.getIdCategoriaEntity().getNombre(),post.idCategoriaEntity.getCategoriaSuperior());
    }
    @Override
    public AdditionalComentarioInfo getAdditionalComentarioInfo(Integer comentarioId) {
        String apiUrl = "https://jsonplaceholder.typicode.com/todos/" + comentarioId;
        ResponseEntity<JsonPlaceholderTodo> response = restTemplate.getForEntity(apiUrl, JsonPlaceholderTodo.class);
        JsonPlaceholderTodo todo = response.getBody();

        if (todo == null) {
            return null;
        }

        apiUrl = "https://jsonplaceholder.typicode.com/comentarios/" + todo.getComentarioId();
        ResponseEntity<JsonPlaceholderComentario> comentarioResponse = restTemplate.getForEntity(apiUrl, JsonPlaceholderComentario.class);
        JsonPlaceholderComentario comentario = comentarioResponse.getBody();

        if (comentario == null) {
            return null;
        }

        return new AdditionalComentarioInfo(todo.getUserId(), comentario.getComentario(), comentario.getRespuesta(), comentario.getComentario(), comentario.getId());
    }

    private static class JsonPlaceholderTodo {
        private Integer id;
        private Integer comentarioId;
        private Integer postId;
        private Integer userId;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getComentarioId() {
            return comentarioId;
        }

        public void setComentarioId(Integer comentarioId) {
            this.comentarioId = comentarioId;
        }

        public Integer getPostId() {
            return postId;
        }

        public void setPostId(Integer postId) {
            this.postId = postId;
        }

        public Integer getUserId() {
            return userId;
        }

        public void setUserId(Integer userId) {
            this.userId = userId;
        }
    }

    private static class JsonPlaceholderUser {
        private Integer id;
        private String nombre;
        private String apellido;
        private Instant fecha;
        private String contrasena;
        private String correo;
        private GrupoEntity idGrupoEntity;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public Instant getFecha() {
            return fecha;
        }

        public void setFecha(Instant fecha) {
            this.fecha = fecha;
        }

        public String getContrasena() {
            return contrasena;
        }

        public void setContrasena(String contrasena) {
            this.contrasena = contrasena;
        }

        public String getCorreo() {
            return correo;
        }

        public void setCorreo(String correo) {
            this.correo = correo;
        }

        public GrupoEntity getIdGrupoEntity() {
            return idGrupoEntity;
        }

        public void setIdGrupoEntity(GrupoEntity idGrupoEntity) {
            this.idGrupoEntity = idGrupoEntity;
        }
    }
    private static class JsonPlaceholderComentario{
        private Integer id;
        private String comentario;
        private String respuesta;
        private Instant fecha;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getComentario() {
            return comentario;
        }

        public void setComentario(String comentario) {
            this.comentario = comentario;
        }

        public String getRespuesta() {
            return respuesta;
        }

        public void setRespuesta(String respuesta) {
            this.respuesta = respuesta;
        }

        public Instant getFecha() {
            return fecha;
        }

        public void setFecha(Instant fecha) {
            this.fecha = fecha;
        }
    }
    private static class JsonPlaceholderPost{
        private Integer id;
        private String titulo;
        private String slug;
        private String extracto;
        private CategoriaEntity idCategoriaEntity;
        private String imagenDestacada;
        private String tipo;
        private Instant fecha;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public String getExtracto() {
            return extracto;
        }

        public void setExtracto(String extracto) {
            this.extracto = extracto;
        }

        public CategoriaEntity getIdCategoriaEntity() {
            return idCategoriaEntity;
        }

        public void setIdCategoriaEntity(CategoriaEntity idCategoriaEntity) {
            this.idCategoriaEntity = idCategoriaEntity;
        }

        public String getImagenDestacada() {
            return imagenDestacada;
        }

        public void setImagenDestacada(String imagenDestacada) {
            this.imagenDestacada = imagenDestacada;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public Instant getFecha() {
            return fecha;
        }

        public void setFecha(Instant fecha) {
            this.fecha = fecha;
        }
    }
}
