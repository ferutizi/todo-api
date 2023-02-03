package com.todo.CrudTodo.services;

import java.util.ArrayList;
import java.util.Optional;

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

    public Optional<TodoModel> obtenerPorId(Long id){
        return todoRepository.findById(id);
    }

    public void updateTodo(Long id, TodoModel todo) {
        if(todo.getId().equals(id)) {
            todoRepository.save(todo);
            return;
        }
    }

    public boolean eliminarTodo(Long id){
        try {
            todoRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean eliminarTodos(){
        try {
            todoRepository.deleteAll();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
