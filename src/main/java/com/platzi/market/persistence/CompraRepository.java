package com.platzi.market.persistence;

import com.platzi.market.persistence.crud.CompraCrudRepository;
import com.platzi.market.persistence.entity.Compra;

import java.util.List;

public class CompraRepository {
    private CompraCrudRepository compraCrudRepository;

    public List<Compra> getAll(){
        return (List<Compra>) compraCrudRepository.findAll();
    }
}
