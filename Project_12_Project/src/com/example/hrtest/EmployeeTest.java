package com.example.hrtest;

import com.example.hr.Employee;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		// Create an instance of the Employee class		
		Employee emp = new Employee("Rajesh", 8128639, 64580.55);
		Employee emp1 = new Employee("Kannan", 8125501, 55500.00);
		// Call the methods to print the employee's name and salary
		emp.printName();
		emp.printSalary();
		
		//emp1.printName();
		//emp1.printSalary();
		
	}

}
