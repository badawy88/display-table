package com.edu.displaytag.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class User implements Serializable {
	private long id;
	private String userName;
	private String email;
	private int age;
	private String firstName;
	private String lastName;

	public User() {

	}

	public User(long id, String userName, String email, int age, String firstName, String lastName) {
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
