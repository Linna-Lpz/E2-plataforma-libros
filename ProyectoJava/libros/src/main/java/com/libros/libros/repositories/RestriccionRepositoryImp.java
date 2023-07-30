package com.libros.libros.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import com.libros.libros.models.Restriccion;

@Repository
public class RestriccionRepositoryImp implements RestriccionRepository {

    @Autowired
    private Sql2o sql2o;

    @Override
    public List<Restriccion> getAll() {
        try(Connection conn = sql2o.open()) {
            return conn.createQuery("SELECT * FROM restriccion")
            .executeAndFetch(Restriccion.class);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Restriccion> getById(Integer id) {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("SELECT * FROM restriccion WHERE id_restriccion = :id ")
                    .addParameter("id", id)
                    .executeAndFetch(Restriccion.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Restriccion create(Restriccion data) {
        try(Connection conn = sql2o.open()){
            String sql = "INSERT INTO restriccion (\n" +
                             "edad_minima\n" +
                         ") VALUES (\n" +
                             ":edad_minima\n" +
                         ")";
            conn.createQuery(sql, false)
                .addParameter("edad_minima", data.getEdad_minima())

                .executeUpdate();
                return data;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Restriccion update(Restriccion data) {
        try(Connection conn = sql2o.open()){
            Integer id = data.getId_restriccion();
            String sql = "" +
                "UPDATE restriccion SET\r\n" +
                    "edad_minima = :edad_minima" +
                "WHERE id_restriccion = :id";
            conn.createQuery(sql, false)
                .addParameter("id", id)
                .addParameter("edad_minima", data.getEdad_minima())

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
                "DELETE FROM restriccion\r\n" +
                "WHERE id_restriccion = :id";
            conn.createQuery(sql, true)
                .addParameter("id", id)
                .executeUpdate();
            return "Restriccion eliminada";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Error al eliminar restriccion";
        }
    }
    
}
