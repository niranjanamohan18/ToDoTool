package repository;

import org.springframework.data.repository.CrudRepository;

import model.ToDoItem;

public interface ToDoRepo extends CrudRepository<ToDoItem, Long>{

}
