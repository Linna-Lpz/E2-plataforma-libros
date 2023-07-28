package com.libros.libros.models;

public class Ubicacion {
    private Integer id_ubicacion;
    private String nombre_ubicacion;

    
    public Integer getId_ubicacion() {
        return id_ubicacion;
    }
    public void setId_ubicacion(Integer new_value) {
        this.id_ubicacion = new_value;
    }
    public String getNombre_ubicacion() {
        return nombre_ubicacion;
    }
    public void setNombre_ubicacion(String new_value) {
        this.nombre_ubicacion = new_value;
    }
}
