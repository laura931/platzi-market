package com.platzi.market.persistence.mapper;

import com.platzi.market.domain.Category;
import com.platzi.market.persistence.entity.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper( componentModel = "spring")
public interface CategoryMapper {
    @Mappings({
            @Mapping(source="idCategoria", target = "categoryId"),
            @Mapping(source="descripcion", target = "category"),
            @Mapping(source="estado", target = "active")
    })
    Category toCategory(Categoria categoria);

    @InheritInverseConfiguration //indica al proyecto que este Mappeo es el inverso al que está arriba. No es necesario definir más mappings
    @Mapping(target="productos", ignore = true) //indica que se ignorará el atributo productos de la clase Categoria en al conversión, Esto es porque en Category, dicho atributo no se emplea
    Categoria toCategoria(Category category);
}
