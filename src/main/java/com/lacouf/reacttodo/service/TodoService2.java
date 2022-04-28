package com.lacouf.reacttodo.service;

import com.lacouf.reacttodo.model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TodoService2 {

    private List<Todo> todos = new ArrayList<>();

    public List<Todo> getAllTodos() {
        return findAll();
    }

    public Optional<Todo> saveTodo(Todo todo) {
        return Optional.of(save(todo));
    }

    private List<Todo> findAll() {
        return todos;
    }

    private Todo save(Todo todo) {
        todos.add(todo);
        return todo;
    }
}
