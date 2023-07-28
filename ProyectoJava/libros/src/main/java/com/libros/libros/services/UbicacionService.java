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

import com.libros.libros.models.Ubicacion;
import com.libros.libros.repositories.UbicacionRepository;

@CrossOrigin
@RestController
public class UbicacionService {
    private final UbicacionRepository repository;

    UbicacionService(UbicacionRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/ubicacion")
    public List<Ubicacion> getAll() {
        return repository.getAll();
    }

    @GetMapping("/ubicacion/{id}")
    public List<Ubicacion> getById(@PathVariable Integer id) {
        return repository.getById(id);
    }

    @PostMapping("/ubicacion")
    @ResponseBody
    public Ubicacion create(@RequestBody Ubicacion data) {
        return repository.create(data);
    }

    @PutMapping("/ubicacion/{id}")
    @ResponseBody
    public Ubicacion update(@RequestBody Ubicacion data, @PathVariable Integer id) {
        data.setId_ubicacion(id); 
        return repository.update(data);
    }

    @DeleteMapping("/ubicacion/{id}")
    public void delete(@PathVariable Integer id) {
        repository.delete(id);
    }
}
