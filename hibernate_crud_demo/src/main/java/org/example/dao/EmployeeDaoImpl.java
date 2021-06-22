package org.example.dao;



import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

import javax.persistence.Query;

import org.example.factory.Factory;
import org.example.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;



public class EmployeeDaoImpl implements EmployeeDao {
	
	private Factory mySessionFactory;
	private SessionFactory sessionFactory;
	private Session session;
	private static Scanner scanner=new Scanner(System.in);
	
	{
		mySessionFactory=Factory.createMySessionFactory();
		sessionFactory=mySessionFactory.getSessionFactory();
		session=sessionFactory.openSession();
	}

	@Override
	public Employee createEmployee(Employee employee) {
		session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(employee);
		session.getTransaction().commit();
		return employee;
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> displayAllEmployee() {
		session=sessionFactory.openSession();
	
		Query query=session.createQuery("select E from Employee E");
		return query.getResultList();
		
	}

	@Override
	public Employee getemployeeById(Integer id) {
		session=sessionFactory.openSession();
		return session.get(Employee.class, id);
	}

	@Override
	public Employee updateEmployee(Integer id) {
		session=sessionFactory.openSession();
		Employee tempEmployee= session.get(Employee.class, id);
		if(tempEmployee ==null)
		{
			
			throw new EmployeeNotFoundException("employee not found.");
			
		}
		System.out.print("First Name: ");
		String firstName=scanner.next();
		System.out.print("Last Name: ");
		String lastName=scanner.next();
		System.out.print("Email: ");
		String email=scanner.next();
		tempEmployee.setFirstName(firstName);
		tempEmployee.setLastName(lastName);
		tempEmployee.setEmail(email);
		session.getTransaction().begin();
		session.merge(tempEmployee);
		session.getTransaction().commit();
		return tempEmployee;
		
	}

	@Override
	public Employee deleteEmployee(Integer id) {
		session=sessionFactory.openSession();
		Employee tempEmployee= session.get(Employee.class, id);
		if(tempEmployee ==null)
		{
			
			throw new EmployeeNotFoundException("employee not found.");
			
		}
		session.getTransaction().begin();
		session.remove(tempEmployee);
		session.getTransaction().commit();
		return tempEmployee;
	}

}
