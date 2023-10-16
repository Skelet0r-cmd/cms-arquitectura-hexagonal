package cl.ufro.dci.cms.infrastructure.entities;

import cl.ufro.dci.cms.domain.model.Grupo;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "grupo")
public class GrupoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdGrupo", nullable = false)
    private Integer id;

    @Column(name = "Nombre", nullable = false)
    private String nombre;

    @Column(name = "Fecha")
    private Instant fecha;

    public GrupoEntity() {
    }

    public GrupoEntity(Integer id, String nombre, Instant fecha) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
    }
    public static GrupoEntity fromDomainModel(Grupo grupo) {
        return new GrupoEntity(grupo.getId(),
                grupo.getNombre(),
                grupo.getFecha());
    }

    public Grupo toDomainModel() {
        return new Grupo(id,nombre,fecha);
    }
}