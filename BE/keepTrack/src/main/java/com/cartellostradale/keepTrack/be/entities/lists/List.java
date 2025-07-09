package com.cartellostradale.keepTrack.be.entities.lists;

import org.hibernate.annotations.SQLRestriction;

import com.cartellostradale.keepTrack.be.entities.abstracts.AbstractEntity;
import com.cartellostradale.keepTrack.be.entities.listTypes.ListType;
import com.cartellostradale.keepTrack.be.entities.users.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "LST_LISTS")
@SQLRestriction(value = "fl_deleted<>true")
public class List extends AbstractEntity {

    private String name;
    private String description;
    private long idType;
    private ListType type;
    private long idUser;
    private User user;

    @Column(name="ID_USER", updatable=true)
    public long getIdUser() {
        return idUser;
    }
    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_USER", insertable= false, updatable = false)
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
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

    @Column(name="ID_TYPE", updatable=true)
    public long getIdType() {
        return idType;
    }
    public void setIdType(long idType) {
        this.idType = idType;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TYPE", insertable= false, updatable = false)
    public ListType getType() {
        return type;
    }
    public void setType(ListType type) {
        this.type = type;
    } 

}
