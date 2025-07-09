package com.cartellostradale.keepTrack.be.entities.listTypes;

import org.hibernate.annotations.SQLRestriction;

import com.cartellostradale.keepTrack.be.entities.abstracts.AbstractEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "LST_LIST_TYPES")
@SQLRestriction(value = "fl_deleted<>true")
public class ListType extends AbstractEntity {

    private String name;
    private String description;


    @Column(name="NAME", updatable=true)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Column(name="DESCRIPTION", updatable=true)
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
