package com.mpm.MPMBackEnd.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mpm.MPMBackEnd.models.UsersModel;
import com.mpm.MPMBackEnd.services.UsersService;

@RestController
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost", "http://172.25.170.162", "http://192.168.0.116/"})
@RequestMapping("/api/Users")
public class UsersController {
    @Autowired
    UsersService usersService;

    @GetMapping()
    public ArrayList<UsersModel> getUsers() {
        return usersService.getUsers();
    }

    @PostMapping()
    public UsersModel addUser(@RequestBody UsersModel user) {
        return this.usersService.addUser(user);
    }

    @PutMapping("/{id}")
    public UsersModel updateUser(@RequestBody UsersModel user) {
        return this.usersService.updateUser(user);
    }

    @GetMapping("/{id}")
    public Optional<UsersModel> getUserById(@PathVariable("id") String id) {
        return usersService.getUserById(id);
    }

    @DeleteMapping("/{id}")
    public boolean deleteUser(@PathVariable("id") String id) {
        return usersService.deleteUser(id);
    }
}