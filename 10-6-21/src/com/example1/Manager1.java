
package com.example1;

public class Manager1 extends Employee1 {
	private String departmentName;

	public Manager1() {
		super();
	}

	

	public Manager1(Integer employeeId, String firstName, String lastName, String email, EmployeeType employeeType,String departmentName) {
		super(employeeId, firstName, lastName, email, employeeType);
		this.departmentName=departmentName;
	}



	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Manager [departmentName=" + departmentName + ", toString()=" + super.toString() + "]";
	}
	
	

}