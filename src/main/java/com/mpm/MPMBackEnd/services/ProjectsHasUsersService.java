package com.mpm.MPMBackEnd.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpm.MPMBackEnd.models.ProjectsHasUsersModel;
import com.mpm.MPMBackEnd.repositories.ProjectsHasUsersRepository;

@Service
public class ProjectsHasUsersService {
    @Autowired
    ProjectsHasUsersRepository projectsHasUsersRepository;

    public ArrayList<ProjectsHasUsersModel> getProjectsHasUsers() {
        return (ArrayList<ProjectsHasUsersModel>) projectsHasUsersRepository.findAll();
    }

    public ProjectsHasUsersModel addProjectHasUser(ProjectsHasUsersModel projectHasUser) {
        return projectsHasUsersRepository.save(projectHasUser);
    }

    public ProjectsHasUsersModel updateProjectHasUser(ProjectsHasUsersModel projectHasUser) {
        return projectsHasUsersRepository.save(projectHasUser);
    }


    public Optional<ProjectsHasUsersModel> getProjectHasUserById(Long id) {
        return projectsHasUsersRepository.findById(id);
    }

    public boolean deleteProjectHasUser(Long id) {
        try {
            projectsHasUsersRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}