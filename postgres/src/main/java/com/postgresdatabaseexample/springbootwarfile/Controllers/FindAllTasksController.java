package com.postgresdatabaseexample.springbootwarfile.Controllers;

import com.postgresdatabaseexample.springbootwarfile.Entities.TasksEntity;
import com.postgresdatabaseexample.springbootwarfile.Repository.TasksRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FindAllTasksController {
    @Autowired
    private TasksRepository tasks;
    
    @GetMapping("/api/postgres/task/find")
    public Iterable<TasksEntity> findAllTasks() {
        return tasks.findAll();
    }
}
