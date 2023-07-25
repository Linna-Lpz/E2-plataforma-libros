package com.libros.libros.models;

public class factura {
	private Integer id_factura;
	private String metodo_pago;
	private String correo;
	private Integer id_carrito;
    
    public Integer getId_factura() {
        return id_factura;
    }
    public void setId_factura(Integer id_factura) {
        this.id_factura = id_factura;
    }
    public String getMetodo_pago() {
        return metodo_pago;
    }
    public void setMetodo_pago(String metodo_pago) {
        this.metodo_pago = metodo_pago;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public Integer getId_carrito() {
        return id_carrito;
    }
    public void setId_carrito(Integer id_carrito) {
        this.id_carrito = id_carrito;
    }

}
