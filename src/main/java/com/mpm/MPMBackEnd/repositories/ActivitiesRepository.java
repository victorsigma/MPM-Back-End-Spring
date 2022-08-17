package com.mpm.MPMBackEnd.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mpm.MPMBackEnd.models.ActivitiesModel;

@Repository
public interface ActivitiesRepository extends CrudRepository<ActivitiesModel, String>{
    
}
