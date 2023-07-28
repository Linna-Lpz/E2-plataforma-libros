package com.libros.libros.repositories;

import java.util.List;

import com.libros.libros.models.Ranking;

public interface RankingRepository {
    public List<Ranking> getAll();
    public List<Ranking> getById(Integer id);
    public Ranking create(Ranking data);
    public Ranking update(Ranking data);
    public void delete(Integer id);
}
