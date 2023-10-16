package cl.ufro.dci.cms.infrastructure.entities;

import cl.ufro.dci.cms.domain.model.Categoria;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "categoria")
public class CategoriaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdCategoria", nullable = false)
    private Integer id;

    @Column(name = "Nombre", nullable = false)
    private String nombre;

    @Column(name = "Descripcion")
    private String descripcion;

    @Column(name = "Fecha")
    private Instant fecha;

    @Column(name = "CategoriaSuperior")
    private Integer categoriaSuperior;

    public CategoriaEntity() {
    }

    public CategoriaEntity(Integer id, String nombre, String descripcion, Instant fecha, Integer categoriaSuperior) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.categoriaSuperior = categoriaSuperior;
    }

    public static CategoriaEntity fromDomainModel(Categoria categoria) {
        return new CategoriaEntity(categoria.getId(),
                categoria.getNombre(),
                categoria.getDescripcion(),
                categoria.getFecha(),
                categoria.getIdCategoriaSuperior());
    }

    public Categoria toDomainModel() {
        return new Categoria(id,nombre,descripcion,fecha,categoriaSuperior);
    }
}