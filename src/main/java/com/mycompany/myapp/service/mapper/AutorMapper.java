package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.Autor;
import com.mycompany.myapp.service.dto.AutorDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Autor} and its DTO {@link AutorDTO}.
 */
@Mapper(componentModel = "spring")
public interface AutorMapper extends EntityMapper<AutorDTO, Autor> {}
