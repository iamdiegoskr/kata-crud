package com.sofkau.katacrud.services;

import com.sofkau.katacrud.entities.TodoEntity;
import com.sofkau.katacrud.repositories.ITodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService implements ITodoService {

    @Autowired
    private ITodoRepository repository;

    @Override
    public Iterable<TodoEntity> listTodo() {
        return repository.findAll();
    }

    @Override
    public TodoEntity listById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public TodoEntity save(TodoEntity todoEntity) {
        return  repository.save(todoEntity);
    }

    @Override
    public void delete(Long id) {
        repository.delete(listById(id));
    }


}
