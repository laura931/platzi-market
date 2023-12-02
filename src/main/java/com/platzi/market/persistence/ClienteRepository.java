package com.platzi.market.persistence;

import com.platzi.market.persistence.crud.ClienteCrudRepository;
import com.platzi.market.persistence.entity.Cliente;

import java.util.List;

public class ClienteRepository {
    private ClienteCrudRepository clienteCrudRepository;

    public List<Cliente> getAll(){
        return (List<Cliente>) clienteCrudRepository.findAll();
    }
}
