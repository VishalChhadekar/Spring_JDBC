package com.spring.JDBC.SpringFrameworkJDBC.Dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.JDBC.SpringFrameworkJDBC.Student;

public class StudentDaoImp implements StudentDao {

	private JdbcTemplate template;

	// SAVE
	public int insert(Student student) {
		String query = "insert into student (ID,StuName,StuCity ) values(?,?,?)";
		return this.template.update(query, student.getStuId(), student.getStuName(), student.getCity());
	}

	// DELETE
	public int delete(int stuID) {
		String query = "delete from student where ID=?";
		return this.template.update(query, stuID);
	}

	// UPDATE
	public int change(Student s) {
		String query = "update student set StuName='" + s.getStuName() + "',StuCity='" + s.getCity() + "' where ID='"
				+ s.getStuId() + "' ";
		return template.update(query);
	}

	// READ
	public Student getStudent(int stuID) {
		RowMapper<Student> rowMapper = new RowMapperImpl();
		String query = "select * from student where ID=?";
		return this.template.queryForObject(query, rowMapper, stuID);
	}

	// READ ALL RECORDS
	public List<Student> getStudentList() {
		String query = "select * from student";
		return this.template.query(query, new RowMapperImpl());
	}

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

}
