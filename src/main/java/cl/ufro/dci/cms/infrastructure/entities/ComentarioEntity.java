package cl.ufro.dci.cms.infrastructure.entities;

import cl.ufro.dci.cms.domain.model.Comentario;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "comentario")
public class ComentarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdComentario", nullable = false)
    private Integer id;

    @Column(name = "Comentario", nullable = false)
    private String comentario;

    @Column(name = "Respuesta")
    private String respuesta;

    @Column(name = "Fecha")
    private Instant fecha;

    public ComentarioEntity() {
    }
    public ComentarioEntity(Integer id, String comentario, String respuesta, Instant fecha) {
        this.id = id;
        this.comentario = comentario;
        this.respuesta = respuesta;
        this.fecha = fecha;
    }
    public static ComentarioEntity fromDomainModel(Comentario comentario) {
        return new ComentarioEntity(comentario.getId(),
                comentario.getComentario(),
                comentario.getRespuesta(),
                comentario.getFecha());
    }

    public Comentario toDomainModel() {
        return new Comentario(id,comentario,respuesta,fecha);
    }
}
