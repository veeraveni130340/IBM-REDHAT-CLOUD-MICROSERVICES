package org.example.demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.example.dao.EmployeeDaoImpl;
import org.example.dao.EmployeeNotFoundException;
import org.example.model.Employee;
import org.example.survice.Service;
import org.example.survice.ServiceImpl;

public class App {
	private static Logger logger = Logger.getLogger("org.example.hibernate_crud_demo.App.class");

	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		// logger.info("service layer initiating");
		Service service = new ServiceImpl();
		// logger.info("service layer initiated");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String firstName, lastName, email = null;
		int choice = 0;
		// logger.info("going to do while loop.");
		do {
			try {
				System.out.println("1. Create Employee.");
				System.out.println("2. Display All Employees");
				System.out.println("3.Find Employee By Id: ");
				System.out.println("4.Update Employee By Id: ");
				System.out.println("5.delete Employee By Id: ");
				System.out.println("0.Exit: ");
				System.out.print("Enter Your Choice: ");
				choice = Integer.parseInt(bufferedReader.readLine());
				switch (choice) {
				case 1:
					System.out.print("First Name: ");
					firstName = bufferedReader.readLine();
					System.out.print("Last Name: ");
					lastName = bufferedReader.readLine();
					System.out.print("Email: ");
					email = bufferedReader.readLine();
					Employee employee = new Employee(new Random().nextInt(10000), firstName, lastName, email);
					employee = service.createEmployee(employee);
					System.out.println("Created: " + employee);
					break;
				case 2:
					List<Employee> list = service.displayAllEmployee();
					Iterator<Employee> iterator = list.iterator();
					while (iterator.hasNext()) {
						System.out.println(iterator.next());
					}
					break;

				case 3:
					System.out.print("id: ");
					int id = Integer.parseInt(bufferedReader.readLine());
					employee = service.getemployeeById(id);
					if (employee == null) {
						System.out.println("No Such employee found. ");
					} else {
						System.out.println("employee found: " + employee);
					}

					break;
				case 4:
					logger.info("updating");
					// System.out.println("update starting");
					try {

						System.out.print("id: ");
						id = Integer.parseInt(bufferedReader.readLine());
						employee = service.updateEmployee(id);
						System.out.println("updated: " + employee);
						logger.info("updated");
						// System.out.println("updated");
					} catch (EmployeeNotFoundException e) {
						System.err.println(e.getMessage());
					}

					break;
				case 5:
					logger.info("deletion started..");
					try {

						System.out.println("id: ");
						id = Integer.parseInt(bufferedReader.readLine());
						employee = service.deleteEmployee(id);
						System.out.println("deleted. " + employee);
						logger.info("deleted successfully");

					} catch (EmployeeNotFoundException e) {
						System.err.println(e.getMessage());

					}

					break;
				default:
					System.out.println("invalid choice:");
					break;
				}

			} catch (Exception e) {
				// TODO: handle exception
			}

		} while (choice != 0);

	}

}