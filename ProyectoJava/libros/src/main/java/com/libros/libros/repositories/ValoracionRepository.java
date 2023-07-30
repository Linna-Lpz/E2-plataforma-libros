package com.libros.libros.repositories;

import java.util.List;

import com.libros.libros.models.Valoracion;

public interface ValoracionRepository {
    public List<Valoracion> getAll();
    public List<Valoracion> getById(Integer id);
    public Valoracion create(Valoracion data);
    public Valoracion update(Valoracion data);
    public String delete(Integer id);
}
