package com.libros.libros.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import com.libros.libros.models.Valoracion;

@Repository
public class ValoracionRepositoryImp implements ValoracionRepository {

    @Autowired
    private Sql2o sql2o;

    @Override
    public List<Valoracion> getAll() {
        try(Connection conn = sql2o.open()) {
            return conn.createQuery("SELECT * FROM valoracion")
            .executeAndFetch(Valoracion.class);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Valoracion> getById(Integer id) {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("SELECT * FROM valoracion WHERE id_valoracion = :id ")
                    .addParameter("id", id)
                    .executeAndFetch(Valoracion.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Valoracion create(Valoracion data) {
        try(Connection conn = sql2o.open()){
            String sql = "INSERT INTO valoracion (\n" +
                             "comentario,puntuacion,id_libro,id_usuario\n" +
                         ") VALUES (\n" +
                             ":comentario, :puntuacion, :id_libro, :id_usuario\n" +
                         ")";
            conn.createQuery(sql, false)
                .addParameter("comentario", data.getComentario())
                .addParameter("puntuacion", data.getPuntuacion())
                .addParameter("id_libro", data.getId_libro())
                .addParameter("id_usuario", data.getId_usuario())

                .executeUpdate();
                return data;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Valoracion update(Valoracion data) {
        try(Connection conn = sql2o.open()){
            Integer id = data.getId_valoracion();
            String sql = "" +
                "UPDATE valoracion SET\r\n" +
                    "comentario = :comentario, puntuacion = :puntuacion, id_libro = :id_libro, id_usuario = :id_usuario" +
                "WHERE id_valoracion = :id";
            conn.createQuery(sql, false)
                .addParameter("id", id)
                .addParameter("comentario", data.getComentario())
                .addParameter("puntuacion", data.getPuntuacion())
                .addParameter("id_libro", data.getId_libro())
                .addParameter("id_usuario", data.getId_usuario())

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
                "DELETE FROM valoracion\r\n" +
                "WHERE id_valoracion = :id";
            conn.createQuery(sql, true)
                .addParameter("id", id)
                .executeUpdate();
            return "Valoración eliminada correctamente";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Error al eliminar valoración";
        }
    }
    
}
