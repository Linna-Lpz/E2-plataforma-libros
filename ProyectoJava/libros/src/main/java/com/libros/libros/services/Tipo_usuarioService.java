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
    private final Tipo_usuarioRepository tipo_usuarioRepository;

    Tipo_usuarioService(Tipo_usuarioRepository tipo_usuarioRepository) {
        this.tipo_usuarioRepository = tipo_usuarioRepository;
    }

    @GetMapping("/tipo_usuario")
    public List<Tipo_usuario> getAll() {
        return tipo_usuarioRepository.getAll();
    }

    @GetMapping("/tipo_usuario/{id}")
    public List<Tipo_usuario> getById(@PathVariable Integer id) {
        return tipo_usuarioRepository.getById(id);
    }

    @PostMapping("/tipo_usuario")
    @ResponseBody
    public Tipo_usuario create(@RequestBody Tipo_usuario tipo_usuario) {
        return tipo_usuarioRepository.create(tipo_usuario);
    }

    @PutMapping("/tipo_usuario/{id}")
    @ResponseBody
    public Tipo_usuario update(@RequestBody Tipo_usuario tipo_usuario, @PathVariable Integer id) {
        return tipo_usuarioRepository.update(tipo_usuario, id);
    }

    @DeleteMapping("/tipo_usuario/{id}")
    public void delete(@PathVariable Integer id) {
        tipo_usuarioRepository.delete(id);
    }
}
