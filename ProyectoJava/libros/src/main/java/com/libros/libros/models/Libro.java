package com.libros.libros.models;

public class Libro {
    private Integer Año;
	private String Descripcion;
	private String Editorial;
	private String Genero_libro;
	private Integer Id_libro;
	private String Link;
	private String Nombre_libro;
	private Integer Precio;
	private Integer Stock;
	private String Tipo_libro;
	private Integer Numero_favoritos;
	private Integer fk_id_restriccion;
	private Integer fk_id_ubicacion;
	private String nombre_autor;

    public Integer getAño() {
        return Año;
    }
    public void setAño(Integer año) {
        Año = año;
    }
    public String getDescripcion() {
        return Descripcion;
    }
    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
    public String getEditorial() {
        return Editorial;
    }
    public void setEditorial(String editorial) {
        Editorial = editorial;
    }
    public String getGenero_libro() {
        return Genero_libro;
    }
    public void setGenero_libro(String genero_libro) {
        Genero_libro = genero_libro;
    }
    public Integer getId_libro() {
        return Id_libro;
    }
    public void setId_libro(Integer id_libro) {
        Id_libro = id_libro;
    }
    public String getLink() {
        return Link;
    }
    public void setLink(String link) {
        Link = link;
    }
    public String getNombre_libro() {
        return Nombre_libro;
    }
    public void setNombre_libro(String nombre_libro) {
        Nombre_libro = nombre_libro;
    }
    public Integer getPrecio() {
        return Precio;
    }
    public void setPrecio(Integer precio) {
        Precio = precio;
    }
    public Integer getStock() {
        return Stock;
    }
    public void setStock(Integer stock) {
        Stock = stock;
    }
    public String getTipo_libro() {
        return Tipo_libro;
    }
    public void setTipo_libro(String tipo_libro) {
        Tipo_libro = tipo_libro;
    }
    public Integer getNumero_favoritos() {
        return Numero_favoritos;
    }
    public void setNumero_favoritos(Integer numero_favoritos) {
        Numero_favoritos = numero_favoritos;
    }
    public Integer getFk_id_restriccion() {
        return fk_id_restriccion;
    }
    public void setFk_id_restriccion(Integer fk_id_restriccion) {
        this.fk_id_restriccion = fk_id_restriccion;
    }
    public Integer getFk_id_ubicacion() {
        return fk_id_ubicacion;
    }
    public void setFk_id_ubicacion(Integer fk_id_ubicacion) {
        this.fk_id_ubicacion = fk_id_ubicacion;
    }
    public String getNombre_autor() {
        return nombre_autor;
    }
    public void setNombre_autor(String nombre_autor) {
        this.nombre_autor = nombre_autor;
    }
    
}
