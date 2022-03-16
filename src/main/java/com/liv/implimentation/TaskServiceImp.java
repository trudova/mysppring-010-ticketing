package com.liv.implimentation;

import com.liv.dto.TaskDTO;
import com.liv.services.TaskService;

import java.util.List;

public class TaskServiceImp extends AbstractMapService<TaskDTO, Long> implements TaskService {

    @Override
    public List<TaskDTO> findAll() {
        return super.findAll();
    }

    @Override
    public TaskDTO save(TaskDTO obj) {
        return super.save(obj.getId(), obj);
    }

    @Override
    public void update(TaskDTO obj) {
        super.update(obj.getId(), obj);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(TaskDTO obj) {
        super.delete(obj);
    }

    @Override
    public TaskDTO findById(Long id) {
        return super.findById(id);
    }
}
