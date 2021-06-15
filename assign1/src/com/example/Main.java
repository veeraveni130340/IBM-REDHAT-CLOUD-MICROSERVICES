package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class Main {

	public static void main(String[] args) {

		List<Employe> list = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no.of employees");
		int e = sc.nextInt();
		int c=1;
		for (int i = 0; i < e; i++) {

			System.out.println("enter the details of the employee" + c);

			String name = sc.next();
			String department = sc.next();
			Date dateOfJoining = new Date();
			int age = sc.nextInt();
			int salary = sc.nextInt();
			Employe emp = new Employe(new Random().nextInt(), name, department, dateOfJoining, age, salary);
			list.add(emp);
			c++;
		}
		System.out.println("1.Sort employees by salary");
		System.out.println("2.Sort employees by age and by date of joining");
		System.out.println("enter the choice");
		int x = sc.nextInt();
		switch (x) {
		case 1:
			Collections.sort(list);
			EmployeeBO.printDetails(list);
			break;
			

		case 2:
			AgeComparator age = new AgeComparator();
			Collections.sort(list, age);
			EmployeeBO.printDetails(list);
			break;

		default:
			EmployeeBO.printDetails(list);

		}
	}
}
