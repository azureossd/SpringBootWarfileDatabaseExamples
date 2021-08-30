package com.mysqldatabaseexample.springbootwarfile.Controllers;

import com.mysqldatabaseexample.springbootwarfile.Repository.TasksRepository;

import javax.persistence.EntityNotFoundException;

import com.mysqldatabaseexample.springbootwarfile.Entities.TasksEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdateTaskController {
    @Autowired
    private TasksRepository tasks;

    @PutMapping("/api/mysql/task/update/{id}")
    public ResponseEntity<TasksEntity> updateTask(@PathVariable int id, @RequestBody TasksEntity updatedTask) {
        // Check if the task exists first before doing an update
        TasksEntity task = tasks.findById(id).orElseThrow(() -> new EntityNotFoundException("Task not found with ID: " + id));
        // Update the completed boolean and name field
        task.setCompleted(updatedTask.getCompleted());
        task.setName(updatedTask.getName());
        TasksEntity savedTask = tasks.save(task);
        // Return the updated task in the response
        return ResponseEntity.ok(savedTask);
    }
}
