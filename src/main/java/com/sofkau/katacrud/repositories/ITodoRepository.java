package com.sofkau.katacrud.repositories;

import com.sofkau.katacrud.entities.TodoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITodoRepository extends CrudRepository<TodoEntity,Long> {
}
