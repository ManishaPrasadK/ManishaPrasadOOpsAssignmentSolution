package com.grealearning;

import com.greatlearning.models.AdminDepartment;
import com.greatlearning.models.HrDepartment;
import com.greatlearning.models.TechDepartment;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminDepartment ad=new AdminDepartment();
		HrDepartment hr=new HrDepartment();
		TechDepartment tech=new TechDepartment();
		
		ad.printDetails();
		System.out.println();
		hr.printDetails();
		System.out.println();
		tech.printDetails();
		

	}

}
