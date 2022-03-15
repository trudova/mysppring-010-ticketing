package com.liv.bootstrap;

import com.liv.dto.ProjectDTO;
import com.liv.dto.RoleDTO;
import com.liv.dto.UserDTO;
import com.liv.entity.Role;
import com.liv.enums.Gender;
import com.liv.enums.Status;
import com.liv.implimentation.RoleServiceImp;
import com.liv.services.ProjectService;
import com.liv.services.RoleService;
import com.liv.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataGenerator implements CommandLineRunner {
    RoleService roleService;
    UserService userService;
    ProjectService projectService;

    @Autowired
    public DataGenerator(RoleService roleService, UserService userService, ProjectService projectService) {
        this.roleService = roleService;
        this.userService = userService;
        this.projectService = projectService;
    }

    @Override
    public void run(String... args) throws Exception {

        RoleDTO adminRole = new RoleDTO(1l, "Admin");
        RoleDTO managerRole = new RoleDTO(2l, "Manager");
        RoleDTO employeeRole = new RoleDTO(3l, "Employee");
        roleService.save(adminRole);
        roleService.save(managerRole);
        roleService.save(employeeRole);

        UserDTO userDTO1 = new UserDTO("Jon", "Doe",
                "doe@gmail.com", "abc", "2344552355",
                true, adminRole, Gender.MALE);
        UserDTO userDTO2 = new UserDTO("Jane", "Doe",
                "doe2@gmail.com", "abc", "2044552355",
                true, managerRole, Gender.FEMALE);
        UserDTO userDTO3 = new UserDTO("Liv", "True",
                "liv@gmail.com", "abc", "2344552355",
                true, adminRole, Gender.FEMALE);
        UserDTO userDTO4 = new UserDTO("Paul", "Doe",
                "doe3@gmail.com", "abc", "2944552355",
                true, adminRole, Gender.MALE);
        UserDTO userDTO5 = new UserDTO("Jane", "Doe",
                "ll2@gmail.com", "abc", "2044552355",
                true, managerRole, Gender.FEMALE);
        UserDTO userDTO6 = new UserDTO("Liv", "True",
                "lov@gmail.com", "abc", "2344552355",
                true, employeeRole, Gender.FEMALE);
        UserDTO userDTO7 = new UserDTO("Paul", "Doe",
                "do3@gmail.com", "abc", "2944552355",
                true, employeeRole, Gender.MALE);
        UserDTO userDTO8 = new UserDTO("Joe", "Doe",
                "do2@gmail.com", "abc", "2044552355",
                true, managerRole, Gender.FEMALE);
        userService.save(userDTO1);
        userService.save(userDTO2);
        userService.save(userDTO3);
        userService.save(userDTO4);
        userService.save(userDTO5);
        userService.save(userDTO6);
        userService.save(userDTO7);
        userService.save(userDTO8);
        ProjectDTO project1 = new ProjectDTO("Sping MVC", "PR001",
                "firstProj", userDTO1, LocalDate.now(), LocalDate.now().plusDays(50), Status.OPEN);
        ProjectDTO project2 = new ProjectDTO("API", "PR002",
                "firstProj", userDTO2, LocalDate.now(), LocalDate.now().plusDays(60), Status.IN_PROGRESS);
        ProjectDTO project3 = new ProjectDTO("micro services", "PR003",
                "firstProj", userDTO3, LocalDate.now(), LocalDate.now().plusDays(56), Status.UAT_TEST);
        ProjectDTO project4 = new ProjectDTO("deploy", "PR004",
                "firstProj", userDTO1, LocalDate.now(), LocalDate.now().plusDays(30), Status.COMPLETE);

        projectService.save(project1);
        projectService.save(project2);
        projectService.save(project3);
        projectService.save(project4);




    }
}
