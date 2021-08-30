package com.mysqldatabaseexample.springbootwarfile.Controllers;

import javax.persistence.EntityNotFoundException;

import com.mysqldatabaseexample.springbootwarfile.Entities.TasksEntity;
import com.mysqldatabaseexample.springbootwarfile.Repository.TasksRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FindTaskByIdController {
    @Autowired
    private TasksRepository tasks;

    @GetMapping("/api/mysql/task/find/{id}")
    public TasksEntity findAllTasks(@PathVariable int id) {
        return tasks.findById(id).orElseThrow(() -> new EntityNotFoundException("Task not found with ID: " + id));
    }
}
