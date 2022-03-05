package com.example.backend.controller;

import com.example.backend.domain.InterviewbitTask;
import com.example.backend.service.InterviewbitTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/react-api/interviewbitTask")
public class InterviewbitTaskController {

    final private InterviewbitTaskService interviewbitTaskService;

    @Autowired
    public InterviewbitTaskController(InterviewbitTaskService interviewbitTaskService){
        this.interviewbitTaskService = interviewbitTaskService;
    }

    //GET
    @GetMapping(path="/getTasks")
    public List<InterviewbitTask> getTasks(){
        return interviewbitTaskService.getInterviewbitTasks();
    }

    //POST
    @PostMapping(path="/addTask")
    public void putTask(@RequestBody InterviewbitTask newInterviewbitTask){
        interviewbitTaskService.addInterviewbitTask(newInterviewbitTask);
    }

    //DELETE
    @DeleteMapping(path="/deleteTask/{id}")
    public void deleteTask(@PathVariable("id") String id){
        interviewbitTaskService.deleteInterviewbitTask(id);
    }

    //PUT or Update
    @PutMapping(path="/updateTask/{id}")
    public void updateTask(@PathVariable("id") String id, @RequestBody InterviewbitTask updatedTask){
        interviewbitTaskService.updateInterviewbitTask(id, updatedTask);
    }

}
