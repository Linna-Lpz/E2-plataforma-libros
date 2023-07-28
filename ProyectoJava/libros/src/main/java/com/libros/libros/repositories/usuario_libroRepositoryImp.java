package com.libros.libros.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import com.libros.libros.models.Usuario_libro;

@Repository
public class Usuario_libroRepositoryImp implements Usuario_libroRepository {

    @Autowired
    private Sql2o sql2o;

    @Override
    public List<Usuario_libro> getAll() {
        try(Connection conn = sql2o.open()) {
            return conn.createQuery("SELECT * FROM usuario_libro")
            .executeAndFetch(Usuario_libro.class);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Usuario_libro> getById(Integer id) {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("SELECT * FROM usuario_libro WHERE id_usuario_libro = :id ")
                    .addParameter("id", id)
                    .executeAndFetch(Usuario_libro.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Usuario_libro create(Usuario_libro data) {
        try(Connection conn = sql2o.open()){
            String sql = "INSERT INTO usuario_libro (\n" +
                             "favoritos,id_usuario,id_libro\n" +
                         ") VALUES (\n" +
                             ":favoritos, :id_usuario, :id_libro\n" +
                         ")";
            conn.createQuery(sql, false)
                .addParameter("favoritos", data.getFavoritos())
                .addParameter("id_usuario", data.getId_usuario())
                .addParameter("id_libro", data.getId_libro())

                .executeUpdate();
                return data;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Usuario_libro update(Usuario_libro data) {
        try(Connection conn = sql2o.open()){
            Integer id = data.getId_usuario_libro();
            String sql = "" +
                "UPDATE usuario_libro SET\r\n" +
                    "favoritos = :favoritos, id_usuario = :id_usuario, id_libro = :id_libro" +
                "WHERE id_usuario_libro = :id";
            conn.createQuery(sql, false)
                .addParameter("id", id)
                .addParameter("favoritos", data.getFavoritos())
                .addParameter("id_usuario", data.getId_usuario())
                .addParameter("id_libro", data.getId_libro())

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
                "DELETE FROM usuario_libro\r\n" +
                "WHERE id_usuario_libro = :id";
            conn.createQuery(sql, true)
                .addParameter("id", id)
                .executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
