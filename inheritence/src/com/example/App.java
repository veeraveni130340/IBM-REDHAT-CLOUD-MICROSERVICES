package com.example;
//this is my main class
import com.example.model.Employee;
import com.example.model.Engineer;
import com.example.model.Manager;

public class App {

	public static void main(String[] args) {
		App app=new App();
		Employee employee=new Manager("John", "Doe", "john@email.com", 10000, "Sales");
		System.out.println(employee.getDetails());
		System.out.println(app.calculateTax(employee));
		employee=new Engineer("Marry", "Public", "marry@email.com", 19000, "Mechanical");
		System.out.println(employee.getDetails());
		System.out.println(app.calculateTax(employee));
	}
	
	
	public double calculateTax(Employee employee)
	{
		double tax=0;
		if(employee instanceof Manager)
		{
			Manager manager=(Manager)employee;
			tax= (12.0/100)*manager.getSalary();
		}
		if(employee instanceof Engineer)
		{
			Engineer engineer=(Engineer)employee;
			
			tax=(11.9/100)*engineer.getSalary();
		}
		return tax;
	}

}