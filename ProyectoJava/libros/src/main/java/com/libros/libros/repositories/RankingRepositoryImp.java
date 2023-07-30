package com.libros.libros.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import com.libros.libros.models.Ranking;

@Repository
public class RankingRepositoryImp implements RankingRepository {

    @Autowired
    private Sql2o sql2o;

    @Override
    public List<Ranking> getAll() {
        try(Connection conn = sql2o.open()) {
            return conn.createQuery("SELECT * FROM ranking")
            .executeAndFetch(Ranking.class);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Ranking> getById(Integer id) {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("SELECT * FROM ranking WHERE id_ranking = :id ")
                    .addParameter("id", id)
                    .executeAndFetch(Ranking.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Ranking create(Ranking data) {
        try(Connection conn = sql2o.open()){
            String sql = "INSERT INTO ranking (\n" +
                             "id_libro\n" +
                         ") VALUES (\n" +
                             ":id_libro\n" +
                         ")";
            conn.createQuery(sql, false)
                .addParameter("id_libro", data.getId_libro())

                .executeUpdate();
                return data;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Ranking update(Ranking data) {
        try(Connection conn = sql2o.open()){
            Integer id = data.getId_ranking();
            String sql = "" +
                "UPDATE ranking SET\r\n" +
                    "id_libro = :id_libro" +
                "WHERE id_ranking = :id";
            conn.createQuery(sql, false)
                .addParameter("id", id)
                .addParameter("id_libro", data.getId_libro())

                .executeUpdate();
                return data;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public String delete(Integer id) {
        try(Connection conn = sql2o.open()){
            String sql = "" +
                "DELETE FROM ranking\r\n" +
                "WHERE id_ranking = :id";
            conn.createQuery(sql, true)
                .addParameter("id", id)
                .executeUpdate();
            return "Eliminado correctamente";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Error al eliminar";
        }
    }
    
}
