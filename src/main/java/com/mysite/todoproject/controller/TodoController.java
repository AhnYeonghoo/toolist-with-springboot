package com.mysite.todoproject.controller;

import com.mysite.todoproject.entity.TodoEntity;
import com.mysite.todoproject.repository.TodoRepository;
import com.mysite.todoproject.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class TodoController {

    private final TodoService todoService;

    @RequestMapping("/todo")
    public String list(Model model) {
        List<TodoEntity> todoEntityList = this.todoService.getList();
        model.addAttribute("todoEntityList", todoEntityList);
        return "todolist";
    }

    @RequestMapping("/")
    public String root() {
        return "redirect:todo";
    }
}
