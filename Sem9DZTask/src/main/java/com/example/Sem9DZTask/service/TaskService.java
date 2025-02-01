package com.example.Sem9DZTask.service;

import com.example.Sem9DZTask.model.Task;
import com.example.Sem9DZTask.model.TaskStatus;
import com.example.Sem9DZTask.repository.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class TaskService {


    private final TaskRepository repositoty;


    public List<Task> getAllTask() {

        return repositoty.findAll();

    }


    public Optional<Task> getTaskById(Long id) {
        return repositoty.findById(id);
    }


    public List<Task> createTask(Task task) {
        repositoty.save(task);
        return repositoty.findAll();
    }


    public List<Task> getTaskByStatus(TaskStatus status){
        return  repositoty.getTaskByStatus(status);
    }


    public void taskUpdateStatus(Long id, Task taskDetails) {

        Optional<Task> optionalTask = repositoty.findById(id);

        if (optionalTask.isPresent()) {
            Task task = optionalTask.get();
            task.setStatus(taskDetails.getStatus());


            repositoty.save(task);

        } else {
            throw new IllegalArgumentException("Task not found with id : " + id);
        }


    }


    public void deleteTask(Long id){
        repositoty.deleteById(id);
    }

}