package com.libros.libros.models;

public class Tipo_usuario {
    private Integer id_tipo_usuario;
    private Boolean es_registrado;
    private String tipo_rol;

    
    public Integer getId_tipo_usuario() {
        return id_tipo_usuario;
    }
    public void setId_tipo_usuario(Integer new_value) {
        this.id_tipo_usuario = new_value;
    }
    public Boolean getEs_registrado() {
        return es_registrado;
    }
    public void setEs_registrado(Boolean new_value) {
        this.es_registrado = new_value;
    }
    public String getTipo_rol() {
        return tipo_rol;
    }
    public void setTipo_rol(String new_value) {
        this.tipo_rol = new_value;
    }
}
