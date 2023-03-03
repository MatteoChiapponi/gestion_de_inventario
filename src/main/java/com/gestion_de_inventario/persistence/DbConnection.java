package com.gestion_de_inventario.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    public static Connection getConnection(){
        String url = "jdbc:mysql://127.0.0.1:3306/gestion_de_productos?";
        String user = "root";
        String pass = "root";
        try {
            Connection connection = DriverManager.getConnection(url, user, pass);
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
