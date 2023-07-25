package com.libros.libros.repositories;

import java.util.List;

import com.libros.libros.models.Carrito;

public interface CarritoRepository {
    /**
     * Obtiene todos los elementos
     * @return Lista de clase Carrito o null
     */
    public List<Carrito> getAll();
    /**
     * Obtiene un elemento a través del identificador
     * @param id identificador del carrito
     * @return Lista con un elemento de clase Carrito o null
     */
    public List<Carrito> getById(Integer id);
    /**
     * Crea un elemento
     * @param data dato del tipo (estructura) Carrito
     * @return el Carrito creado o null
     */
    public Carrito create(Carrito data);
    /**
     * Actualiza un elemento a través del identificador
     * @param data dato del tipo (estructura) Carrito
     * @param id identificador del carrito
     * @return el Carrito modificado o null
     */
    public Carrito update(Carrito data, Integer id);
    /**
     * Elimina un elemento a través del identificador
     * @param id identificador del carrito
     */
    public void delete(Integer id);
}
