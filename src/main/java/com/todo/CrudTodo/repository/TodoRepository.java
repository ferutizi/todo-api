package com.todo.CrudTodo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.todo.CrudTodo.models.TodoModel;

@Repository
public interface TodoRepository extends CrudRepository<TodoModel, Long> {
    
}
