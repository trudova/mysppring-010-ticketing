package com.liv.entity;

import com.liv.enums.Gender;
import lombok.*;

import java.time.LocalDateTime;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class User extends BaseEntity {
    private String firstName, lastName, userName, password, phone;
    private boolean enabled;
    private Role role;
    private Gender gender;

    public User(Long id, LocalDateTime insertDateTime, Long insertUserId,
                LocalDateTime lastUpdateDateTime, Long lestUpdatedUserId, String firstName,
                String lastName, String userName, String password, String phone,
                boolean enabled, Role role, Gender gender) {
        super(id, insertDateTime, insertUserId, lastUpdateDateTime, lestUpdatedUserId);
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.phone = phone;
        this.enabled = enabled;
        this.role = role;
        this.gender = gender;
    }
}
