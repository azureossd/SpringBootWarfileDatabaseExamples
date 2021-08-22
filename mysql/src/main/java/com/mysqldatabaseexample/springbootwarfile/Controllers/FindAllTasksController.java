package com.mysqldatabaseexample.springbootwarfile.Controllers;

import com.mysqldatabaseexample.springbootwarfile.Entities.TasksEntity;
import com.mysqldatabaseexample.springbootwarfile.Repository.TasksRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FindAllTasksController {
    @Autowired
    private TasksRepository tasks;

    @GetMapping("/api/mysql/find_all_tasks")
    public Iterable<TasksEntity> findAllTasks() {
        return tasks.findAll();
    }
}
