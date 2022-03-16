package com.liv.controllers;

import com.liv.dto.TaskDTO;
import com.liv.services.ProjectService;
import com.liv.services.TaskService;
import com.liv.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/task")
public class TaskController {

    @Autowired
    ProjectService projectService;
    @Autowired
    UserService userService;
    @Autowired
    TaskService taskService;

    @GetMapping("/create")
    public String createTask(Model model){
    model.addAttribute("task", new TaskDTO());
    model.addAttribute("projects",projectService.findAll());
    model.addAttribute("employees",userService.findEmployees());
    model.addAttribute("tasks",taskService.findAll());
        return "task/create";
    }
}
