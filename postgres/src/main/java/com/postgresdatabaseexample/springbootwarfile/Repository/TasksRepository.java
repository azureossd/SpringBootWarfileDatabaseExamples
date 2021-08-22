package com.postgresdatabaseexample.springbootwarfile.Repository;

import com.postgresdatabaseexample.springbootwarfile.Entities.TasksEntity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TasksRepository extends CrudRepository<TasksEntity, Integer> {

}
