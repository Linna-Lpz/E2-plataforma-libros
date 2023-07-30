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

import com.libros.libros.models.Factura;
import com.libros.libros.repositories.FacturaRepository;

@CrossOrigin
@RestController
public class FacturaService {
    private final FacturaRepository repository;

    FacturaService(FacturaRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/factura")
    public List<Factura> getAll() {
        return repository.getAll();
    }

    @GetMapping("/factura/{id}")
    public List<Factura> getById(@PathVariable Integer id) {
        return repository.getById(id);
    }

    @PostMapping("/factura")
    @ResponseBody
    public Factura create(@RequestBody Factura data) {
        return repository.create(data);
    }

    @PutMapping("/factura/{id}")
    @ResponseBody
    public Factura update(@RequestBody Factura data, @PathVariable Integer id) {
        data.setId_factura(id); 
        return repository.update(data);
    }

    @DeleteMapping("/factura/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id) {
        String result = repository.delete(id);
        return ResponseEntity.ok(result);
    }

}
