package com.libros.libros.repositories;

import java.util.List;

import com.libros.libros.models.Usuario;

public interface UsuarioRepository {
    public List<Usuario> getAll();
    public List<Usuario> getById(Integer id);
    public Usuario create(Usuario data);
    public Usuario update(Usuario data);
    public String delete(Integer id);
}
