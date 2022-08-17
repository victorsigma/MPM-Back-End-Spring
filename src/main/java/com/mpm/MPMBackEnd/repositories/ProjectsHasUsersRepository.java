package com.mpm.MPMBackEnd.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mpm.MPMBackEnd.models.ProjectsHasUsersModel;

@Repository
public interface ProjectsHasUsersRepository extends CrudRepository<ProjectsHasUsersModel, Long>{
    
}