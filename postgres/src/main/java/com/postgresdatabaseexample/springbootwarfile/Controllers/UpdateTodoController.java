package com.postgresdatabaseexample.springbootwarfile.Controllers;

import javax.persistence.EntityNotFoundException;

import com.postgresdatabaseexample.springbootwarfile.Entities.TasksEntity;
import com.postgresdatabaseexample.springbootwarfile.Repository.TasksRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdateTodoController {
    @Autowired
    private TasksRepository tasks;

    @PutMapping("/api/postgres/task/update/{id}")
    public ResponseEntity<TasksEntity> updateTask(@PathVariable int id, @RequestBody TasksEntity updateTodo) {
        var updateTaskById = tasks.findById(id).orElseThrow(() -> new EntityNotFoundException("Task not found with ID " + id));
        updateTaskById.setCompleted(updateTodo.getCompleted());
        updateTaskById.setName(updateTodo.getName());
        TasksEntity updatedTodo = tasks.save(updateTaskById);
        return ResponseEntity.ok(updatedTodo);
    }
}
