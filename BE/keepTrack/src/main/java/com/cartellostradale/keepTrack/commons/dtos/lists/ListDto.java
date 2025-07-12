package com.cartellostradale.keepTrack.commons.dtos.lists;

import com.cartellostradale.keepTrack.commons.dtos.abstracts.AbstractDto;
import com.cartellostradale.keepTrack.commons.dtos.listTypes.ListTypeDto;
import com.cartellostradale.keepTrack.commons.dtos.users.UserDto;

public class ListDto extends AbstractDto {

    private String name;
    private String description;
    private long idType;
    private ListTypeDto type;
    private long idUser;
    private UserDto user;

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getIdType() {
        return idType;
    }

    public void setIdType(long idType) {
        this.idType = idType;
    }

    public ListTypeDto getType() {
        return type;
    }

    public void setType(ListTypeDto type) {
        this.type = type;
    }

}
