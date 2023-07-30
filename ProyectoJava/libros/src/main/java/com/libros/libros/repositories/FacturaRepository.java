package com.libros.libros.repositories;

import java.util.List;

import com.libros.libros.models.Factura;

public interface FacturaRepository {
    public List<Factura> getAll();
    public List<Factura> getById(Integer id);
    public Factura create(Factura data);
    public Factura update(Factura data);
    public String delete(Integer id);
}
