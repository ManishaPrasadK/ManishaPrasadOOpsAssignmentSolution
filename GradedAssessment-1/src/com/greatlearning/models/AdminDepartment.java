package com.greatlearning.models;

public class AdminDepartment extends SuperDepartment{
	
	public String departmentName() {
		String departmentName="Admin Department";
		return departmentName;
	}
	public String getTodaysWork() {
		String todaysWork="Complete your documents submission";
		return todaysWork;
	}
	public String getWorkDeadline() {
		String workDeadline="Complete by EOD";
		return workDeadline;
	}
	public void printDetails() {
		System.out.println("Welcome to "+departmentName());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(isTodayAHoliday());
	}

}
