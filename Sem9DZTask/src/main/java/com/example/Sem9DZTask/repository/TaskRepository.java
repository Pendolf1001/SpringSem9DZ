package com.example.Sem9DZTask.repository;

import com.example.Sem9DZTask.model.Task;
import com.example.Sem9DZTask.model.TaskStatus;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {


    @Query("SELECT * FROM tasks WHERE status = :status")
    List<Task> getTaskByStatus(TaskStatus status);
}
