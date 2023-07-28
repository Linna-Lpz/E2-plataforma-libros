package com.libros.libros.services;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.libros.libros.models.Libro_carrito;
import com.libros.libros.repositories.Libro_carritoRepository;

@CrossOrigin
@RestController
public class Libro_carritoService {
    private final Libro_carritoRepository repository;

    Libro_carritoService(Libro_carritoRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/libro_carrito")
    public List<Libro_carrito> getAll() {
        return repository.getAll();
    }

    @GetMapping("/libro_carrito/{id}")
    public List<Libro_carrito> getById(@PathVariable Integer id) {
        return repository.getById(id);
    }

    @PostMapping("/libro_carrito")
    @ResponseBody
    public Libro_carrito create(@RequestBody Libro_carrito data) {
        return repository.create(data);
    }

    @PutMapping("/libro_carrito/{id}")
    @ResponseBody
    public Libro_carrito update(@RequestBody Libro_carrito data, @PathVariable Integer id) {
        data.setId_libro_carrito(id); 
        return repository.update(data);
    }

    @DeleteMapping("/libro_carrito/{id}")
    public void delete(@PathVariable Integer id) {
        repository.delete(id);
    }
}
