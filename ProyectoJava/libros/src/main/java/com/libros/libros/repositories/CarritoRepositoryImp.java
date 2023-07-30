package com.libros.libros.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import com.libros.libros.models.Carrito;

@Repository
public class CarritoRepositoryImp implements CarritoRepository {

    @Autowired
    private Sql2o sql2o;

    @Override
    public List<Carrito> getAll() {
        try(Connection conn = sql2o.open()) {
            return conn.createQuery("SELECT * FROM carrito")
            .executeAndFetch(Carrito.class);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Carrito> getById(Integer id) {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("SELECT * FROM carrito WHERE id_carrito = :id ")
                    .addParameter("id", id)
                    .executeAndFetch(Carrito.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Carrito create(Carrito data) {
        try(Connection conn = sql2o.open()){
            String sql = "INSERT INTO carrito (\n" +
                             "ubicacion,id_usuario\n" +
                         ") VALUES (\n" +
                             ":ubicacion, :id_usuario\n" +
                         ")";
            conn.createQuery(sql, false)
                .addParameter("ubicacion", data.getUbicacion())
                .addParameter("id_usuario", data.getId_usuario())

                .executeUpdate();
                return data;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Carrito update(Carrito data) {
        try(Connection conn = sql2o.open()){
            Integer id = data.getId_carrito();
            String sql = "" +
                "UPDATE carrito SET\r\n" +
                    "ubicacion = :ubicacion, id_usuario = :id_usuario" +
                "WHERE id_carrito = :id";
            conn.createQuery(sql, false)
                .addParameter("id", id)
                .addParameter("ubicacion", data.getUbicacion())
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
                "DELETE FROM carrito\r\n" +
                "WHERE id_carrito = :id";
            conn.createQuery(sql, true)
                .addParameter("id", id)
                .executeUpdate();
            return "Carrito eliminado correctamente";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Error al eliminar";
        }
    }
    
}
