package com.cartellostradale.keepTrack.commons.dtos.users;

import com.cartellostradale.keepTrack.commons.dtos.abstracts.AbstractDto;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class UserDto extends AbstractDto{

    @JsonInclude(Include.NON_NULL)
    private String username;

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

}