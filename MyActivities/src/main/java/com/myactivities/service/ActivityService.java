package com.myactivities.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myactivities.model.Activity;
import com.myactivities.repository.ActivityRepository;


@Service
public class ActivityService {

	@Autowired
	ActivityRepository activityRepository;
	
	public Activity addActivity(Activity activity){
		return activityRepository.save(activity);
	}
	
	public List<Activity> listActivities(){
		return activityRepository.findAll();
	}
}
