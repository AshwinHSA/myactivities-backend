package com.myactivities.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.myactivities.model.PlanActivity;

public interface PlanActivityRepository extends JpaRepository<PlanActivity, Integer>{

	
//	@Query("select obj from PlanActivity obj where date(date) = :date")
//	public List<PlanActivity> findPlannedActivityForDate(@Param("date") String date);
	
}
