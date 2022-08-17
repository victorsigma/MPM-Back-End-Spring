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

import com.mpm.MPMBackEnd.services.ActivitiesService;
import com.mpm.MPMBackEnd.models.ActivitiesModel;

@RestController
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost", "http://172.25.170.162", "http://192.168.0.116/"})
@RequestMapping("/api/Activities")
public class ActivitiesController {
    @Autowired
    ActivitiesService activitiesService;

    @GetMapping()
    public ArrayList<ActivitiesModel> getActivities() {
        return activitiesService.getActivities();
    }

    @PostMapping()
    public ActivitiesModel addActivity(@RequestBody ActivitiesModel activity) {
        return this.activitiesService.addActivity(activity);
    }

    @PutMapping("/{id}")
    public ActivitiesModel updateActivity(@RequestBody ActivitiesModel activity) {
        return this.activitiesService.updateActivity(activity);
    }

    @GetMapping("/{id}")
    public Optional<ActivitiesModel> getActivityById(@PathVariable("id") String id) {
        return activitiesService.getActivityById(id);
    }

    @DeleteMapping("/{id}")
    public boolean deleteActivity(@PathVariable("id") String id) {
        return activitiesService.deleteActivity(id);
    }
}
