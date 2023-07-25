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
            return conn.createQuery("SELECT * FROM \"Tipo_usuario\" ORDER BY \"tipo_rol\" ASC")
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
            return conn.createQuery("SELECT * FROM \"Tipo_usuario\" WHERE \"id_tipo_usuario\" = :id ")
                    .addParameter("id", id)
                    .executeAndFetch(Tipo_usuario.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Tipo_usuario create(Tipo_usuario data) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public Tipo_usuario update(Tipo_usuario data, Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public void delete(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    
}
