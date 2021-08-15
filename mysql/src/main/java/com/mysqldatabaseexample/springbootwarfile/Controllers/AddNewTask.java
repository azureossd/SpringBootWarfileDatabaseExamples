package com.mysqldatabaseexample.springbootwarfile.Controllers;

import com.mysqldatabaseexample.springbootwarfile.Entities.TasksEntity;
import com.mysqldatabaseexample.springbootwarfile.Repository.TasksRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddNewTask {
    @Autowired
    private TasksRepository tasks;

    String message = "Work in progress";
    
    @GetMapping("/add_new_task")
    public String addNewTask() {
        return message;
    }
}
