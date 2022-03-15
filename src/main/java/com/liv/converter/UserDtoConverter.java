package com.liv.converter;

import com.liv.dto.RoleDTO;
import com.liv.dto.UserDTO;
import com.liv.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@ConfigurationPropertiesBinding
public class UserDtoConverter implements Converter<String , UserDTO> {
    @Autowired
    UserService userService;
    @Override
    public UserDTO convert(String userName) {
        return userService.findById(userName);
    }

}
