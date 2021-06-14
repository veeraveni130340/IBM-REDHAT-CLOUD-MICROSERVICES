package com.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.UUID;
import java.util.Vector;

import com.example.Employee;
import com.example.Student;

public class App {

	public static void main(String[] args) {
		
		/*
		 * Vector<Student> vector=new Vector<Student>(); vector.add(new Student(1,
		 * "John", 5.5)); vector.add(new Student(2, "Marry", 5.7)); vector.add(new
		 * Student(3, "Public", 4.9)); System.out.println(vector); //enhanched for loop
		 * for(Student s:vector) { System.out.println(s); } //enum implementation
		 * Enumeration<Student> e=vector.elements(); while(e.hasMoreElements()) {
		 * System.out.println(e.nextElement()); } //iterator implementation
		 * Iterator<Student> i=vector.iterator(); while(i.hasNext()) {
		 * System.out.println(i.next()); } Stack<Student> stack=new Stack<Student>();
		 * stack.push(new Student(1, "John", 5.5)); stack.push(new Student(2, "Marry",
		 * 5.7)); int v=stack.capacity(); System.out.println(v);
		 * System.out.println(stack); System.out.println(stack.pop());
		 * System.out.println(stack); System.out.println(stack.peek());
		 * System.out.println(stack); Collection<Student> colllCollection=new
		 * ArrayList<>(); colllCollection.add(new Student()); colllCollection.add(new
		 * Student()); stack.addAll(colllCollection); System.out.println("=========\n");
		 * Enumeration<Student> s=stack.elements(); while(s.hasMoreElements()) {
		 * System.out.println(s.nextElement()); }
		 * 
		 */
		
		Vector<Employee> vector=new Vector<Employee>();
		vector.add(new Employee(UUID.randomUUID().toString(),"John","Doe","john@email.com",20000));
		vector.add(new Employee(UUID.randomUUID().toString(),"John1","Doe1","john1@email.com",25000));
		vector.add(new Employee(UUID.randomUUID().toString(),"John2","Doe2","john2@email.com",19000));
		
		for(Employee e:vector) {
		System.out.println(e);
	}
		Iterator<Employee> i = vector.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		Set<Employee> set=new TreeSet<Employee>();
		set.add(new Employee(UUID.randomUUID().toString(),"John","Doe","john@email.com",20000));
		set.add(new Employee(UUID.randomUUID().toString(),"John1","Doe1","john1@email.com",17000));
		int v= set.size();
		System.out.println(set);
		
		Collection<Employee> coll=new ArrayList<>();
		
		coll.add( new Employee());
		coll.add( new Employee());

		set.addAll(coll);
		System.out.println(".................");
		
	}
}