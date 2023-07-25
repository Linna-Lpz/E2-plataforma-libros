package com.libros.libros.repositories;

import java.util.List;

import com.libros.libros.models.factura;

public interface facturaRepository {
    public List<factura> getAll();
    public List<factura> getById(Integer id);
    public factura create(factura data);
    public factura update(factura data, Integer id);
    public void delete(Integer id);
}
