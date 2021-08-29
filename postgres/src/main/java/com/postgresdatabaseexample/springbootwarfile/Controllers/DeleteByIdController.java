package com.postgresdatabaseexample.springbootwarfile.Controllers;

import javax.persistence.EntityNotFoundException;

import com.postgresdatabaseexample.springbootwarfile.Entities.TasksEntity;
import com.postgresdatabaseexample.springbootwarfile.Repository.TasksRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteByIdController {
    @Autowired
    private TasksRepository tasks;

    @DeleteMapping("/api/postgres/delete/{id}")
    public TasksEntity deleteTask(@PathVariable int id) {
        var findTaskById = tasks.findById(id).orElseThrow(() -> new EntityNotFoundException("Task not found with ID " + id));
        tasks.deleteById(findTaskById.getId());
        return findTaskById;
    }
}
