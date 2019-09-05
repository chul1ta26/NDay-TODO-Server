package com.nury.ndaytodo.services;

import com.nury.ndaytodo.entities.TodoListEntity;
import com.nury.ndaytodo.repositories.TodoListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoListService {

    private TodoListRepository todoListRepository;

    @Autowired
    public TodoListService(TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }

    public List<TodoListEntity> getTodoLists() {

        return todoListRepository.findAll();
    }

    public TodoListEntity getTodoListsById(Long id) {
        Optional<TodoListEntity> entityOptional = todoListRepository.findById(id);

        if(entityOptional.isPresent()){
            return entityOptional.get();
        } else {
            // todo throw exception here. handle it in the controller.
            return null;
        }
    }
}
