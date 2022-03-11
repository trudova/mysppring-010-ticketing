package com.liv.dto;

import com.liv.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDTO {
    private String firstName,lastName, userName, password, phone;
    private  boolean enabled;
    private RoleDTO role;
    private Gender gender;

}
