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

import com.libros.libros.models.Tipo_usuario;
import com.libros.libros.repositories.Tipo_usuarioRepository;

@CrossOrigin
@RestController
public class Tipo_usuarioService {
    private final Tipo_usuarioRepository repository;

    Tipo_usuarioService(Tipo_usuarioRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/tipo_usuario")
    public List<Tipo_usuario> getAll() {
        return repository.getAll();
    }

    @GetMapping("/tipo_usuario/{id}")
    public List<Tipo_usuario> getById(@PathVariable Integer id) {
        return repository.getById(id);
    }

    @PostMapping("/tipo_usuario")
    @ResponseBody
    public Tipo_usuario create(@RequestBody Tipo_usuario data) {
        return repository.create(data);
    }

    @PutMapping("/tipo_usuario/{id}")
    @ResponseBody
    public Tipo_usuario update(@RequestBody Tipo_usuario data, @PathVariable Integer id) {
        data.setId_tipo_usuario(id); 
        return repository.update(data);
    }

    @DeleteMapping("/tipo_usuario/{id}")
    public void delete(@PathVariable Integer id) {
        repository.delete(id);
    }
}
