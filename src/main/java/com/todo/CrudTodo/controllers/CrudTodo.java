package com.todo.CrudTodo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import com.todo.CrudTodo.models.TodoModel;
import com.todo.CrudTodo.services.TodoService;

@RestController
@RequestMapping(value = "/", method={RequestMethod.POST, RequestMethod.GET, RequestMethod.DELETE})
@CrossOrigin(origins = "http://localhost:3000", allowedHeaders = "*")
public class CrudTodo {
    @Autowired
    TodoService todoService;

    @GetMapping("/")
    public ArrayList<TodoModel> obtenerTodos(){
        return todoService.obtenerTodos();
    }

    @PostMapping(value = "/guardar", consumes = {"application/json"})
    public TodoModel guardarTodo(@RequestBody TodoModel todo){
        System.out.println(todo);
        return this.todoService.guardarTodo(todo);
    }

    @DeleteMapping(value = "/{id}")
    public void eliminarTodo(@PathVariable("id") Long id) {
        todoService.eliminarTodo(id);
    }
}