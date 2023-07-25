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

import com.libros.libros.models.Carrito;
import com.libros.libros.repositories.CarritoRepository;

@CrossOrigin
@RestController
public class CarritoService {
    private final CarritoRepository carritoRepository;

    CarritoService(CarritoRepository carritoRepository) {
        this.carritoRepository = carritoRepository;
    }

    @GetMapping("/carrito")
    public List<Carrito> getAll() {
        return carritoRepository.getAll();
    }

    @GetMapping("/carrito/{id}")
    public List<Carrito> getById(@PathVariable Integer id) {
        return carritoRepository.getById(id);
    }

    @PostMapping("/carrito")
    @ResponseBody
    public Carrito create(@RequestBody Carrito data) {
        return carritoRepository.create(data);
    }

    @PutMapping("/carrito/{id}")
    @ResponseBody
    public Carrito update(@RequestBody Carrito data, @PathVariable Integer id) {
        return carritoRepository.update(data, id);
    }

    @DeleteMapping("/carrito/{id}")
    public void delete(@PathVariable Integer id) {
        carritoRepository.delete(id);
    }
}
