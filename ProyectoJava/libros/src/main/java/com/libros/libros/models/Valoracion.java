package com.libros.libros.models;

public class Valoracion {
	private Integer id_valoracion;
	private String comentario;
	private Integer puntuacion;
	private Integer fk_id_libro;
	private String fk_usuario_valoracion;

    public Integer getId_valoracion() {
        return id_valoracion;
    }
    public void setId_valoracion(Integer id_valoracion) {
        this.id_valoracion = id_valoracion;
    }
    public String getComentario() {
        return comentario;
    }
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    public Integer getPuntuacion() {
        return puntuacion;
    }
    public void setPuntuacion(Integer puntuacion) {
        this.puntuacion = puntuacion;
    }
    public Integer getFk_id_libro() {
        return fk_id_libro;
    }
    public void setFk_id_libro(Integer fk_id_libro) {
        this.fk_id_libro = fk_id_libro;
    }
    public String getFk_usuario_valoracion() {
        return fk_usuario_valoracion;
    }
    public void setFk_usuario_valoracion(String fk_usuario_valoracion) {
        this.fk_usuario_valoracion = fk_usuario_valoracion;
    }
}
