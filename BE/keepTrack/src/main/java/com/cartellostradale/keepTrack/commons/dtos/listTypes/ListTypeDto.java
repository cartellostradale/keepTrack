package com.cartellostradale.keepTrack.commons.dtos.listTypes;

import com.cartellostradale.keepTrack.commons.dtos.abstracts.AbstractDto;

public class ListTypeDto extends AbstractDto {

    private String name;
    private String description;

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

}
