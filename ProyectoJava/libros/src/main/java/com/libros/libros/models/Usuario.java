package com.libros.libros.models;

import java.util.Date;

public class Usuario {
    private String correo;
    private Date fecha_nacimiento;
    private String contrasena;
    private String nombre_usuario;
    private Integer fk_tipo_usuario;
    private Integer fk_ubicacion;

    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }
    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getContrasena() {
        return contrasena;
    }
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }
    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public Integer getFk_tipo_usuario() {
        return fk_tipo_usuario;
    }
    public void setFk_tipo_usuario(Integer fk_tipo_usuario) {
        this.fk_tipo_usuario = fk_tipo_usuario;
    }

    public Integer getFk_ubicacion() {
        return fk_ubicacion;
    }
    public void setFk_ubicacion(Integer fk_ubicacion) {
        this.fk_ubicacion = fk_ubicacion;
    }
}
