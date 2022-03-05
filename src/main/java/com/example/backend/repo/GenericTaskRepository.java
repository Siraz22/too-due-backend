package com.example.backend.repo;

import com.example.backend.domain.GenericTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenericTaskRepository extends JpaRepository<GenericTask, String> {

}
