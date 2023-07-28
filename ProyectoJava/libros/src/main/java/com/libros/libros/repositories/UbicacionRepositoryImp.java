package com.libros.libros.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import com.libros.libros.models.Ubicacion;

@Repository
public class UbicacionRepositoryImp implements UbicacionRepository {

    @Autowired
    private Sql2o sql2o;

    @Override
    public List<Ubicacion> getAll() {
        try(Connection conn = sql2o.open()) {
            return conn.createQuery("SELECT * FROM ubicacion")
            .executeAndFetch(Ubicacion.class);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Ubicacion> getById(Integer id) {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("SELECT * FROM ubicacion WHERE id_ubicacion = :id ")
                    .addParameter("id", id)
                    .executeAndFetch(Ubicacion.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Ubicacion create(Ubicacion data) {
        try(Connection conn = sql2o.open()){
            String sql = "INSERT INTO ubicacion (\n" +
                             "nombre_ubicacion\n" +
                         ") VALUES (\n" +
                             ":nombre_ubicacion\n" +
                         ")";
            conn.createQuery(sql, false)
                .addParameter("nombre_ubicacion", data.getNombre_ubicacion())

                .executeUpdate();
                return data;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Ubicacion update(Ubicacion data) {
        try(Connection conn = sql2o.open()){
            Integer id = data.getId_ubicacion();
            String sql = "" +
                "UPDATE ubicacion SET\r\n" +
                    "nombre_ubicacion = :nombre_ubicacion" +
                "WHERE id_ubicacion = :id";
            conn.createQuery(sql, false)
                .addParameter("id", id)
                .addParameter("nombre_ubicacion", data.getNombre_ubicacion())

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
                "DELETE FROM ubicacion\r\n" +
                "WHERE id_ubicacion = :id";
            conn.createQuery(sql, true)
                .addParameter("id", id)
                .executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
