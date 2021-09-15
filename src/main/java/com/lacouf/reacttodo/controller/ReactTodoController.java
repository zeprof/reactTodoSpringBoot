package com.lacouf.reacttodo.controller;

import com.lacouf.reacttodo.model.Todo;
import com.lacouf.reacttodo.service.TodoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class ReactTodoController {

    private final TodoService todoService;

    public ReactTodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public List<Todo> getAllTodos() {
        return todoService.getAllTodos();
    }
}
