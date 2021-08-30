package com.mysqldatabaseexample.springbootwarfile.Controllers;

import com.mysqldatabaseexample.springbootwarfile.Entities.TasksEntity;
import com.mysqldatabaseexample.springbootwarfile.Repository.TasksRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddNewTaskController {
    @Autowired
    private TasksRepository tasks;

    @PostMapping("/api/mysql/task/add")
    public ResponseEntity<TasksEntity> addNewTask(@RequestBody TasksEntity newTask) {
        TasksEntity savedTask = tasks.save(newTask);
        return new ResponseEntity<TasksEntity>(savedTask, HttpStatus.CREATED);
    }
}
