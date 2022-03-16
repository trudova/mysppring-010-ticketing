package com.liv.controllers;

import com.liv.dto.TaskDTO;
import com.liv.enums.Status;
import com.liv.services.ProjectService;
import com.liv.services.TaskService;
import com.liv.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.UUID;

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
    public String createTaskForm(Model model){
    model.addAttribute("task", new TaskDTO());
    model.addAttribute("projects",projectService.findAll());
    model.addAttribute("employees",userService.findEmployees());
    model.addAttribute("tasks",taskService.findAll());
        return "task/create";
    }
    @PostMapping("/create")
    public String createTask(Model model, TaskDTO task ){
        task.setTaskStatus(Status.OPEN);
        task.setAssignedDate(LocalDate.now());
        task.setId(UUID.randomUUID().getMostSignificantBits());
        taskService.save(task);
        return "redirect:/task/create";
    }

    @GetMapping("/delete/{id}")
    public String deleteTaskForm(@PathVariable("id")Long id,Model model, TaskDTO task){
        taskService.deleteById(id);
        return "redirect:/task/create";
    }
    @GetMapping("/update/{id}")
    public String updareTaskForm(@PathVariable("id")Long id,Model model, TaskDTO task){
        model.addAttribute("task", taskService.findById(id));
        model.addAttribute("projects",projectService.findAll());
        model.addAttribute("employees",userService.findEmployees());
        model.addAttribute("tasks",taskService.findAll());
        return "/task/update";
    }
    @PostMapping("/update/{id}")
    public String updateTask(@PathVariable("id")Long id,Model model, TaskDTO task){
//        task.setTaskStatus(Status.OPEN);
//        task.setAssignedDate(LocalDate.now());
        taskService.update(task);
        return "redirect:/task/create";
    }
}
