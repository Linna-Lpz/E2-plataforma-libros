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
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.libros.libros.models.Carrito;
import com.libros.libros.repositories.CarritoRepository;

@CrossOrigin
@RestController
public class CarritoService {
    private final CarritoRepository repository;

    CarritoService(CarritoRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/carrito")
    public List<Carrito> getAll() {
        return repository.getAll();
    }

    @GetMapping("/carrito/{id}")
    public List<Carrito> getById(@PathVariable Integer id) {
        return repository.getById(id);
    }

    @PostMapping("/carrito")
    @ResponseBody
    public Carrito create(@RequestBody Carrito data) {
        return repository.create(data);
    }

    @PutMapping("/carrito/{id}")
    @ResponseBody
    public Carrito update(@RequestBody Carrito data, @PathVariable Integer id) {
        data.setId_carrito(id); 
        return repository.update(data);
    }

    @DeleteMapping("/carrito/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id) {
        String result = repository.delete(id);
        return ResponseEntity.ok(result);
    }

}