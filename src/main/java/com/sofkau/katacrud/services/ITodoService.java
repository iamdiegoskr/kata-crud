package com.sofkau.katacrud.services;

import com.sofkau.katacrud.entities.TodoEntity;


public interface ITodoService {
    public Iterable<TodoEntity> listTodo();
    public TodoEntity listById(Long id);
    public TodoEntity save(TodoEntity todoEntity);
    public void delete(Long id);

}
