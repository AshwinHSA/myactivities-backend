package com.myactivities.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myactivities.model.Activity;
import com.myactivities.model.PlanActivity;
import com.myactivities.repository.PlanActivityRepository;
import com.myactivities.service.ActivityService;
import com.myactivities.service.PlanActivityService;

@RestController
@RequestMapping("/activity")
@CrossOrigin(origins="*", allowedHeaders="*")
public class ActivityController {

	@Autowired
	ActivityService activityService;
	
	@Autowired
	PlanActivityService planActivityService;
	
	@PostMapping(value="planActivity", consumes={"application/json"} )
	public PlanActivity planActivity(@RequestBody PlanActivity planActivity){
		return planActivityService.addPlanActivity(planActivity);
	}
	
	@GetMapping(value="getAllActivityPlanned" )
	public List<PlanActivity> getAllActivityPlanned(String date){
		return planActivityService.listPlannedActivities();
	}
	
	
	@PostMapping(value="addActivity", consumes={"application/json"} )
	public Activity addActivity(@RequestBody Activity activity){
		return activityService.addActivity(activity);
	}
		
	@GetMapping(value="getAllActivities")
	public List<Activity> getAllActivities(){
		return activityService.listActivities();
	}
	
}
