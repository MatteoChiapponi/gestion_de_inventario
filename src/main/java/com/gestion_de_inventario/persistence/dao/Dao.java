package com.gestion_de_inventario.persistence.dao;

import java.util.List;

public interface Dao <T>{
    T agregar(T t);
    void eliminar(Long id);
    T solicitar(Long id);
    List<T> solicitarTodos();
}
