package com.mysite.todoproject;

import com.mysite.todoproject.entity.TodoEntity;
import com.mysite.todoproject.repository.TodoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TodoProjectApplicationTests {

    @Autowired
    private TodoRepository todoRepository;

    @Test
    void testJpa() {
        TodoEntity todo1 = new TodoEntity();
        todo1.setContent("스프링 공부하기");
        todo1.setCompleted(Boolean.TRUE);
        this.todoRepository.save(todo1);

        TodoEntity todo2 = new TodoEntity();
        todo2.setContent("자바 공부하기");
        todo2.setCompleted(Boolean.FALSE);
        this.todoRepository.save(todo2);
    }

}
