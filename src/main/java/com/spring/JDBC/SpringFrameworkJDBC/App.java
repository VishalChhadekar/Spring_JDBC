package com.spring.JDBC.SpringFrameworkJDBC;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.JDBC.SpringFrameworkJDBC.Dao.StudentDao;
import com.spring.JDBC.SpringFrameworkJDBC.Dao.StudentDaoImp;

public class App {
	public static void main(String[] args) {
		System.out.println("Program Initiated!");
		ApplicationContext con = new ClassPathXmlApplicationContext("Config.xml");

		StudentDao stuBean = con.getBean("studentDao", StudentDaoImp.class);
		Student st = new Student();
		// SAVE
//		st.setStuId(36);
//		st.setStuName("Morphious");
//		st.setCity("Heven");
//		int updatedRow = stuBean.insert(st);

		// UPDATE
		//Student st = new Student();
//		st.setStuId(35);
//		st.setStuName("Vishal");
//		st.setCity("Maha");
//		int updatedRow = stuBean.change(st);

		// DELETE
//		int updatedRow = stuBean.delete(34);
//		System.out.println("Updated recordes: " + updatedRow);

		// RED
//		Student student = stuBean.getStudent(36);
//		System.out.println("Student Name: " + student.getStuName());
//		System.out.println("Student City: " + student.getCity());

		// READ ALL RECORDS
		List<Student> studentList = stuBean.getStudentList();
		for (Student student : studentList) {
			System.out.println("ID:" + student.getStuId());
			System.out.println("Name:" + student.getStuName());
			System.out.println("City:" + student.getCity());
		}
	}
}
