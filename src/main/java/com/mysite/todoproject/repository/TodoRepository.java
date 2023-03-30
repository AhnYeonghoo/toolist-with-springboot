package com.mysite.todoproject.repository;

import com.mysite.todoproject.entity.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodoEntity, Integer> {


}
