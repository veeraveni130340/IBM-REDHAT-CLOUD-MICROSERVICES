package com.app;

import java.util.Scanner;

import com.example.Employee;
import com.example.Engineer;
import com.example.Manager;

public class App {
	
	//private static Scanner scanner=new Scanner(System.in);
	//private Employee[] employees;
	
	//{
	//	employees=new Employee[5];
	//}
	public static void main(String args[])
	{
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
		n=scanner.nextInt();
		Employee employe=new Employee();
		for(int i=0;i<n;i++) {
		System.out.println("enter the email");
		employe.setEmail(scanner.next());
		System.out.println("enter the Employeid");
		employe.setEmployeeId(scanner.nextInt());
		System.out.println("enter the firstname");
		employe.setFirstName(scanner.next());
		System.out.println("enter the lastname2");
		employe.setLastName(scanner.next());
		}
		for(int j=0;j<n;j++) {
			
		System.out.println("employe_email:" +employe.getEmail());
		System.out.println("employe_firstname:" +employe.getFirstName());
		System.out.println("employe_lastname:" +employe.getLastName());
		System.out.println("employe_id:" +employe.getEmployeeId());
		}
		//App app=new App();
		//app.employees[0]=new Employee(10, "John", "Doe", "john@email.com");
		//app.employees[1]=new Manager(20, "Marry", "Public", "marry@email.com", "Sales");
		//app.employees[2]=new Engineer(30, "Sachin", "Tendulkar", "sachin@email.com", "Mechanical");
		
		//enhanched for loop
		//for(Employee employee : app.employees)
		//{
		//System.out.println(employee);
		//}
		
		//standard for loop
		
	    // for(int i=0;i<app.employees.length;i++)
		//{
	    	 
         // 	System.out.println(app.employees[i]);
       // }
		
	}

}
