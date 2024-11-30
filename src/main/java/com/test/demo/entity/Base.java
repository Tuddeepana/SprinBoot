package com.test.demo.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UuidGenerator;
import java.time.LocalDateTime;

//this is a base class for all entities
@MappedSuperclass
@Data
public class Base {

    @Id
    @UuidGenerator
    private Long id;

    @JsonIgnore
    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @JsonIgnore
    @Column(updatable = false , name = "created_by")
    private String createdBy;

    @JsonIgnore
    @Column(updatable = false , name = "last_modification_at")
    private LocalDateTime lastModificationAt;

    @JsonIgnore
    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;


}
