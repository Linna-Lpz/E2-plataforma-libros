package com.libros.libros.models;

import java.util.Date;

public class Factura {
    private Integer id_factura;
    private String metodo_pago;
    private Date fecha_factura;
    private Integer id_usuario;
    private Integer id_carrito;

    
    public Integer getId_factura() {
        return id_factura;
    }
    public void setId_factura(Integer new_value) {
        this.id_factura = new_value;
    }
    public String getMetodo_pago() {
        return metodo_pago;
    }
    public void setMetodo_pago(String new_value) {
        this.metodo_pago = new_value;
    }
    public Date getFecha_factura() {
        return fecha_factura;
    }
    public void setFecha_factura(Date new_value) {
        this.fecha_factura = new_value;
    }
    public Integer getId_usuario() {
        return id_usuario;
    }
    public void setId_usuario(Integer new_value) {
        this.id_usuario = new_value;
    }
    public Integer getId_carrito() {
        return id_carrito;
    }
    public void setId_carrito(Integer new_value) {
        this.id_carrito = new_value;
    }
}
