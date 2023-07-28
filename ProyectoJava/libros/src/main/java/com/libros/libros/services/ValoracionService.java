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

import com.libros.libros.models.Valoracion;
import com.libros.libros.repositories.ValoracionRepository;

@CrossOrigin
@RestController
public class ValoracionService {
    private final ValoracionRepository repository;

    ValoracionService(ValoracionRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/valoracion")
    public List<Valoracion> getAll() {
        return repository.getAll();
    }

    @GetMapping("/valoracion/{id}")
    public List<Valoracion> getById(@PathVariable Integer id) {
        return repository.getById(id);
    }

    @PostMapping("/valoracion")
    @ResponseBody
    public Valoracion create(@RequestBody Valoracion data) {
        return repository.create(data);
    }

    @PutMapping("/valoracion/{id}")
    @ResponseBody
    public Valoracion update(@RequestBody Valoracion data, @PathVariable Integer id) {
        data.setId_valoracion(id); 
        return repository.update(data);
    }

    @DeleteMapping("/valoracion/{id}")
    public void delete(@PathVariable Integer id) {
        repository.delete(id);
    }
}
