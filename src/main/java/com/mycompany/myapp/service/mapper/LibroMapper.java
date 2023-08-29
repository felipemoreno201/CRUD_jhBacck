package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.Autor;
import com.mycompany.myapp.domain.Libro;
import com.mycompany.myapp.service.dto.AutorDTO;
import com.mycompany.myapp.service.dto.LibroDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Libro} and its DTO {@link LibroDTO}.
 */
@Mapper(componentModel = "spring")
public interface LibroMapper extends EntityMapper<LibroDTO, Libro> {
    @Mapping(target = "autor", source = "autor", qualifiedByName = "autorId")
    LibroDTO toDto(Libro s);

    @Named("autorId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    AutorDTO toDtoAutorId(Autor autor);
}
