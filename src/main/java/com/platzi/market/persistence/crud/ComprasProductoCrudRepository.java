package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.ComprasProducto;
import com.platzi.market.persistence.entity.ComprasProductoPK;
import org.springframework.data.repository.CrudRepository;

public interface ComprasProductoCrudRepository extends CrudRepository<ComprasProducto, ComprasProductoPK> {
}
