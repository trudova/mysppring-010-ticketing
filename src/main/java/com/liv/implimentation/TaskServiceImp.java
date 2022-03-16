package com.liv.implimentation;

import com.liv.dto.TaskDTO;
import com.liv.enums.Status;
import com.liv.services.TaskService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
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
//        obj.setTaskStatus(Status.OPEN);
//        obj.setAssignedDate(LocalDate.now());

        TaskDTO foundProject =findById(obj.getId());
        obj.setAssignedDate(foundProject.getAssignedDate());
        obj.setTaskStatus(foundProject.getTaskStatus());
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
