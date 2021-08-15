package com.mysqldatabaseexample.springbootwarfile.Controllers;

import javax.persistence.EntityNotFoundException;

import com.mysqldatabaseexample.springbootwarfile.Entities.TasksEntity;
import com.mysqldatabaseexample.springbootwarfile.Repository.TasksRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteTask {
    @Autowired
    private TasksRepository tasks;

    @DeleteMapping("/delete_task/{id}")
    public TasksEntity deleteTask(@PathVariable int id) {
        var findTask = tasks.findById(id).orElseThrow(() -> new EntityNotFoundException("Task not found with ID: " + id));
        tasks.deleteById(findTask.getId());
        return findTask;
    }
}
