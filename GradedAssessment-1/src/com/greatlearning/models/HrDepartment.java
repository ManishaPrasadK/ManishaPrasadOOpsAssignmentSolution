package com.greatlearning.models;

public class HrDepartment extends SuperDepartment{

	public String departmentName() {
		String departmentName="Hr Department ";
		return departmentName;
	}
	public String getTodaysWork() {
		String todaysWork="Fill today's worksheet and mark your attendance";
		return todaysWork;
	}
	public String getWorkDeadline() {
		String workDeadline="Complete by EOD";
		return workDeadline;
	}
	public String doActivity() {
		String activity="team Lunch";
		return activity;
	}
	public void printDetails() {
		System.out.println("Welcome to "+departmentName());
		System.out.println(doActivity());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(isTodayAHoliday());
	}
	
}
