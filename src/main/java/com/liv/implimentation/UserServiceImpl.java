package com.liv.implimentation;

import com.liv.dto.UserDTO;
import com.liv.services.UserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl extends AbstractMapService<UserDTO, String> implements UserService {
    @Override
    public List<UserDTO> findAll() {
        return super.findAll();
    }

    @Override
    public UserDTO findById(String id) {
        return super.findById(id);
    }

    @Override
    public void delete(UserDTO obj) {
    super.delete(obj);
    }

    @Override
    public void deleteById(String id) {
    super.deleteById(id);
    }

    @Override
    public UserDTO save(UserDTO obj) {
        return super.save(obj.getUserName(),obj);
    }

    @Override
    public void update(UserDTO obj) {
        super.update(obj.getUserName(),obj);
    }
}
