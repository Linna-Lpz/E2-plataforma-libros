package com.libros.libros.repositories;

import java.util.List;

import com.libros.libros.models.Usuario_libro;

public interface Usuario_libroRepository {
    public List<Usuario_libro> getAll();
    public List<Usuario_libro> getById(Integer id);
    public Usuario_libro create(Usuario_libro data);
    public Usuario_libro update(Usuario_libro data);
    public void delete(Integer id);
}
