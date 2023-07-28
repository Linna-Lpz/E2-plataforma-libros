package com.libros.libros.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import com.libros.libros.models.Libro;

@Repository
public class LibroRepositoryImp implements LibroRepository {

    @Autowired
    private Sql2o sql2o;

    @Override
    public List<Libro> getAll() {
        try(Connection conn = sql2o.open()) {
            return conn.createQuery("SELECT * FROM libro")
            .executeAndFetch(Libro.class);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Libro> getById(Integer id) {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("SELECT * FROM libro WHERE id_libro = :id ")
                    .addParameter("id", id)
                    .executeAndFetch(Libro.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Libro create(Libro data) {
        try(Connection conn = sql2o.open()){
            String sql = "INSERT INTO libro (\n" +
                             "agno,descripcion,editorial,genero_libro,link,nombre_libro,precio,stock,tipo_libro,numero_favoritos,nombre_autor,id_restriccion,id_ubicacion\n" +
                         ") VALUES (\n" +
                             ":agno, :descripcion, :editorial, :genero_libro, :link, :nombre_libro, :precio, :stock, :tipo_libro, :numero_favoritos, :nombre_autor, :id_restriccion, :id_ubicacion\n" +
                         ")";
            conn.createQuery(sql, false)
                .addParameter("agno", data.getAgno())
                .addParameter("descripcion", data.getDescripcion())
                .addParameter("editorial", data.getEditorial())
                .addParameter("genero_libro", data.getGenero_libro())
                .addParameter("link", data.getLink())
                .addParameter("nombre_libro", data.getNombre_libro())
                .addParameter("precio", data.getPrecio())
                .addParameter("stock", data.getStock())
                .addParameter("tipo_libro", data.getTipo_libro())
                .addParameter("numero_favoritos", data.getNumero_favoritos())
                .addParameter("nombre_autor", data.getNombre_autor())
                .addParameter("id_restriccion", data.getId_restriccion())
                .addParameter("id_ubicacion", data.getId_ubicacion())

                .executeUpdate();
                return data;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Libro update(Libro data) {
        try(Connection conn = sql2o.open()){
            Integer id = data.getId_libro();
            String sql = "" +
                "UPDATE libro SET\r\n" +
                    "agno = :agno, descripcion = :descripcion, editorial = :editorial, genero_libro = :genero_libro, link = :link, nombre_libro = :nombre_libro, precio = :precio, stock = :stock, tipo_libro = :tipo_libro, numero_favoritos = :numero_favoritos, nombre_autor = :nombre_autor, id_restriccion = :id_restriccion, id_ubicacion = :id_ubicacion" +
                "WHERE id_libro = :id";
            conn.createQuery(sql, false)
                .addParameter("id", id)
                .addParameter("agno", data.getAgno())
                .addParameter("descripcion", data.getDescripcion())
                .addParameter("editorial", data.getEditorial())
                .addParameter("genero_libro", data.getGenero_libro())
                .addParameter("link", data.getLink())
                .addParameter("nombre_libro", data.getNombre_libro())
                .addParameter("precio", data.getPrecio())
                .addParameter("stock", data.getStock())
                .addParameter("tipo_libro", data.getTipo_libro())
                .addParameter("numero_favoritos", data.getNumero_favoritos())
                .addParameter("nombre_autor", data.getNombre_autor())
                .addParameter("id_restriccion", data.getId_restriccion())
                .addParameter("id_ubicacion", data.getId_ubicacion())

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
                "DELETE FROM libro\r\n" +
                "WHERE id_libro = :id";
            conn.createQuery(sql, true)
                .addParameter("id", id)
                .executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
