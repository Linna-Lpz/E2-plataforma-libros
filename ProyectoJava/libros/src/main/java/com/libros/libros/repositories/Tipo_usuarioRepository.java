package com.libros.libros.repositories;

import java.util.List;

import com.libros.libros.models.Tipo_usuario;

public interface Tipo_usuarioRepository {
    public List<Tipo_usuario> getAll();
    public List<Tipo_usuario> getById(Integer id);
    public Tipo_usuario create(Tipo_usuario data);
    public Tipo_usuario update(Tipo_usuario data);
    public String delete(Integer id);
}
