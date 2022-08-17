package com.mpm.MPMBackEnd.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpm.MPMBackEnd.models.ProjectsModel;
import com.mpm.MPMBackEnd.repositories.ProjectsRepository;

@Service
public class ProjectsService {
    @Autowired
    ProjectsRepository projectsRepository;

    public ArrayList<ProjectsModel> getProjects() {
        return (ArrayList<ProjectsModel>) projectsRepository.findAll();
    }

    public ProjectsModel addProject(ProjectsModel project) {
        return projectsRepository.save(project);
    }

    public ProjectsModel updateProject(ProjectsModel project) {
        return projectsRepository.save(project);
    }


    public Optional<ProjectsModel> getProjectById(String id) {
        return projectsRepository.findById(id);
    }

    public boolean deleteProject(String id) {
        try {
            projectsRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}