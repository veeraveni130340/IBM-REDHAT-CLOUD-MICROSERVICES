package org.example.factory;

import java.util.Properties;
import org.example.model.Employee;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Factory {

	private static Factory mySessionFactory;
	private SessionFactory sessionFactory;

	private Properties properties = null;

	private Factory() {
		properties = new Properties();
		properties.put("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
		properties.put("hibernate.connection.password", "root");
		properties.put("hibernate.connection.url", "jdbc:mysql://localhost: 3306/hr");
		properties.put("hibernate.connection.username", "root");
		properties.put("hibernate.default_schema", "hr");

	}

	public static Factory createMySessionFactory() {
		if (mySessionFactory == null) {
			mySessionFactory = new Factory();
		}
		return mySessionFactory;
	}

	public SessionFactory getSessionFactory() {
		sessionFactory = new Configuration().addProperties(properties).addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		return sessionFactory;
	}

}
