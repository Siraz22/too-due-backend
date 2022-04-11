package com.example.backend.service;

import com.example.backend.domain.GenericTask;
import com.example.backend.repo.GenericTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class GenericTaskService {

    final private GenericTaskRepository genericTaskRepository;

    @Autowired
    public GenericTaskService(GenericTaskRepository genericTaskRepository){
        this.genericTaskRepository = genericTaskRepository;
    }

    //cRud
    public List<GenericTask> getGenericTasks(){
        return genericTaskRepository.findAll();
    }

    //Crud
    public void addGenericTask(GenericTask newGenericTask){
        genericTaskRepository.save(newGenericTask);
    }

    //cruD
    public void deleteGenericTask(String id){
        genericTaskRepository.deleteById(id);
    }

    //crUd
    @Transactional
    public void updateGenericTask(String id, GenericTask updatedTask){
        //id is passed by react component, hence it will never be non existant or misspelled
        GenericTask toBeUpdated = genericTaskRepository.findById(id).orElseThrow(()-> new IllegalStateException("such id doesn't exist"));

        toBeUpdated.setTaskName(updatedTask.getTaskName());
        toBeUpdated.setPriority(updatedTask.getPriority());
        toBeUpdated.setStatus(updatedTask.getStatus());
    }
}
