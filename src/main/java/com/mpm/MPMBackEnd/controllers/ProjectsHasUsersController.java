package com.mpm.MPMBackEnd.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mpm.MPMBackEnd.models.ProjectsHasUsersModel;
import com.mpm.MPMBackEnd.services.ProjectsHasUsersService;

@RestController
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost", "http://172.25.170.162", "http://192.168.0.116/"})
@RequestMapping("/api/ProjectsHasUser")
public class ProjectsHasUsersController {
    @Autowired
    ProjectsHasUsersService projectsHasUsersService;

    @GetMapping()
    public ArrayList<ProjectsHasUsersModel> getProjectsHasUsers() {
        return projectsHasUsersService.getProjectsHasUsers();
    }

    @PostMapping()
    public ProjectsHasUsersModel addProjectHasUser(@RequestBody ProjectsHasUsersModel projectHasUser) {
        return this.projectsHasUsersService.addProjectHasUser(projectHasUser);
    }

    @PutMapping("/{id}")
    public ProjectsHasUsersModel updateProjectHasUser(@PathVariable("id") Long id, @RequestBody ProjectsHasUsersModel projectHasUser) {
        projectHasUser.setId(id);
        return this.projectsHasUsersService.updateProjectHasUser(projectHasUser);
    }

    @GetMapping("/{id}")
    public Optional<ProjectsHasUsersModel> getProjectHasUserById(@PathVariable("id") Long id) {
        return projectsHasUsersService.getProjectHasUserById(id);
    }

    @DeleteMapping("/{id}")
    public boolean deleteUser(@PathVariable("id") Long id) {
        return projectsHasUsersService.deleteProjectHasUser(id);
    }
}
