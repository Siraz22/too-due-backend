package com.example.backend.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter @Setter @ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name="interviewTaskTable")
public class InterviewbitTask {
    @Id
    @Column(name="id")
    String id;
    @Column(name="question")
    String question;
    @Column(name="difficulty")
    String difficulty;
    @Column(name="link")
    String link;
    @Column(name="notes")
    String notes;
    @Column(name="completed")
    Boolean completed;
    @Column(name="topic")
    String topic;
}
