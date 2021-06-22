package org.example.survice;

import java.util.List;

import org.example.model.Employee;

public interface Service {
	public Employee createEmployee(Employee employee);
	public List<Employee> displayAllEmployee();
	public Employee getemployeeById(Integer id);
	public Employee updateEmployee(Integer id);
	public Employee deleteEmployee(Integer id);
}