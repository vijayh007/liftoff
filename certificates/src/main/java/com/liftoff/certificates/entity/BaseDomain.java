package com.liftoff.certificates.entity;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.sql.Timestamp;

/**
 * Created by vijay.hathimare on 1/27/18.
 *
 */
@EqualsAndHashCode
@ToString
@MappedSuperclass
public class BaseDomain {
    @Column(name = "created_at")
    private Timestamp createdAt;
    @Column(name = "updated_at")
    private Timestamp updatedAt;

    public Timestamp getCreatedAt() {
        if(createdAt==null){
            return null;
        }
        return new Timestamp(createdAt.getTime());
    }

    public void setCreatedAt(Timestamp createdAt) {
        if(createdAt == null) {
            this.createdAt = null;
        } else {
            this.createdAt = new Timestamp(createdAt.getTime());
        }
    }

    public Timestamp getUpdatedAt() {
        if(updatedAt==null){
            return null;
        }
        return new Timestamp(updatedAt.getTime());
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        if(updatedAt == null) {
            this.updatedAt = null;
        } else {
            this.updatedAt = new Timestamp(updatedAt.getTime());
        }
    }
}
