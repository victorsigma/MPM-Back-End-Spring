package com.mpm.MPMBackEnd.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mpm.MPMBackEnd.services.ProjectsService;
import com.mpm.MPMBackEnd.models.ProjectsModel;

@RestController
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost", "http://172.25.170.162", "http://192.168.0.116/"})
@RequestMapping("/api/Projects")
public class ProjectsController {
    @Autowired
    ProjectsService projectsService;

    @GetMapping()
    public ArrayList<ProjectsModel> getProjects() {
        return projectsService.getProjects();
    }

    @PostMapping()
    public ProjectsModel addProject(@RequestBody ProjectsModel project) {
        return this.projectsService.addProject(project);
    }

    @PutMapping("/{id}")
    public ProjectsModel updateProject(@RequestBody ProjectsModel project) {
        return this.projectsService.updateProject(project);
    }

    @GetMapping("/{id}")
    public Optional<ProjectsModel> getProjectById(@PathVariable("id") String id) {
        return projectsService.getProjectById(id);
    }

    @DeleteMapping("/{id}")
    public boolean deleteProject(@PathVariable("id") String id) {
        return projectsService.deleteProject(id);
    }
}