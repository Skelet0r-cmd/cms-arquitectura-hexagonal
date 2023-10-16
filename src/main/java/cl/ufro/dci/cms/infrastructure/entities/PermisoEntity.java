package cl.ufro.dci.cms.infrastructure.entities;

import cl.ufro.dci.cms.domain.model.Permiso;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "permiso")
public class PermisoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdPermiso", nullable = false)
    private Integer id;

    @Column(name = "Nombre", nullable = false)
    private String nombre;

    @Column(name = "Fecha")
    private Instant fecha;

    public PermisoEntity() {
    }

    public PermisoEntity(Integer id, String nombre, Instant fecha) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
    }
    public static PermisoEntity fromDomainModel(Permiso permiso) {
        return new PermisoEntity(permiso.getId(),
                permiso.getNombre(),
                permiso.getFecha());
    }

    public Permiso toDomainModel() {
        return new Permiso(id,nombre,fecha);
    }
}