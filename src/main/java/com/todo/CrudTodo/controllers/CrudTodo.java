package com.todo.CrudTodo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.CrudTodo.models.TodoModel;
import com.todo.CrudTodo.services.TodoService;

@RestController
@RequestMapping("/")
public class CrudTodo {
    @Autowired
    TodoService todoService;

    @GetMapping("/home")
    public ArrayList<TodoModel> obtenerTodos(){
        return todoService.obtenerTodos();
    }

    @PostMapping()
    public TodoModel guardarUsuario(@RequestBody TodoModel todo){
        return this.todoService.guardarTodo(todo);
    }
}