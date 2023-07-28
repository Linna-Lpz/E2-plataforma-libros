package com.libros.libros.models;

public class Carrito {
    private Integer id_carrito;
    private String ubicacion;
    private Integer id_usuario;

    
    public Integer getId_carrito() {
        return id_carrito;
    }
    public void setId_carrito(Integer new_value) {
        this.id_carrito = new_value;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String new_value) {
        this.ubicacion = new_value;
    }
    public Integer getId_usuario() {
        return id_usuario;
    }
    public void setId_usuario(Integer new_value) {
        this.id_usuario = new_value;
    }
}
