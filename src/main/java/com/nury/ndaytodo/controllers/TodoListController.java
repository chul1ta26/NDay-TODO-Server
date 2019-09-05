package com.nury.ndaytodo.controllers;

import com.nury.ndaytodo.entities.TodoListEntity;
import com.nury.ndaytodo.services.TodoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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

    @GetMapping("api/todolist{id}")
    public ResponseEntity<TodoListEntity>getToDoList(@PathVariable Long id){
        return new ResponseEntity<>(todoListService.getTodoListsById(id), HttpStatus.OK);
    }

    @DeleteMapping("/api/todolist/{id}")
    public ResponseEntity<Boolean> deleteToDoList(@PathVariable Long id){
        return new ResponseEntity<>(todoListService.deleteToDoList(id),HttpStatus.OK);
    }

    @PostMapping("api/todolist/{id}")
    public ResponseEntity<TodoListEntity> updateToDolist( @PathVariable Long id){
        return new ResponseEntity<>(todoListService.update(id), HttpStatus.OK);
    }
}






