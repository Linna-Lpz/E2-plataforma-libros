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

import com.libros.libros.models.Ranking;
import com.libros.libros.repositories.RankingRepository;

@CrossOrigin
@RestController
public class RankingService {
    private final RankingRepository repository;

    RankingService(RankingRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/ranking")
    public List<Ranking> getAll() {
        return repository.getAll();
    }

    @GetMapping("/ranking/{id}")
    public List<Ranking> getById(@PathVariable Integer id) {
        return repository.getById(id);
    }

    @PostMapping("/ranking")
    @ResponseBody
    public Ranking create(@RequestBody Ranking data) {
        return repository.create(data);
    }

    @PutMapping("/ranking/{id}")
    @ResponseBody
    public Ranking update(@RequestBody Ranking data, @PathVariable Integer id) {
        data.setId_ranking(id); 
        return repository.update(data);
    }

    @DeleteMapping("/ranking/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id) {
        String result = repository.delete(id);
        return ResponseEntity.ok(result);
    }

}
