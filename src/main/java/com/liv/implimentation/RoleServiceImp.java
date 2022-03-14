package com.liv.implimentation;

import com.liv.dto.RoleDTO;
import com.liv.dto.UserDTO;
import com.liv.services.RoleService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleServiceImp extends AbstractMapService<RoleDTO,Long> implements RoleService {
    @Override
    public List<RoleDTO> findAll() {
        return super.findAll();
    }

    @Override
    public RoleDTO findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void delete(RoleDTO obj) {
        super.delete(obj);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public RoleDTO save(RoleDTO obj) {
        return super.save(obj.getId(),obj);
    }

    @Override
    public void update(RoleDTO obj) {
        super.update(obj.getId(),obj);
    }
}
