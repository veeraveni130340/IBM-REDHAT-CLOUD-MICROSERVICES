package com.app1;

import java.util.Scanner;

import com.example1.Employee1;
import com.example1.Engineer1;
import com.example1.Manager1;
import static java.lang.System.out;
import static java.lang.System.in;
import static com.example1.Employee1.max;
import static java.lang.Math.PI;
import static com.example1.EmployeeType.HOORLY_PAID;
import static com.example1.EmployeeType.SALARIED;
public class App1 {
	
	private static Scanner scanner=new Scanner(in);
	private Employee1[] employees;
	
	{
		employees=new Employee1[5];
	}
	public static void main(String args[])
	{
		int a=max;
		System.out.println(a);
		System.out.println(PI);
		App1 app=new App1();
		app.employees[0]=new Employee1(10, "John", "Doe", "john@email.com",SALARIED);
		app.employees[1]=new Manager1(20, "Marry", "Public", "marry@email.com", HOORLY_PAID,"Sales");
		app.employees[2]=new Engineer1(30, "Sachin", "Tendulkar", "sachin@email.com", SALARIED, "Mechanical");
		
		
		//enhanched for loop
		for(Employee1 employee : app.employees)
		{
			System.out.println(employee);
		}
		
		//standard for loop
		for(int i=0;i<app.employees.length;i++)
		{
			out.println(app.employees[i]);
		}
		
	}

}