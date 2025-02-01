package com.xworkz.gym.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@MappedSuperclass
public class AbstractAuditEntity implements Serializable {
    //private String createdBy;
    //private LocalDateTime createdDate = LocalDateTime.now();
    //private String updatedBy;
    @Column(name = "updated_date")
    private LocalDateTime updatedDate ;
}
