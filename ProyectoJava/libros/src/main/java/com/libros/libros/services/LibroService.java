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

import com.libros.libros.models.Libro;
import com.libros.libros.repositories.LibroRepository;

@CrossOrigin
@RestController
public class LibroService {
    private final LibroRepository repository;

    LibroService(LibroRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/libro")
    public List<Libro> getAll() {
        return repository.getAll();
    }

    @GetMapping("/libro/{id}")
    public List<Libro> getById(@PathVariable Integer id) {
        return repository.getById(id);
    }

    @PostMapping("/libro")
    @ResponseBody
    public Libro create(@RequestBody Libro data) {
        return repository.create(data);
    }

    @PutMapping("/libro/{id}")
    @ResponseBody
    public Libro update(@RequestBody Libro data, @PathVariable Integer id) {
        data.setId_libro(id); 
        return repository.update(data);
    }

    @DeleteMapping("/libro/{id}")
    public void delete(@PathVariable Integer id) {
        repository.delete(id);
    }
}
