package com.todo.CrudTodo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.CrudTodo.models.TodoModel;
import com.todo.CrudTodo.repository.TodoRepository;

@Service
public class TodoService {
    @Autowired
    TodoRepository todoRepository;

    public ArrayList<TodoModel> obtenerTodos(){
        return (ArrayList<TodoModel>) todoRepository.findAll();
    }

    public TodoModel guardarTodo(TodoModel todo){
        return todoRepository.save(todo);
    }

}
