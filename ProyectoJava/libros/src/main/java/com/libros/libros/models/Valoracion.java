package com.libros.libros.models;

public class Valoracion {
    private Integer id_valoracion;
    private String comentario;
    private Integer puntuacion;
    private Integer id_libro;
    private Integer id_usuario;

    
    public Integer getId_valoracion() {
        return id_valoracion;
    }
    public void setId_valoracion(Integer new_value) {
        this.id_valoracion = new_value;
    }
    public String getComentario() {
        return comentario;
    }
    public void setComentario(String new_value) {
        this.comentario = new_value;
    }
    public Integer getPuntuacion() {
        return puntuacion;
    }
    public void setPuntuacion(Integer new_value) {
        this.puntuacion = new_value;
    }
    public Integer getId_libro() {
        return id_libro;
    }
    public void setId_libro(Integer new_value) {
        this.id_libro = new_value;
    }
    public Integer getId_usuario() {
        return id_usuario;
    }
    public void setId_usuario(Integer new_value) {
        this.id_usuario = new_value;
    }
}
