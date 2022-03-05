package com.example.backend.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="interviewTaskTable")
public class InterviewbitTask {
    @Id
    @Column(name="id")
    String id;
    @Column(name="question")
    String question;
    @Column(name="name")
    String difficulty;
    @Column(name="difficulty")
    String link;
    @Column(name="notes")
    String notes;

    public InterviewbitTask(String id, String question, String difficulty, String link, String notes) {
        this.id = id;
        this.question = question;
        this.difficulty = difficulty;
        this.link = link;
        this.notes = notes;
    }

    public InterviewbitTask(){

    }

    public String getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public String getLink() {
        return link;
    }

    public String getNotes() {
        return notes;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "InterviewbitTask{" +
                "id='" + id + '\'' +
                ", question='" + question + '\'' +
                ", difficulty='" + difficulty + '\'' +
                ", link='" + link + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}
