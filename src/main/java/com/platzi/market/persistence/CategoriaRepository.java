package com.platzi.market.persistence;

import com.platzi.market.persistence.crud.CategoriaCrudRepository;
import com.platzi.market.persistence.entity.Categoria;

import java.util.List;

public class CategoriaRepository {
    private CategoriaCrudRepository categoriaCrudRepository;

    public List<Categoria> getAll(){
        return (List<Categoria>) categoriaCrudRepository.findAll();
    }
}
