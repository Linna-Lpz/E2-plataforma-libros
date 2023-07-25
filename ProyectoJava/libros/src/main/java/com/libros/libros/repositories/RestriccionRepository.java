package com.libros.libros.repositories;

import java.util.List;

import com.libros.libros.models.Restriccion;

public interface RestriccionRepository {
    public List<Restriccion> getAll();
    public List<Restriccion> getById(Integer id);
    public Restriccion create(Restriccion data);
    public Restriccion update(Restriccion data, Integer id);
    public void delete(Integer id);
}
