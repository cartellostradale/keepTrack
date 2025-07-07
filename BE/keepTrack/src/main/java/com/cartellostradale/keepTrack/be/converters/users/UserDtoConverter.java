package com.cartellostradale.keepTrack.be.converters.users;

import com.cartellostradale.keepTrack.be.converters.abstracts.AbstractDtoConverter;
import com.cartellostradale.keepTrack.be.entities.users.User;
import com.cartellostradale.keepTrack.commons.dtos.users.UserDto;

public class UserDtoConverter {

    public static User toEntity(
            UserDto dto, User existingEntity) throws Exception {
        User entity = null;
        if (dto != null) {
            if (existingEntity == null) {
                entity = new User();
            } else {
                entity = existingEntity;
            }
            entity = (User) AbstractDtoConverter.toEntity(dto, entity);
            entity.setUsername(dto.getUsername());
        }
        return entity;
    }

    public static UserDto toDto(
            User entity, UserDto existingDto) throws Exception {
        UserDto dto = null;
        if (entity != null) {
            if (existingDto == null) {
                dto = new UserDto();
            } else {
                dto = existingDto;
            }
            dto = (UserDto) AbstractDtoConverter.toDto(entity, dto);
            dto.setUsername(entity.getUsername());
        }
        return dto;
    }

}