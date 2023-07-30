package com.libros.libros.models;

public class Usuario_libro {
    private Integer id_usuario_libro;
    private String favoritos;
    private Integer id_usuario;
    private Integer id_libro;

    
    public Integer getId_usuario_libro() {
        return id_usuario_libro;
    }
    public void setId_usuario_libro(Integer new_value) {
        this.id_usuario_libro = new_value;
    }
    public String getFavoritos() {
        return favoritos;
    }
    public void setFavoritos(String new_value) {
        this.favoritos = new_value;
    }
    public Integer getId_usuario() {
        return id_usuario;
    }
    public void setId_usuario(Integer new_value) {
        this.id_usuario = new_value;
    }
    public Integer getId_libro() {
        return id_libro;
    }
    public void setId_libro(Integer new_value) {
        this.id_libro = new_value;
    }
}
