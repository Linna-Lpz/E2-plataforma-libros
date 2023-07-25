package com.libros.libros.repositories;

import java.util.List;

import com.libros.libros.models.usuario_libro;

public interface usuario_libroRepository {
    public List<usuario_libro> getAll();
    public List<usuario_libro> getById(Integer id);
    public usuario_libro create(usuario_libro data);
    public usuario_libro update(usuario_libro data, Integer id);
    public void delete(Integer id);
}
