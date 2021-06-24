package org.example.setdemo.service;

import java.util.List;

import org.example.setdemo.Dao.StudentDao;
import org.example.setdemo.Dao.StudentImpl;
import org.example.model.Student;

public class StudentServiceImpl implements StudentService {
	StudentDao studentDao = null;
	{
		studentDao = new StudentImpl();
	}

	@Override
	public Student createStudent(Student student) {
		return studentDao.createStudent(student);
	}

	@Override
	public List<Student> displayAllStudents() {
		// TODO Auto-generated method stub
		return studentDao.displayAllStudents();
	}

	@Override
	public Student findById(int id) {
		// TODO Auto-generated method stub
		return studentDao.findById(id);
	}

	@Override
	public void deleteById(int id) {
		studentDao.deleteById(id);
	}

	@Override
	public Student updateById(int id) {
		return studentDao.updateById(id);
	}

}
