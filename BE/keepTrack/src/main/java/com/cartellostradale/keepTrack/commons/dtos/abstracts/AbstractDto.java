package com.cartellostradale.keepTrack.commons.dtos.abstracts;

import java.util.Date;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class AbstractDto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_ids")
    private Long id;

    private Long version;
    private Boolean flDeleted;
    private Date insertDate;
    private Date deletionDate;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }
    public void setVersion(Long version) {
        this.version = version;
    }

    public Boolean getFlDeleted() {
        return flDeleted;
    }
    public void setFlDeleted(Boolean flDeleted) {
        this.flDeleted = flDeleted;
    }

    public Date getInsertDate() {
        return insertDate;
    }
    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }

    public Date getDeletionDate() {
        return deletionDate;
    }
    public void setDeletionDate(Date deletionDate) {
        this.deletionDate = deletionDate;
    }

}