
package com.example1;

public class Engineer1 extends Employee1 {
	
	private String stream;

	public Engineer1() {
		super();
	}

	

	public Engineer1(Integer employeeId, String firstName, String lastName, String email, EmployeeType employeeType,String stream) {
		super(employeeId, firstName, lastName, email, employeeType);
		// TODO Auto-generated constructor stub
		this.stream=stream;
	}



	@Override
	public String toString() {
		return "Engineer [stream=" + stream + ", toString()=" + super.toString() + "]";
	}
	
	

}