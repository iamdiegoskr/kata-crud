package com.sofkau.katacrud.controllers;

import com.sofkau.katacrud.entities.TodoEntity;
import com.sofkau.katacrud.services.ITodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class TodoController {

    @Autowired
    private ITodoService service;


    @GetMapping(value = "/todos")
    public Iterable<TodoEntity> listTodo() {
        return service.listTodo();
    }

    @GetMapping(value = "/todos/{id}")
    public TodoEntity listById(@PathVariable() Long id) {
        return service.listById(id);
    }


    @PostMapping(value = "/create")
    public TodoEntity save(@RequestBody TodoEntity todoEntity) {
        return  service.save(todoEntity);
    }


    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable() Long id) {
        service.delete(id);
    }

    @PutMapping(value = "todos/update")
    public TodoEntity update(@RequestBody TodoEntity todoEntity){
        if(todoEntity.getId()!=null){
            return service.save(todoEntity);
        }
        throw new RuntimeException("No exist el id ");
    }


}
