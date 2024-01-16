package com.platzi.market.persistence.mapper;

import com.platzi.market.domain.Product;
import com.platzi.market.persistence.entity.Producto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

// el atributo uses en la notación Mapper le indica que cuando vaya a convertir categoría, tiene que usar
// el mapper de category
@Mapper(componentModel = "spring", uses = {CategoryMapper.class})
public interface ProductMapper {
    @Mappings({
            @Mapping(source="idProducto", target="productId"),
            @Mapping(source="nombre", target="name"),
            @Mapping(source="idCategoria", target="categoryId"),
            @Mapping(source="precioVenta", target="price"),
            @Mapping(source="cantidadStock", target="stock"),
            @Mapping(source="estado", target="active"),
            @Mapping(source="categoria", target="category"),
    })
    Product toProduct(Producto producto);

    //En este caso no es necesario definir un Mapper ya que internamente sabe que
    // se trata de una conversion de productos a product y empleará el conversor toProduct
    List<Product> toProducts(List<Producto> productos);

    
}
