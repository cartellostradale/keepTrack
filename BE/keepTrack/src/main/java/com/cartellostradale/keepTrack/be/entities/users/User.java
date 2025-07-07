package com.cartellostradale.keepTrack.be.entities.users;

import org.hibernate.annotations.SQLRestriction;

import com.cartellostradale.keepTrack.be.entities.abstracts.AbstractEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "USR_USERS")
@SQLRestriction(value = "fl_deleted<>true")
public class User extends AbstractEntity {

    private String username;

    @Column(name="USERNAME", updatable=true)
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

}