package cl.ufro.dci.cms.infrastructure.entities;

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

}