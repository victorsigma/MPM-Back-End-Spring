package com.mpm.MPMBackEnd.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpm.MPMBackEnd.models.UsersModel;
import com.mpm.MPMBackEnd.repositories.UsersRepository;


@Service
public class UsersService {
    @Autowired
    UsersRepository usersRepository;

    public ArrayList<UsersModel> getUsers() {
        return (ArrayList<UsersModel>) usersRepository.findAll();
    }

    public UsersModel addUser(UsersModel user) {
        return usersRepository.save(user);
    }

    public UsersModel updateUser(UsersModel user) {
        return usersRepository.save(user);
    }


    public Optional<UsersModel> getUserById(String id) {
        return usersRepository.findById(id);
    }

    public boolean deleteUser(String id) {
        try {
            usersRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}
