package com.libros.libros.repositories;

import java.util.List;

import com.libros.libros.models.Libro_carrito;

public interface Libro_carritoRepository {
    public List<Libro_carrito> getAll();
    public List<Libro_carrito> getById(Integer id);
    public Libro_carrito create(Libro_carrito data);
    public Libro_carrito update(Libro_carrito data);
    public String delete(Integer id);
}
