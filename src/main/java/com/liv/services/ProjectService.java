package com.liv.services;

import com.liv.dto.ProjectDTO;

public interface ProjectService extends CrudService<ProjectDTO,String >{
void complete(ProjectDTO projectDTO);
}
