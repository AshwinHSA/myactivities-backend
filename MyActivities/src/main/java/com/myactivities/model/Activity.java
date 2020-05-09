package com.myactivities.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Activity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Integer id;
	
	String activityName;
	
	Date date;
	
	String startTime;
	
	String endTime;
	
	String comments;

	public Activity() {
	}

	public Activity(String activityName, Date date, String startTime, String endTime, String comments) {
		this.activityName = activityName;
		this.date = date;
		this.startTime = startTime;
		this.endTime = endTime;
		this.comments = comments;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "Activity [id=" + id + ", activityName=" + activityName + ", date=" + date + ", startTime=" + startTime
				+ ", endTime=" + endTime + ", comments=" + comments + "]";
	}
}
