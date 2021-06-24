package org.example.setdemo.Dao;

import java.util.List;

import org.example.model.Student;
import org.example.setdemo.Dao.*;

public interface StudentDao {

	public Student createStudent(Student student);

	public List<Student> displayAllStudents();

	public Student findById(int id);

	public void deleteById(int id);

	public Student updateById(int id);

}