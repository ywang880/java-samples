package com.learning.java.app;

public class Customer {

	private String firstname;
	private String lastname;
	private String occupation;
	private int age;
	private String email;
	private String phone;

	public Customer(String firstname, String lastname, int age, String occupation, String email, String phone) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.occupation = occupation;
		this.age = age;
		this.email = email;
		this.phone = phone;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Customer [firstname=" + firstname + ", lastname=" + lastname + ", occupation=" + occupation + ", age="
				+ age + ", email=" + email + ", phone=" + phone + "]";
	}
}
