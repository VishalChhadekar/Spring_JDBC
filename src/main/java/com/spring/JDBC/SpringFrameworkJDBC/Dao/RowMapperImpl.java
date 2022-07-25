package com.spring.JDBC.SpringFrameworkJDBC.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.JDBC.SpringFrameworkJDBC.Student;

public class RowMapperImpl implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student stu = new Student();
		stu.setStuId(rs.getInt(1));
		stu.setStuName(rs.getString(2));
		stu.setCity(rs.getString(3));
		return stu;
	}

}
