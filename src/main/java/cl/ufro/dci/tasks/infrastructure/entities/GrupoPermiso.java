package cl.ufro.dci.tasks.infrastructure.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "grupo_permiso")
public class GrupoPermiso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdGrupoPermiso", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IdGrupo", nullable = false)
    private Grupo idGrupo;

    @Column(name = "Fecha")
    private Instant fecha;

}