package org.example.survice;

import java.util.List;

import org.example.dao.EmployeeDao;
import org.example.dao.EmployeeDaoImpl;
import org.example.model.Employee;

public class ServiceImpl implements Service {

	private EmployeeDao employeeDao;
	
	{
		employeeDao = new EmployeeDaoImpl();
	}

	@Override
	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.createEmployee(employee);
	}

	@Override
	public List<Employee> displayAllEmployee() {
		// TODO Auto-generated method stub
		return employeeDao.displayAllEmployee();
	}

	@Override
	public Employee getemployeeById(Integer id) {
		// TODO Auto-generated method stub
		return employeeDao.getemployeeById(id);
	}

	@Override
	public Employee updateEmployee(Integer id) {
		// TODO Auto-generated method stub
		return employeeDao.updateEmployee(id);
	}

	
	@Override
	public Employee deleteEmployee(Integer id) {
		return employeeDao.deleteEmployee(id);
	}

}