package com.mpm.MPMBackEnd.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mpm.MPMBackEnd.models.ProjectsModel;

@Repository
public interface ProjectsRepository extends CrudRepository<ProjectsModel, String>{
    //public abstract Optional<ProjectsModel> findById(String id);
}
