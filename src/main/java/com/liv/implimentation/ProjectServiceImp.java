package com.liv.implimentation;

import com.liv.dto.ProjectDTO;
import com.liv.services.ProjectService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProjectServiceImp extends AbstractMapService<ProjectDTO, String> implements ProjectService {
    @Override
    public List<ProjectDTO> findAll() {
        return super.findAll();
    }

    @Override
    public ProjectDTO save(ProjectDTO obj) {
        return super.save(obj.getProjectCode(), obj);
    }

    @Override
    public void update(ProjectDTO obj) {
        super.update(obj.getProjectCode(), obj);
    }

    @Override
    public void deleteById(String  id) {
        super.deleteById(id);
    }

    @Override
    public void delete(ProjectDTO obj) {
        super.delete(obj);
    }

    @Override
    public ProjectDTO findById(String id) {
        return super.findById(id);
    }
}
