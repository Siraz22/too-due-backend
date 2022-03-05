package com.example.backend.repo;

import com.example.backend.domain.InterviewbitTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterviewbitTaskRepository extends JpaRepository<InterviewbitTask, String> {
}
