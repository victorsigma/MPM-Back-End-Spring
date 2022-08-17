package com.mpm.MPMBackEnd.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpm.MPMBackEnd.models.ActivitiesModel;
import com.mpm.MPMBackEnd.repositories.ActivitiesRepository;

@Service
public class ActivitiesService {
    @Autowired
    ActivitiesRepository activitiesRepository;

    public ArrayList<ActivitiesModel> getActivities() {
        return (ArrayList<ActivitiesModel>) activitiesRepository.findAll();
    }

    public ActivitiesModel addActivity(ActivitiesModel activity) {
        return activitiesRepository.save(activity);
    }

    public ActivitiesModel updateActivity(ActivitiesModel activity) {
        return activitiesRepository.save(activity);
    }


    public Optional<ActivitiesModel> getActivityById(String id) {
        return activitiesRepository.findById(id);
    }

    public boolean deleteActivity(String id) {
        try {
            activitiesRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}
