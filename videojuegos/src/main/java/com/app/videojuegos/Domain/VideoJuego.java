package com.app.videojuegos.Domain;

import jakarta.persistence.*;

@Entity
@Table(name = "videojuego")
public class VideoJuego {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String descripcion;
    private String imgurl;
    @ManyToOne
    private VideojuegoDistribuidor distribuidor;

    public VideojuegoDistribuidor getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(VideojuegoDistribuidor distribuidor) {
        this.distribuidor = distribuidor;
    }

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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setimgurl(String url) {
        this.imgurl = url;
    }

    @Override
    public String toString() {
        return "VideoJuego{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", imgurl='" + imgurl + '\'' +
                ", distribuidor=" + distribuidor.getId() +
                '}';
    }
}
