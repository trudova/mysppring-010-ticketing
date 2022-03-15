package com.liv.controllers;

import com.liv.dto.ProjectDTO;
import com.liv.services.ProjectService;
import com.liv.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/project")
public class ProjectController {
    @Autowired
    ProjectService projectService;
    @Autowired
    UserService userService;

    @GetMapping("/create")
    public String getCreateProjectForm(Model model){
        model.addAttribute("project", new ProjectDTO());
        model.addAttribute("projects",projectService.findAll());
        model.addAttribute("managers",userService.findAll());
        return "project/create";
    }
    @PostMapping("/create")
    public String createProject(ProjectDTO proj, Model model){
        projectService.save(proj);

        return "redirect:/project/create";
    }
}
