package com.myactivities.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myactivities.model.PlanActivity;
import com.myactivities.repository.PlanActivityRepository;

@Service
public class PlanActivityService {

	@Autowired
	PlanActivityRepository planActivityRepository;
	
	public PlanActivity addPlanActivity(PlanActivity planActivity){
		return planActivityRepository.save(planActivity);
	}
	
	public List<PlanActivity> listPlannedActivities(){
		return planActivityRepository.findAll();
	}
	
//	public List<PlanActivity> listPlannedActivitiesForDate(String date){
//		return planActivityRepository.findByEmailReturnStream(date);
//	}
}
