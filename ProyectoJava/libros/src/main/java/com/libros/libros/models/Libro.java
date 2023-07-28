package com.libros.libros.models;

public class Libro {
    private Integer id_libro;
    private Integer agno;
    private String descripcion;
    private String editorial;
    private String genero_libro;
    private String link;
    private String nombre_libro;
    private Integer precio;
    private Integer stock;
    private String tipo_libro;
    private Integer numero_favoritos;
    private String nombre_autor;
    private Integer id_restriccion;
    private Integer id_ubicacion;

    
    public Integer getId_libro() {
        return id_libro;
    }
    public void setId_libro(Integer new_value) {
        this.id_libro = new_value;
    }
    public Integer getAgno() {
        return agno;
    }
    public void setAgno(Integer new_value) {
        this.agno = new_value;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String new_value) {
        this.descripcion = new_value;
    }
    public String getEditorial() {
        return editorial;
    }
    public void setEditorial(String new_value) {
        this.editorial = new_value;
    }
    public String getGenero_libro() {
        return genero_libro;
    }
    public void setGenero_libro(String new_value) {
        this.genero_libro = new_value;
    }
    public String getLink() {
        return link;
    }
    public void setLink(String new_value) {
        this.link = new_value;
    }
    public String getNombre_libro() {
        return nombre_libro;
    }
    public void setNombre_libro(String new_value) {
        this.nombre_libro = new_value;
    }
    public Integer getPrecio() {
        return precio;
    }
    public void setPrecio(Integer new_value) {
        this.precio = new_value;
    }
    public Integer getStock() {
        return stock;
    }
    public void setStock(Integer new_value) {
        this.stock = new_value;
    }
    public String getTipo_libro() {
        return tipo_libro;
    }
    public void setTipo_libro(String new_value) {
        this.tipo_libro = new_value;
    }
    public Integer getNumero_favoritos() {
        return numero_favoritos;
    }
    public void setNumero_favoritos(Integer new_value) {
        this.numero_favoritos = new_value;
    }
    public String getNombre_autor() {
        return nombre_autor;
    }
    public void setNombre_autor(String new_value) {
        this.nombre_autor = new_value;
    }
    public Integer getId_restriccion() {
        return id_restriccion;
    }
    public void setId_restriccion(Integer new_value) {
        this.id_restriccion = new_value;
    }
    public Integer getId_ubicacion() {
        return id_ubicacion;
    }
    public void setId_ubicacion(Integer new_value) {
        this.id_ubicacion = new_value;
    }
}
