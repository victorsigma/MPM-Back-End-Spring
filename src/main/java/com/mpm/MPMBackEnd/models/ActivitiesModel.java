package com.mpm.MPMBackEnd.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Activities")
public class ActivitiesModel {

    @Id
    @Column(name = "id", unique = true, nullable = false)
    private String id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "subtitle", nullable = false)
    private String subtitle;

    @Column(name = "src", nullable = false)
    private String src;

    @Column(name = "status", nullable = false)
    private int status;

    @Column(name = "dateEnd", nullable = false)
    private Date dateEnd;

    @Column(name = "leader", nullable = false)
    private boolean leader;

    @Column(name = "analyst", nullable = false)
    private boolean analyst;

    @Column(name = "designer", nullable = false)
    private boolean designer;

    @Column(name = "programmer", nullable = false)
    private boolean programmer;

    @Column(name = "projectId", nullable = false)
    private String projectId;

    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getSubtitle() {
        return subtitle;
    }
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }
    public String getSrc() {
        return src;
    }
    public void setSrc(String src) {
        this.src = src;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public Date getDateEnd() {
        return dateEnd;
    }
    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }
    public boolean isLeader() {
        return leader;
    }
    public void setLeader(boolean leader) {
        this.leader = leader;
    }
    public boolean isAnalyst() {
        return analyst;
    }
    public void setAnalyst(boolean analyst) {
        this.analyst = analyst;
    }
    public boolean isDesigner() {
        return designer;
    }
    public void setDesigner(boolean designer) {
        this.designer = designer;
    }
    public boolean isProgrammer() {
        return programmer;
    }
    public void setProgrammer(boolean programmer) {
        this.programmer = programmer;
    }
    public String getProjectId() {
        return projectId;
    }
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
}
