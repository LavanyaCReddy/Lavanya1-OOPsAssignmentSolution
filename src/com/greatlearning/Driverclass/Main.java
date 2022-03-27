package com.greatlearning.Driverclass;



import com.greatlearning.model.AdminDepartment;
import com.greatlearning.model.HrDepartment;
import com.greatlearning.model.SuperDepartment;
import com.greatlearning.model.TechDepartment;

public class Main {
	public static void main(String[] args) {
		AdminDepartment admin= new AdminDepartment();
		System.out.println("Welcome to "+admin.departmentName() + "\n" 
		                    + admin.getTodaysWork()+ "\n "
		                    + admin.getWorkDeadline()+ "\n"
		                    + admin.isTodayAHoliday());
		System.out.println("\n");
		
        HrDepartment hr = new HrDepartment();
        System.out.println("Welcome to "+hr.departmentName() + "\n" 
                + hr.getTodaysWork()+ "\n "
                + hr.getWorkDeadline()+ "\n"
                + hr.doActivity()+ "\n"
                + hr.isTodayAHoliday());
        System.out.println("\n");
		
        
        TechDepartment tech = new TechDepartment();
        System.out.println("Welcome to "+tech.departmentName() + "\n" 
                + tech.getTodaysWork()+ "\n "
                + tech.getWorkDeadline()+ "\n"
                + tech.getTechStackInformation()+ "\n"
                + tech.isTodayAHoliday());

		
		}
}


