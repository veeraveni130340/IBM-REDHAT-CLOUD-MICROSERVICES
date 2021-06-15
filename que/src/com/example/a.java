package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;



public class Main {

	public static void main(String args[]) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the number of employees :");
		n=sc.nextInt();
		Employe emp = new Employe();
		for(int i=0;i<n;i++) {
			System.out.println("enter the details for employee1");
			System.out.println("enter id");
		    emp.setId(sc.nextInt());
		    System.out.println("enter name");
		    emp.setName(sc.next());
		    System.out.println("enter Department");
		    emp.setDepartment(sc.next());
		    System.out.println("enter date of joining");
		    emp.setDateOfJoining(null);
		    System.out.println("enter age");
		    emp.setAge(sc.nextInt());
		    System.out.println("enter salary");
		    emp.setSalary(sc.nextInt());
		}
		for(int j=0;j<n;j++) {
			System.out.println("id"+emp.getId());
			System.out.println("name"+emp.getName());
			System.out.println("Department"+emp.getDepartment());
			System.out.println("Date"+emp.getDateOfJoining());
			System.out.println("Age"+emp.getAge());
			System.out.println("Salary"+emp.getSalary());
		}
		List<Employe> l = new ArrayList<>();
		l.add(emp);
		System.out.println("enter ur choice");
		int x=sc.nextInt();
		
		
		
		switch (x) {

		case 1:
			
			AgeComparator age = new AgeComparator();
			Collections.sort(l, age);

			break;
		case 2:
			SalaryComparator sal=new SalaryComparator();
			Collections.sort(l,sal);
			
			break;
		default:
			Collections.sort(l);

		}
		System.out.println(l);

	}

}
