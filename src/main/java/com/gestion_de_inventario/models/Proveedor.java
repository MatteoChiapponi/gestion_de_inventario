package com.gestion_de_inventario.models;

public class Proveedor {
    private Integer id;
    private String nombre;
    private String direccion;
    private String numeroDeContacto;

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNumeroDeContacto() {
        return numeroDeContacto;
    }
}
