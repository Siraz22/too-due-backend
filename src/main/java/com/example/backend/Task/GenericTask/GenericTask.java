package com.example.backend.Task.GenericTask;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="genericTaskTable")
public class GenericTask {

    @Id
    public String id;
    public String taskName;
    public String priority;
    public String status;

    public GenericTask(String id, String taskName, String priority, String status) {
        this.id = id;
        this.taskName = taskName;
        this.priority = priority;
        this.status = status;
    }

    public GenericTask(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "GenericTask{" +
                "id='" + id + '\'' +
                ", taskName='" + taskName + '\'' +
                ", priority='" + priority + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}