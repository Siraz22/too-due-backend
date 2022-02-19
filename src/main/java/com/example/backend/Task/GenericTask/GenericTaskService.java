package com.example.backend.Task.GenericTask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenericTaskService {

    private GenericTaskRepository genericTaskRepository;

    @Autowired
    public GenericTaskService(GenericTaskRepository genericTaskRepository){
        this.genericTaskRepository = genericTaskRepository;
    }

    public List<GenericTask> getGenericTasks(){
        return genericTaskRepository.findAll();
    }

}
