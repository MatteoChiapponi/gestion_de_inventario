package com.gestion_de_inventario.models;

import java.util.List;

public class Producto {
    private Long id;
    private String nombre;
    private Double precio;
    private String descripcion;
    private Categoria categoriaDelProducto;
    private Proveedor proveedorDelProducto;
    List<StockProducto> stocksDelproducto;

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Categoria getCategoriaDelProducto() {
        return categoriaDelProducto;
    }

    public Proveedor getProveedorDelProducto() {
        return proveedorDelProducto;
    }

}
