package com.example.Sem9DZTask.controller;

import com.example.Sem9DZTask.model.Task;
import com.example.Sem9DZTask.model.TaskStatus;
import com.example.Sem9DZTask.service.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
@AllArgsConstructor
public class TaskController {

    private final TaskService taskService;




    @GetMapping
    public List<Task> getAllTask(){
        return  taskService.getAllTask();
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello from  Tasks";
    }


    @PostMapping
    public void transferMoney(@RequestBody Task task){
       taskService.createTask(task);

    }

    @GetMapping ("/status/{status}")
    public List<Task> getTaskByStatus(@PathVariable TaskStatus status){
        return  taskService.getTaskByStatus(status);
    }


    @PutMapping ("/{id}")
    public void taskUpdateStatus(@PathVariable Long id, @RequestBody Task task){
        taskService.taskUpdateStatus(id, task);


    }


    @DeleteMapping ("/{id}")
    public void deleteTask(@PathVariable Long id){
        taskService.deleteTask(id);


    }


}
