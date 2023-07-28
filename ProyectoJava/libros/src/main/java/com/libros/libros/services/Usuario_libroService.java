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

import com.libros.libros.models.Usuario_libro;
import com.libros.libros.repositories.Usuario_libroRepository;

@CrossOrigin
@RestController
public class Usuario_libroService {
    private final Usuario_libroRepository repository;

    Usuario_libroService(Usuario_libroRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/usuario_libro")
    public List<Usuario_libro> getAll() {
        return repository.getAll();
    }

    @GetMapping("/usuario_libro/{id}")
    public List<Usuario_libro> getById(@PathVariable Integer id) {
        return repository.getById(id);
    }

    @PostMapping("/usuario_libro")
    @ResponseBody
    public Usuario_libro create(@RequestBody Usuario_libro data) {
        return repository.create(data);
    }

    @PutMapping("/usuario_libro/{id}")
    @ResponseBody
    public Usuario_libro update(@RequestBody Usuario_libro data, @PathVariable Integer id) {
        data.setId_usuario_libro(id); 
        return repository.update(data);
    }

    @DeleteMapping("/usuario_libro/{id}")
    public void delete(@PathVariable Integer id) {
        repository.delete(id);
    }
}
