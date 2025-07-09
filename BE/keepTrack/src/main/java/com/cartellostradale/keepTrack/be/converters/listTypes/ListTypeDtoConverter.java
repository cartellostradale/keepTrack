package com.cartellostradale.keepTrack.be.converters.listTypes;

import com.cartellostradale.keepTrack.be.converters.abstracts.AbstractDtoConverter;
import com.cartellostradale.keepTrack.be.entities.listTypes.ListType;
import com.cartellostradale.keepTrack.commons.costants.ConversionLevel;
import com.cartellostradale.keepTrack.commons.dtos.listTypes.ListTypeDto;

public class ListTypeDtoConverter {

    public static ListType toEntity(
            ListTypeDto dto, ListType existingEntity) throws Exception {
        ListType entity = null;
        if (dto != null) {
            if (existingEntity == null) {
                entity = new ListType();
            } else {
                entity = existingEntity;
            }
            entity = (ListType) AbstractDtoConverter.toEntity(dto, entity);
            entity.setName(dto.getName());
            entity.setDescription(dto.getDescription());
        }
        return entity;
    }

    public static ListTypeDto toDto(
            ListType entity, ListTypeDto existingDto, Integer conversionConstraint) throws Exception {
        if (conversionConstraint == null) {
            conversionConstraint = ConversionLevel.ENTITY;
        }
        ListTypeDto dto = null;
        if (entity != null) {
            if (existingDto == null) {
                dto = new ListTypeDto();
            } else {
                dto = existingDto;
            }
            dto = (ListTypeDto) AbstractDtoConverter.toDto(entity, dto);
            if (conversionConstraint >= ConversionLevel.ENTITY) {

                dto.setName(entity.getName());
                dto.setDescription(entity.getDescription());

            }

            if (conversionConstraint.equals(ConversionLevel.COMPLETE)) {

            }
            
        }
        return dto;
    }

}
