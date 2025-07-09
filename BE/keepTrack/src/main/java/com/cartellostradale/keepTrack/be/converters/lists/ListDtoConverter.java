package com.cartellostradale.keepTrack.be.converters.lists;

import com.cartellostradale.keepTrack.be.converters.abstracts.AbstractDtoConverter;
import com.cartellostradale.keepTrack.be.converters.listTypes.ListTypeDtoConverter;
import com.cartellostradale.keepTrack.be.converters.users.UserDtoConverter;
import com.cartellostradale.keepTrack.be.entities.lists.List;
import com.cartellostradale.keepTrack.commons.costants.ConversionLevel;
import com.cartellostradale.keepTrack.commons.dtos.lists.ListDto;

public class ListDtoConverter {

    public static List toEntity(
            ListDto dto, List existingEntity) throws Exception {
        List entity = null;
        if (dto != null) {
            if (existingEntity == null) {
                entity = new List();
            } else {
                entity = existingEntity;
            }
            entity = (List) AbstractDtoConverter.toEntity(dto, entity);
            entity.setName(dto.getName());
            entity.setDescription(dto.getDescription());
            entity.setIdType(dto.getIdType());
            entity.setIdUser(dto.getIdUser());
        }
        return entity;
    }

    public static ListDto toDto(
            List entity, ListDto existingDto, Integer conversionConstraint) throws Exception {
        if (conversionConstraint == null) {
            conversionConstraint = ConversionLevel.ENTITY;
        }
        ListDto dto = null;
        if (entity != null) {
            if (existingDto == null) {
                dto = new ListDto();
            } else {
                dto = existingDto;
            }
            dto = (ListDto) AbstractDtoConverter.toDto(entity, dto);
            if (conversionConstraint >= ConversionLevel.ENTITY) {

                dto.setName(entity.getName());
                dto.setDescription(entity.getDescription());
                dto.setIdType(entity.getIdType());
                dto.setIdUser(entity.getIdUser());

            }

            if (conversionConstraint.equals(ConversionLevel.COMPLETE)) {
                dto.setType(ListTypeDtoConverter.toDto(entity.getType(), null, ConversionLevel.ENTITY));
                dto.setUser(UserDtoConverter.toDto(entity.getUser(), null, ConversionLevel.ENTITY));
            }
            
        }
        return dto;
    }

}
