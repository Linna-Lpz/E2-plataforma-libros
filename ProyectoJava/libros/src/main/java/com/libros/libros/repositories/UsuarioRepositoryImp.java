package com.libros.libros.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import com.libros.libros.models.Usuario;

@Repository
public class UsuarioRepositoryImp implements UsuarioRepository {

    @Autowired
    private Sql2o sql2o;

    @Override
    public List<Usuario> getAll() {
        try(Connection conn = sql2o.open()) {
            return conn.createQuery("SELECT * FROM usuario")
            .executeAndFetch(Usuario.class);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Usuario> getById(Integer id) {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("SELECT * FROM usuario WHERE id_usuario = :id ")
                    .addParameter("id", id)
                    .executeAndFetch(Usuario.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Usuario create(Usuario data) {
        try(Connection conn = sql2o.open()){
            String sql = "INSERT INTO usuario (\n" +
                             "correo,fecha_nacimiento,contrasegna,nombre_usuario,id_tipo_usuario,id_ubicacion\n" +
                         ") VALUES (\n" +
                             ":correo, :fecha_nacimiento, :contrasegna, :nombre_usuario, :id_tipo_usuario, :id_ubicacion\n" +
                         ")";
            conn.createQuery(sql, false)
                .addParameter("correo", data.getCorreo())
                .addParameter("fecha_nacimiento", data.getFecha_nacimiento())
                .addParameter("contrasegna", data.getContrasegna())
                .addParameter("nombre_usuario", data.getNombre_usuario())
                .addParameter("id_tipo_usuario", data.getId_tipo_usuario())
                .addParameter("id_ubicacion", data.getId_ubicacion())

                .executeUpdate();
                return data;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Usuario update(Usuario data) {
        try(Connection conn = sql2o.open()){
            Integer id = data.getId_usuario();
            String sql = "" +
                "UPDATE usuario SET\r\n" +
                    "correo = :correo, fecha_nacimiento = :fecha_nacimiento, contrasegna = :contrasegna, nombre_usuario = :nombre_usuario, id_tipo_usuario = :id_tipo_usuario, id_ubicacion = :id_ubicacion" +
                "WHERE id_usuario = :id";
            conn.createQuery(sql, false)
                .addParameter("id", id)
                .addParameter("correo", data.getCorreo())
                .addParameter("fecha_nacimiento", data.getFecha_nacimiento())
                .addParameter("contrasegna", data.getContrasegna())
                .addParameter("nombre_usuario", data.getNombre_usuario())
                .addParameter("id_tipo_usuario", data.getId_tipo_usuario())
                .addParameter("id_ubicacion", data.getId_ubicacion())

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
                "DELETE FROM usuario\r\n" +
                "WHERE id_usuario = :id";
            conn.createQuery(sql, true)
                .addParameter("id", id)
                .executeUpdate();
            return "Usuario eliminado correctamente";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Error al eliminar usuario";
        }
    }

}
