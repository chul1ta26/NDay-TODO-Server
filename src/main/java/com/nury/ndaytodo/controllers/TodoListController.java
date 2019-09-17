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

    @GetMapping("/{id}")
    public  ResponseEntity<TodoListEntity> getToDoList(@PathVariable Long id)  {

        return new ResponseEntity<>(todoListService.getTodoListsById(id), HttpStatus.OK);
    }
    @PostMapping("/{id}")
    public ResponseEntity<TodoListEntity> updateToDolist(@RequestBody TodoListEntity todoListEntity){
        return new ResponseEntity<>(todoListService.update(todoListEntity), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deleteToDoList(@PathVariable Long id){
        todoListService.deleteToDoList(id);
    }


}






