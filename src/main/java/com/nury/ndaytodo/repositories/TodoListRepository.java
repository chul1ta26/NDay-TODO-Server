package com.nury.ndaytodo.repositories;

import com.nury.ndaytodo.entities.TodoListEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoListRepository extends JpaRepository<TodoListEntity, Long> {

}
