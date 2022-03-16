package com.example.backend.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="genericTaskTable")
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class GenericTask {

    @Id
    @Column(name="id")
    public String id;

    @Column(name="taskName")
    public String taskName;

    @Column(name="priority")
    public String priority;

    @Column(name="status")
    public String status;

}
