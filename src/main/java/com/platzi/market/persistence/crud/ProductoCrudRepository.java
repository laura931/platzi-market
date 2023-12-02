package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Categoria;
import com.platzi.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    //Ejemplo de query native
    @Query(value = "SELECT * FROM productos WHERE id_categoria = ?", queryNative = true)
    List<Categoria> getById(int idCategoria);

    //usando queryMethods
    List<Categoria> findByIdCategoria(int idCategoria);
}
