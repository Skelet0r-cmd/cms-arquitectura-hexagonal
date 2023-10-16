package cl.ufro.dci.cms.infrastructure.entities;

import cl.ufro.dci.cms.domain.model.PostMetadatum;
import cl.ufro.dci.cms.domain.model.Usuario;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "usuario")
public class UsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdUsuario", nullable = false)
    private Integer id;

    @Column(name = "Nombre", nullable = false)
    private String nombre;

    @Column(name = "Apellido")
    private String apellido;

    @Column(name = "Fecha")
    private Instant fecha;

    @Column(name = "Contrasena", nullable = false)
    private String contrasena;

    @Column(name = "Correo", nullable = false)
    private String correo;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IdGrupo", nullable = false)
    private GrupoEntity idGrupoEntity;

    public UsuarioEntity() {
    }

    public UsuarioEntity(Integer id, String nombre, String apellido, Instant fecha, String contrasena, String correo, GrupoEntity idGrupoEntity) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
        this.contrasena = contrasena;
        this.correo = correo;
        this.idGrupoEntity = idGrupoEntity;
    }
    public static UsuarioEntity fromDomainModel(Usuario usuario) {
        return new UsuarioEntity(usuario.getId(),
                usuario.getNombre(),
                usuario.getApellido(),
                usuario.getFecha(),
                usuario.getContrasena(),
                usuario.getCorreo(),
                usuario.getIdGrupoEntity());
    }

    public Usuario toDomainModel() {
        return new Usuario(id,nombre,apellido,fecha,contrasena,correo,idGrupoEntity);
    }
}