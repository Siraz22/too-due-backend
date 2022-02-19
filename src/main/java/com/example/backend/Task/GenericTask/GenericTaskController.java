package com.example.backend.Task.GenericTask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
}
