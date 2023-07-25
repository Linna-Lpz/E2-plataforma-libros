package com.libros.libros.repositories;

import java.util.List;

import com.libros.libros.models.Libro_Carrito;

public interface Libro_CarritoRepository {
    public List<Libro_Carrito> getAll();
    public List<Libro_Carrito> getById(Integer id);
    public Libro_Carrito create(Libro_Carrito data);
    public Libro_Carrito update(Libro_Carrito data, Integer id);
    public void delete(Integer id);
}
