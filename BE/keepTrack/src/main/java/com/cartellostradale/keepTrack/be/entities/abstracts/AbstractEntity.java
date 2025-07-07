package com.cartellostradale.keepTrack.be.entities.abstracts;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.SequenceGenerator;

@MappedSuperclass
@SequenceGenerator(name = "seq_ids", sequenceName = "SEQ_IDS", allocationSize = 1)
public class AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_ids")
    private Long id;

    private Long version;
    private Boolean flDeleted;
    private Date insertDate;
    private Date deletionDate;


    @Column(name="ID", updatable=true)
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @Column(name="VERSION", updatable=true)
    public Long getVersion() {
        return version;
    }
    public void setVersion(Long version) {
        this.version = version;
    }

    @Column(name="FL_DELETED", updatable=true)
    public Boolean getFlDeleted() {
        return flDeleted;
    }
    public void setFlDeleted(Boolean flDeleted) {
        this.flDeleted = flDeleted;
    }

    @Column(name="INSERT_DATE", updatable=true)
    public Date getInsertDate() {
        return insertDate;
    }
    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }

    @Column(name="DELETION_DATE", updatable=true)
    public Date getDeletionDate() {
        return deletionDate;
    }
    public void setDeletionDate(Date deletionDate) {
        this.deletionDate = deletionDate;
    }

}