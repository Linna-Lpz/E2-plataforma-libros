package com.libros.libros.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import com.libros.libros.models.Factura;

@Repository
public class FacturaRepositoryImp implements FacturaRepository {

    @Autowired
    private Sql2o sql2o;

    @Override
    public List<Factura> getAll() {
        try(Connection conn = sql2o.open()) {
            return conn.createQuery("SELECT * FROM factura")
            .executeAndFetch(Factura.class);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Factura> getById(Integer id) {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("SELECT * FROM factura WHERE id_factura = :id ")
                    .addParameter("id", id)
                    .executeAndFetch(Factura.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Factura create(Factura data) {
        try(Connection conn = sql2o.open()){
            String sql = "INSERT INTO factura (\n" +
                             "metodo_pago,fecha_factura,id_usuario,id_carrito\n" +
                         ") VALUES (\n" +
                             ":metodo_pago, :fecha_factura, :id_usuario, :id_carrito\n" +
                         ")";
            conn.createQuery(sql, false)
                .addParameter("metodo_pago", data.getMetodo_pago())
                .addParameter("fecha_factura", data.getFecha_factura())
                .addParameter("id_usuario", data.getId_usuario())
                .addParameter("id_carrito", data.getId_carrito())

                .executeUpdate();
                return data;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Factura update(Factura data) {
        try(Connection conn = sql2o.open()){
            Integer id = data.getId_factura();
            String sql = "" +
                "UPDATE factura SET\r\n" +
                    "metodo_pago = :metodo_pago, fecha_factura = :fecha_factura, id_usuario = :id_usuario, id_carrito = :id_carrito" +
                "WHERE id_factura = :id";
            conn.createQuery(sql, false)
                .addParameter("id", id)
                .addParameter("metodo_pago", data.getMetodo_pago())
                .addParameter("fecha_factura", data.getFecha_factura())
                .addParameter("id_usuario", data.getId_usuario())
                .addParameter("id_carrito", data.getId_carrito())

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
                "DELETE FROM factura\r\n" +
                "WHERE id_factura = :id";
            conn.createQuery(sql, true)
                .addParameter("id", id)
                .executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
