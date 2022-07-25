package com.spring.JDBC.SpringFrameworkJDBC.Dao;

import java.util.List;

import com.spring.JDBC.SpringFrameworkJDBC.Student;

public interface StudentDao {
	public int insert(Student student);
	public int change(Student student);
	public int delete(int stuID );
	public Student getStudent(int stuID);
	public List<Student> getStudentList();

}
