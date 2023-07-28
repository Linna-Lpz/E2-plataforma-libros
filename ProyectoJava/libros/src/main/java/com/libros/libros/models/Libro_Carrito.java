package com.libros.libros.models;

public class Libro_carrito {
    private Integer id_libro_carrito;
    private Integer id_libro;
    private Integer id_carrito;
    private Integer cantidad;

    
    public Integer getId_libro_carrito() {
        return id_libro_carrito;
    }
    public void setId_libro_carrito(Integer new_value) {
        this.id_libro_carrito = new_value;
    }
    public Integer getId_libro() {
        return id_libro;
    }
    public void setId_libro(Integer new_value) {
        this.id_libro = new_value;
    }
    public Integer getId_carrito() {
        return id_carrito;
    }
    public void setId_carrito(Integer new_value) {
        this.id_carrito = new_value;
    }
    public Integer getCantidad() {
        return cantidad;
    }
    public void setCantidad(Integer new_value) {
        this.cantidad = new_value;
    }
}
