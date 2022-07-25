package com.spring.JDBC.SpringFrameworkJDBC;

public class Student {
	private int stuId;
	private String stuName;
	private String city;

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "[stuId=" + stuId + ", stuName=" + stuName + ", city=" + city + "]";
	}

}
