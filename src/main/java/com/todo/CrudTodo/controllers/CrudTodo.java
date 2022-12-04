package com.todo.CrudTodo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CrudTodo {

    @GetMapping("/home")
    public String funciona() {
        return "funcionando";
    }
}
