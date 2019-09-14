package org.bridgelabz.application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_hbn")
public class Student {
	@Id   
	@GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name="id")
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="username")
	String userName;
	@Column(name="password")
	String password;
	@Column(name="age")
	int age;
	@Column(name="gender")
	String gender;
	@Column(name="email")
	String email;
	@Column(name="phnumber")
	String phnum;
	public Student() {}
	public Student(String userName, String password, int age, String gender, String email, String phnum) {
		super();
		this.userName = userName;
		this.password = password;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.phnum = phnum;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhnum() {
		return phnum;
	}
	public void setPhnum(String phnum) {
		this.phnum = phnum;
	}
}
