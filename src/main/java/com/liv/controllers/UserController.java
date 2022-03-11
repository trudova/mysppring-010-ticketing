package com.liv.controllers;

import com.liv.dto.RoleDTO;
import com.liv.dto.UserDTO;
import com.liv.entity.Role;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping({"/create", "/add", "register"})
    public String getCreatUserForm(Model model){
        model.addAttribute("user", new UserDTO());
        /* dummy data */
        return "user/create";
    }
}
