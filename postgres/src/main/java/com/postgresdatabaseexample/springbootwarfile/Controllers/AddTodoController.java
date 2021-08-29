package com.postgresdatabaseexample.springbootwarfile.Controllers;

import com.postgresdatabaseexample.springbootwarfile.Entities.TasksEntity;
import com.postgresdatabaseexample.springbootwarfile.Repository.TasksRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddTodoController {
    @Autowired
    private TasksRepository tasks;

    @PostMapping("/api/postgres/task/add")
    public ResponseEntity<TasksEntity> addTodo(@RequestBody TasksEntity newTodo) {
        TasksEntity newAddedTodo = tasks.save(newTodo);
        return new ResponseEntity<TasksEntity>(newAddedTodo, HttpStatus.CREATED);
    }
}
