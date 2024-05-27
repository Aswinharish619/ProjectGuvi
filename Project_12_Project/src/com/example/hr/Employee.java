package com.example.hr;

public class Employee {

	String name;
	int id;
	double salary;

	public Employee(String name, int id, double salary) {//constructor

		this.name = name;
		this.id = id;
		this.salary = salary;

	}

	public void printName() {// Method to print the employee's name

		System.out.println("Employee Name--" + name);

	}

	public void printSalary() {// Method to print the employee's salary

		System.out.println("Employee Salary--" + salary);

	}

}
