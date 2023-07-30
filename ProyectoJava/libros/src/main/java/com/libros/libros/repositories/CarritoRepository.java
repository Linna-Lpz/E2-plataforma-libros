package com.libros.libros.repositories;

import java.util.List;

import com.libros.libros.models.Carrito;

public interface CarritoRepository {
    public List<Carrito> getAll();
    public List<Carrito> getById(Integer id);
    public Carrito create(Carrito data);
    public Carrito update(Carrito data);
    public String delete(Integer id);
}
