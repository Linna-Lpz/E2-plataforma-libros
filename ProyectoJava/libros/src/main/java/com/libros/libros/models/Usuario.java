package com.libros.libros.models;

import java.util.Date;

public class Usuario {
    private Integer id_usuario;
    private String correo;
    private Date fecha_nacimiento;
    private String contrasegna;
    private String nombre_usuario;
    private Integer id_tipo_usuario;
    private Integer id_ubicacion;

    
    public Integer getId_usuario() {
        return id_usuario;
    }
    public void setId_usuario(Integer new_value) {
        this.id_usuario = new_value;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String new_value) {
        this.correo = new_value;
    }
    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }
    public void setFecha_nacimiento(Date new_value) {
        this.fecha_nacimiento = new_value;
    }
    public String getContrasegna() {
        return contrasegna;
    }
    public void setContrasegna(String new_value) {
        this.contrasegna = new_value;
    }
    public String getNombre_usuario() {
        return nombre_usuario;
    }
    public void setNombre_usuario(String new_value) {
        this.nombre_usuario = new_value;
    }
    public Integer getId_tipo_usuario() {
        return id_tipo_usuario;
    }
    public void setId_tipo_usuario(Integer new_value) {
        this.id_tipo_usuario = new_value;
    }
    public Integer getId_ubicacion() {
        return id_ubicacion;
    }
    public void setId_ubicacion(Integer new_value) {
        this.id_ubicacion = new_value;
    }
}
