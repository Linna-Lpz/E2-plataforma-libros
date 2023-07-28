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

import com.libros.libros.models.Usuario;
import com.libros.libros.repositories.UsuarioRepository;

@CrossOrigin
@RestController
public class UsuarioService {
    private final UsuarioRepository repository;

    UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/usuario")
    public List<Usuario> getAll() {
        return repository.getAll();
    }

    @GetMapping("/usuario/{id}")
    public List<Usuario> getById(@PathVariable Integer id) {
        return repository.getById(id);
    }

    @PostMapping("/usuario")
    @ResponseBody
    public Usuario create(@RequestBody Usuario data) {
        return repository.create(data);
    }

    @PutMapping("/usuario/{id}")
    @ResponseBody
    public Usuario update(@RequestBody Usuario data, @PathVariable Integer id) {
        data.setId_usuario(id); 
        return repository.update(data);
    }

    @DeleteMapping("/usuario/{id}")
    public void delete(@PathVariable Integer id) {
        repository.delete(id);
    }
}
