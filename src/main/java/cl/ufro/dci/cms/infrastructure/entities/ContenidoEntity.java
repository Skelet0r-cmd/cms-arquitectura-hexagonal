package cl.ufro.dci.cms.infrastructure.entities;

import cl.ufro.dci.cms.domain.model.Contenido;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "contenido")
public class ContenidoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdContenido", nullable = false)
    private Integer id;

    @Column(name = "Tipo", nullable = false)
    private String tipo;

    @Column(name = "Contenido", nullable = false)
    private String contenido;

    @Column(name = "Fecha")
    private Instant fecha;

    public ContenidoEntity() {
    }

    public ContenidoEntity(Integer id, String tipo, String contenido, Instant fecha) {
        this.id = id;
        this.tipo = tipo;
        this.contenido = contenido;
        this.fecha = fecha;
    }
    public static ContenidoEntity fromDomainModel(Contenido contenido) {
        return new ContenidoEntity(contenido.getId(),
                contenido.getTipo(),
                contenido.getContenido(),
                contenido.getFecha());
    }

    public Contenido toDomainModel() {
        return new Contenido(id,tipo,contenido,fecha);
    }
}