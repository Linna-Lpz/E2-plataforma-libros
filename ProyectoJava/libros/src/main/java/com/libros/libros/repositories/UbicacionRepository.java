package com.libros.libros.repositories;

import java.util.List;

import com.libros.libros.models.Ubicacion;

public interface UbicacionRepository {
    public List<Ubicacion> getAll();
    public List<Ubicacion> getById(Integer id);
    public Ubicacion create(Ubicacion data);
    public Ubicacion update(Ubicacion data, Integer id);
    public void delete(Integer id);
}
