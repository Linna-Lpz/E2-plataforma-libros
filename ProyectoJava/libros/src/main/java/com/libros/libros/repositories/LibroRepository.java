package com.libros.libros.repositories;

import java.util.List;

import com.libros.libros.models.Libro;

public interface LibroRepository {
    public List<Libro> getAll();
    public List<Libro> getById(Integer id);
    public Libro create(Libro data);
    public Libro update(Libro data, Integer id);
    public void delete(Integer id);
}
