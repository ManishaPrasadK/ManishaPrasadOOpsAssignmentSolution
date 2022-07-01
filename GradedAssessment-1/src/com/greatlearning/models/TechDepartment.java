package com.greatlearning.models;

public class TechDepartment extends SuperDepartment{
	
	public String departmentName() {
		String departmentName="Tech Department";
		return departmentName;
	}
	public String getTodaysWork() {
		String todaysWork="Complete coding of Module 1";
		return todaysWork;
	}
	public String getWorkDeadline() {
		String workDeadline="Complete by EOD";
		return workDeadline;
	}
	public String getTechStackInformation() {
		String techStackInformation="Core Java";
		return techStackInformation;
	}
	public void printDetails() {
		System.out.println("Welcome to "+departmentName());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(getTechStackInformation());
		System.out.println(isTodayAHoliday());
	}

}
