package com.liv.bootstrap;

import com.liv.dto.RoleDTO;
import com.liv.dto.UserDTO;
import com.liv.entity.Role;
import com.liv.enums.Gender;
import com.liv.implimentation.RoleServiceImp;
import com.liv.services.RoleService;
import com.liv.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {
    RoleService roleService;
    UserService userService;

    @Autowired
    public DataGenerator(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
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
                "doe@gmail.com","abc","2344552355",
                true,adminRole, Gender.MALE);
        UserDTO userDTO2 = new UserDTO("Jane", "Doe",
                "doe2@gmail.com","abc","2044552355",
                true,managerRole, Gender.FEMALE);
        UserDTO userDTO3 = new UserDTO("Liv", "True",
                "liv@gmail.com","abc","2344552355",
                true,adminRole, Gender.FEMALE);
        UserDTO userDTO4 = new UserDTO("Paul", "Doe",
                "doe3@gmail.com","abc","2944552355",
                true,adminRole, Gender.MALE);
        userService.save(userDTO1);
        userService.save(userDTO2);
        userService.save(userDTO3);
        userService.save(userDTO4);

    }
}
