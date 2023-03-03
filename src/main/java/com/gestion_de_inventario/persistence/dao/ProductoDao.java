package com.gestion_de_inventario.persistence.dao;

import com.gestion_de_inventario.models.Producto;
import com.gestion_de_inventario.persistence.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class ProductoDao implements Dao<Producto>{
    private Connection connection;
    private PreparedStatement ps;
    private ResultSet rs;

    @Override
    public Producto agregar(Producto producto) {
        connection= DbConnection.getConnection();


        return null;
    }

    @Override
    public void eliminar(Long id) {

    }

    @Override
    public Producto solicitar(Long id) {
        return null;
    }

    @Override
    public List<Producto> solicitarTodos() {
        return null;
    }
}
