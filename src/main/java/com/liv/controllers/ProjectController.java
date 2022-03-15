package com.liv.controllers;

import com.liv.dto.ProjectDTO;
import com.liv.dto.UserDTO;
import com.liv.enums.Status;
import com.liv.services.ProjectService;
import com.liv.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public String getCreateProjectForm(Model model) {
        model.addAttribute("project", new ProjectDTO());
        model.addAttribute("projects", projectService.findAll());
        model.addAttribute("managers", userService.findManagers());
        return "project/create";
    }

    @PostMapping("/create")
    public String createProject(ProjectDTO proj, Model model) {
        projectService.save(proj);
        proj.setProjectStatus(Status.OPEN);
        return "redirect:/project/create";
    }
    @GetMapping("/delete/{projectcode}")
    public String deleteProject(@PathVariable("projectcode")String projectcode, ProjectDTO proj, Model model){

        projectService.deleteById(projectcode);

        return "redirect:/project/create";
    }

}
