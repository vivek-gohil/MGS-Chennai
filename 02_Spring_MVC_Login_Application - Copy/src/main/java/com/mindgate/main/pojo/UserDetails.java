package com.mindgate.main.pojo;

public class UserDetails {
	private String firstName;
	private String lastName;
	private String gender;
	private String qualification;

	public UserDetails() {
		// TODO Auto-generated constructor stub
	}

	public UserDetails(String firstName, String lastName, String gender, String qualification) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.qualification = qualification;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	@Override
	public String toString() {
		return "UserDetails [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", qualification=" + qualification + "]";
	}

}
