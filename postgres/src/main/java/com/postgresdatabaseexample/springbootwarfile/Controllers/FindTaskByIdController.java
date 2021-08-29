package com.postgresdatabaseexample.springbootwarfile.Controllers;

import javax.persistence.EntityNotFoundException;

import com.postgresdatabaseexample.springbootwarfile.Entities.TasksEntity;
import com.postgresdatabaseexample.springbootwarfile.Repository.TasksRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FindTaskByIdController {
    @Autowired
    private TasksRepository tasks;

    @GetMapping("/api/postgres/task/find/{id}")
    public TasksEntity findTaskById(@PathVariable int id) {
        return tasks.findById(id).orElseThrow(() -> new EntityNotFoundException("Task not found with ID: " + id));
    }
}
