package com.nury.ndaytodo.controllers;

import com.nury.ndaytodo.entities.TodoListEntity;
import com.nury.ndaytodo.services.TodoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/todolist")
public class TodoListController {

    private TodoListService todoListService;

    @Autowired
    public TodoListController(TodoListService todoListService) {
        this.todoListService = todoListService;
    }

    @GetMapping("/")
    public List<TodoListEntity> getTodoLists() {

        return todoListService.getTodoLists();
    }

}
