package com.platzi.market.domain.repository;

import com.platzi.market.domain.Product;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

/**
 * Indica el nombre de los métodos que cualquier repositorio que va a trabajar con productos tenga que implementar.
 * Por ejemplo:
 * * ProductoRepository
 */
public interface ProductRepository {
    List<Product> getAll();
    Optional<List<Product>> getByCategory(int categoryId);
    Optional<List<Product>> getScarseProducts(int quantity);
    Optional<Product> getProduct(int productId);
    Product save(Product product);
    void delete (int productId);

}
