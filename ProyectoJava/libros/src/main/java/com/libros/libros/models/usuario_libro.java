package com.libros.libros.models;

public class usuario_libro {
	private Integer id_usuario_libro;
	private String favoritos;
	private String fk_usuario;
	private Integer fk_libro;

    public Integer getId_usuario_libro() {
        return id_usuario_libro;
    }
    public void setId_usuario_libro(Integer id_usuario_libro) {
        this.id_usuario_libro = id_usuario_libro;
    }
    public String getFavoritos() {
        return favoritos;
    }
    public void setFavoritos(String favoritos) {
        this.favoritos = favoritos;
    }
    public String getFk_usuario() {
        return fk_usuario;
    }
    public void setFk_usuario(String fk_usuario) {
        this.fk_usuario = fk_usuario;
    }
    public Integer getFk_libro() {
        return fk_libro;
    }
    public void setFk_libro(Integer fk_libro) {
        this.fk_libro = fk_libro;
    }
}
