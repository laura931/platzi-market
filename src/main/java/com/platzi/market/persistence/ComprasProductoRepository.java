package com.platzi.market.persistence;

import com.platzi.market.persistence.crud.ComprasProductoCrudRepository;
import com.platzi.market.persistence.entity.ComprasProducto;

import java.util.List;

public class ComprasProductoRepository {
    private ComprasProductoCrudRepository comprasProductoCrudRepository;

    public List<ComprasProducto> getAll(){
        return (List<ComprasProducto>) comprasProductoCrudRepository.findAll();
    }
}
