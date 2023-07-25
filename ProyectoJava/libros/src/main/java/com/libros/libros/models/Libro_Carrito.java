package com.libros.libros.models;

public class Libro_Carrito {
	private Integer id_libro_carrito;
	private Integer libro_carrito_libro_fk;
	private Integer libro_carrito_carrito_fk;

    public Integer getId_libro_carrito() {
        return id_libro_carrito;
    }
    public void setId_libro_carrito(Integer id_libro_carrito) {
        this.id_libro_carrito = id_libro_carrito;
    }
    public Integer getLibro_carrito_libro_fk() {
        return libro_carrito_libro_fk;
    }
    public void setLibro_carrito_libro_fk(Integer libro_carrito_libro_fk) {
        this.libro_carrito_libro_fk = libro_carrito_libro_fk;
    }
    public Integer getLibro_carrito_carrito_fk() {
        return libro_carrito_carrito_fk;
    }
    public void setLibro_carrito_carrito_fk(Integer libro_carrito_carrito_fk) {
        this.libro_carrito_carrito_fk = libro_carrito_carrito_fk;
    }

}
