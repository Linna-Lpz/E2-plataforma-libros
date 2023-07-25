package com.libros.libros.models;

public class Carrito {
	private Integer id_carrito;
	private Integer n_productos;
	private String ubicacion;
	private Integer saldo_total;
	private String fk_correo_carrito;

    public Integer getId_carrito() {
        return id_carrito;
    }
    public void setId_carrito(Integer id_carrito) {
        this.id_carrito = id_carrito;
    }
    public Integer getN_productos() {
        return n_productos;
    }
    public void setN_productos(Integer n_productos) {
        this.n_productos = n_productos;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public Integer getSaldo_total() {
        return saldo_total;
    }
    public void setSaldo_total(Integer saldo_total) {
        this.saldo_total = saldo_total;
    }
    public String getFk_correo_carrito() {
        return fk_correo_carrito;
    }
    public void setFk_correo_carrito(String fk_correo_carrito) {
        this.fk_correo_carrito = fk_correo_carrito;
    }
    
}
