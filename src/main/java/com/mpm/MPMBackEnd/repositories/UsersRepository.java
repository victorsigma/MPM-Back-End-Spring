package com.mpm.MPMBackEnd.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mpm.MPMBackEnd.models.UsersModel;

@Repository
public interface UsersRepository extends CrudRepository<UsersModel, String>{
    
}