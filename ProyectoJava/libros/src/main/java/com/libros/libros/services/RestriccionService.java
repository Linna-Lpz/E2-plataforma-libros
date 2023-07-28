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

import com.libros.libros.models.Restriccion;
import com.libros.libros.repositories.RestriccionRepository;

@CrossOrigin
@RestController
public class RestriccionService {
    private final RestriccionRepository repository;

    RestriccionService(RestriccionRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/restriccion")
    public List<Restriccion> getAll() {
        return repository.getAll();
    }

    @GetMapping("/restriccion/{id}")
    public List<Restriccion> getById(@PathVariable Integer id) {
        return repository.getById(id);
    }

    @PostMapping("/restriccion")
    @ResponseBody
    public Restriccion create(@RequestBody Restriccion data) {
        return repository.create(data);
    }

    @PutMapping("/restriccion/{id}")
    @ResponseBody
    public Restriccion update(@RequestBody Restriccion data, @PathVariable Integer id) {
        data.setId_restriccion(id); 
        return repository.update(data);
    }

    @DeleteMapping("/restriccion/{id}")
    public void delete(@PathVariable Integer id) {
        repository.delete(id);
    }
}
