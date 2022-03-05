package com.example.backend.controller;

import com.example.backend.service.GenericTaskService;
import com.example.backend.domain.GenericTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/react-api/genericTask")
public class GenericTaskController {

    final private GenericTaskService genericTaskService;

    @Autowired
    public GenericTaskController(GenericTaskService genericTaskService){
        this.genericTaskService = genericTaskService;
    }

    //GET
    @GetMapping(path="/getTasks")
    public List<GenericTask> getTasks(){
        return genericTaskService.getGenericTasks();
    }

    //POST
    @PostMapping(path="/addTask")
    public void putTask(@RequestBody GenericTask newGenericTask){
        genericTaskService.addGenericTask(newGenericTask);
    }

    //DELETE
    @DeleteMapping(path="/deleteTask/{id}")
    public void deleteTask(@PathVariable("id") String id){
        genericTaskService.deleteGenericTask(id);
    }

    //PUT or Update
    @PutMapping(path="/updateTask/{id}")
    public void updateTask(@PathVariable("id") String id, @RequestBody GenericTask updatedTask){
        genericTaskService.updateGenericTask(id, updatedTask);
    }
}
