package com.mpm.MPMBackEnd.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name = "ProjectsHasUsers")
public class ProjectsHasUsersModel {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "Id", unique = true, nullable = false)
    private Long Id;

    @Column(name = "proyectsIdProject", nullable = false)
    private String proyectsIdProject;

    @Column(name = "userIdUser", nullable = false)
    private String userIdUser;

    @Column(name = "rolesIdRol", nullable = false)
    private int rolesIdRol;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getProyectsIdProject() {
        return proyectsIdProject;
    }

    public void setProyectsIdProject(String proyectsIdProject) {
        this.proyectsIdProject = proyectsIdProject;
    }

    public String getUserIdUser() {
        return userIdUser;
    }

    public void setUserIdUser(String userIdUser) {
        this.userIdUser = userIdUser;
    }

    public int getRolesIdRol() {
        return rolesIdRol;
    }

    public void setRolesIdRol(int rolesIdRol) {
        this.rolesIdRol = rolesIdRol;
    }
}