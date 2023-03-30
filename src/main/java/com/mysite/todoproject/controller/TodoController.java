package com.mysite.todoproject.controller;

import com.mysite.todoproject.entity.TodoEntity;
import com.mysite.todoproject.repository.TodoRepository;
import com.mysite.todoproject.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/todo/create")
    public String todoCreate(@RequestParam String content) {
        this.todoService.create(content);
        return "redirect:/todo";
    }

    @DeleteMapping("/todo/delete/{id}")
    public String todoDelete(@PathVariable Integer id) {
        this.todoService.delete(id);
        return "redirect:/todo";
    }
}
