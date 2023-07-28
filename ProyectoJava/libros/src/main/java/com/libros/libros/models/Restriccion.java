package com.libros.libros.models;

public class Restriccion {
    private Integer id_restriccion;
    private Integer edad_minima;

    
    public Integer getId_restriccion() {
        return id_restriccion;
    }
    public void setId_restriccion(Integer new_value) {
        this.id_restriccion = new_value;
    }
    public Integer getEdad_minima() {
        return edad_minima;
    }
    public void setEdad_minima(Integer new_value) {
        this.edad_minima = new_value;
    }
}
