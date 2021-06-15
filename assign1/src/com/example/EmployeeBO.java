
package com.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeBO {
	public static void printDetails(List<Employe> list) {
		System.out.print("EmployeeId       name       department       dateOfJoining    age      salary");
		System.out.println();
		list.forEach(x -> {
			System.out.println(x.getId()+"    "+  x.getName()+"   "+  x.getDepartment()+"     "+ x.getDateOfJoining()+"    " +  x.getAge()+"   "+  x.getSalary());
		});
	}
}
