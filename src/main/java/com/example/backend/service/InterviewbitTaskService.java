package com.example.backend.service;

import com.example.backend.domain.InterviewbitTask;
import com.example.backend.repo.InterviewbitTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class InterviewbitTaskService {

    private InterviewbitTaskRepository interviewbitTaskRepository;

    @Autowired
    public InterviewbitTaskService(InterviewbitTaskRepository interviewbitTaskRepository){
        this.interviewbitTaskRepository = interviewbitTaskRepository;
    }

    //cRud
    public List<InterviewbitTask> getInterviewbitTasks(){
        return interviewbitTaskRepository.findAll();
    }

    //Crud
    public void addInterviewbitTask(InterviewbitTask newInterviewbitTask){
        interviewbitTaskRepository.save(newInterviewbitTask);
    }

    //cruD
    public void deleteInterviewbitTask(String id){
        interviewbitTaskRepository.deleteById(id);
    }

    //crUd
    @Transactional
    public void updateInterviewbitTask(String id, InterviewbitTask updatedTask){
        //id is passed by react component, hence it will never be non existant or misspelled
        InterviewbitTask toBeUpdated = interviewbitTaskRepository.findById(id).orElseThrow(()-> new IllegalStateException("such id doesn't exist"));

        toBeUpdated.setQuestion(updatedTask.getQuestion());
        toBeUpdated.setLink(updatedTask.getLink());
        toBeUpdated.setNotes(updatedTask.getNotes());
        toBeUpdated.setDifficulty(updatedTask.getDifficulty());
        toBeUpdated.setCompleted(updatedTask.getCompleted());
    }
}
