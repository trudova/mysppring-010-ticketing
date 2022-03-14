package com.liv.converter;

import com.liv.dto.RoleDTO;
import com.liv.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@ConfigurationPropertiesBinding
public class RoleDTOConverter implements Converter<String ,RoleDTO> {
    @Autowired
    RoleService roleService;

    @Override
    public RoleDTO convert(String source) {
        Long id = Long.parseLong(source);
        RoleDTO object = new RoleDTO();
        object=  roleService.findById(id);
        return object;

    }
}
