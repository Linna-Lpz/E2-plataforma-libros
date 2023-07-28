package com.libros.libros.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import com.libros.libros.models.Tipo_usuario;

@Repository
public class Tipo_usuarioRepositoryImp implements Tipo_usuarioRepository {

    @Autowired
    private Sql2o sql2o;

    @Override
    public List<Tipo_usuario> getAll() {
        try(Connection conn = sql2o.open()) {
            return conn.createQuery("SELECT * FROM tipo_usuario")
            .executeAndFetch(Tipo_usuario.class);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Tipo_usuario> getById(Integer id) {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("SELECT * FROM tipo_usuario WHERE id_tipo_usuario = :id ")
                    .addParameter("id", id)
                    .executeAndFetch(Tipo_usuario.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Tipo_usuario create(Tipo_usuario data) {
        try(Connection conn = sql2o.open()){
            String sql = "INSERT INTO tipo_usuario (\n" +
                             "es_registrado,tipo_rol\n" +
                         ") VALUES (\n" +
                             ":es_registrado, :tipo_rol\n" +
                         ")";
            conn.createQuery(sql, false)
                .addParameter("es_registrado", data.getEs_registrado())
                .addParameter("tipo_rol", data.getTipo_rol())

                .executeUpdate();
                return data;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Tipo_usuario update(Tipo_usuario data) {
        try(Connection conn = sql2o.open()){
            Integer id = data.getId_tipo_usuario();
            String sql = "" +
                "UPDATE tipo_usuario SET\r\n" +
                    "es_registrado = :es_registrado, tipo_rol = :tipo_rol" +
                "WHERE id_tipo_usuario = :id";
            conn.createQuery(sql, false)
                .addParameter("id", id)
                .addParameter("es_registrado", data.getEs_registrado())
                .addParameter("tipo_rol", data.getTipo_rol())

                .executeUpdate();
                return data;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public void delete(Integer id) {
        try(Connection conn = sql2o.open()){
            String sql = "" +
                "DELETE FROM tipo_usuario\r\n" +
                "WHERE id_tipo_usuario = :id";
            conn.createQuery(sql, true)
                .addParameter("id", id)
                .executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
