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

import com.libros.libros.models.factura;
import com.libros.libros.repositories.facturaRepository;

@CrossOrigin
@RestController
public class facturaService {
    private final facturaRepository facturaRepository;

    facturaService(facturaRepository facturaRepository) {
        this.facturaRepository = facturaRepository;
    }

    @GetMapping("/factura")
    public List<factura> getAll() {
        return facturaRepository.getAll();
    }

    @GetMapping("/factura/{id}")
    public List<factura> getById(@PathVariable Integer id) {
        return facturaRepository.getById(id);
    }

    @PostMapping("/factura")
    @ResponseBody
    public factura create(@RequestBody factura data) {
        return facturaRepository.create(data);
    }

    @PutMapping("/factura/{id}")
    @ResponseBody
    public factura update(@RequestBody factura data, @PathVariable Integer id) {
        return facturaRepository.update(data, id);
    }

    @DeleteMapping("/factura/{id}")
    public void delete(@PathVariable Integer id) {
        facturaRepository.delete(id);
    }
}
