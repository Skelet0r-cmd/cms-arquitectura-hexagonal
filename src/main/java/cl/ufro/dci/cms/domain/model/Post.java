package cl.ufro.dci.cms.domain.model;

import cl.ufro.dci.cms.infrastructure.entities.CategoriaEntity;

import java.time.Instant;

public class Post {
    private Integer id;
    private String titulo;
    private String slug;
    private String extracto;
    private CategoriaEntity idCategoriaEntity;
    private String imagenDestacada;
    private String tipo;
    private Instant fecha;

    public Post(Integer id, String titulo, String slug, String extracto, CategoriaEntity idCategoriaEntity, String imagenDestacada, String tipo, Instant fecha) {
        this.id = id;
        this.titulo = titulo;
        this.slug = slug;
        this.extracto = extracto;
        this.idCategoriaEntity = idCategoriaEntity;
        this.imagenDestacada = imagenDestacada;
        this.tipo = tipo;
        this.fecha = fecha;
    }

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
