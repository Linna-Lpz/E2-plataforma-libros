package com.libros.libros.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import com.libros.libros.models.Libro_carrito;

@Repository
public class Libro_carritoRepositoryImp implements Libro_carritoRepository {

    @Autowired
    private Sql2o sql2o;

    @Override
    public List<Libro_carrito> getAll() {
        try(Connection conn = sql2o.open()) {
            return conn.createQuery("SELECT * FROM libro_carrito")
            .executeAndFetch(Libro_carrito.class);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Libro_carrito> getById(Integer id) {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("SELECT * FROM libro_carrito WHERE id_libro_carrito = :id ")
                    .addParameter("id", id)
                    .executeAndFetch(Libro_carrito.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Libro_carrito create(Libro_carrito data) {
        try(Connection conn = sql2o.open()){
            String sql = "INSERT INTO libro_carrito (\n" +
                             "id_libro,id_carrito,cantidad\n" +
                         ") VALUES (\n" +
                             ":id_libro, :id_carrito, :cantidad\n" +
                         ")";
            conn.createQuery(sql, false)
                .addParameter("id_libro", data.getId_libro())
                .addParameter("id_carrito", data.getId_carrito())
                .addParameter("cantidad", data.getCantidad())

                .executeUpdate();
                return data;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Libro_carrito update(Libro_carrito data) {
        try(Connection conn = sql2o.open()){
            Integer id = data.getId_libro_carrito();
            String sql = "" +
                "UPDATE libro_carrito SET\r\n" +
                    "id_libro = :id_libro, id_carrito = :id_carrito, cantidad = :cantidad" +
                "WHERE id_libro_carrito = :id";
            conn.createQuery(sql, false)
                .addParameter("id", id)
                .addParameter("id_libro", data.getId_libro())
                .addParameter("id_carrito", data.getId_carrito())
                .addParameter("cantidad", data.getCantidad())

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
                "DELETE FROM libro_carrito\r\n" +
                "WHERE id_libro_carrito = :id";
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
