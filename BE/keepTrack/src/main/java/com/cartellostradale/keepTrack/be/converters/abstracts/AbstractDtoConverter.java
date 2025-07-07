package com.cartellostradale.keepTrack.be.converters.abstracts;

import com.cartellostradale.keepTrack.be.entities.abstracts.AbstractEntity;
import com.cartellostradale.keepTrack.commons.dtos.abstracts.AbstractDto;

public class AbstractDtoConverter {

    public static AbstractEntity toEntity(
            AbstractDto dto, AbstractEntity existingEntity) throws Exception {
        AbstractEntity entity = null;
        if (dto != null) {
            if (existingEntity == null) {
                entity = new AbstractEntity();
            } else {
                entity = existingEntity;
            }
            entity.setId(dto.getId());
            entity.setVersion(dto.getVersion());
            entity.setFlDeleted(dto.getFlDeleted());
            entity.setInsertDate(dto.getInsertDate());
            entity.setDeletionDate(dto.getDeletionDate());
        }
        return entity;
    }

    public static AbstractDto toDto(
            AbstractEntity entity, AbstractDto existingDto) throws Exception {
        AbstractDto dto = null;
        if (entity != null) {
            if (existingDto == null) {
                dto = new AbstractDto();
            } else {
                dto = existingDto;
            }
            dto.setId(entity.getId());
            dto.setVersion(entity.getVersion());
            dto.setFlDeleted(entity.getFlDeleted());
            dto.setInsertDate(entity.getInsertDate());
            dto.setDeletionDate(entity.getDeletionDate());
        }
        return dto;
    }

}
