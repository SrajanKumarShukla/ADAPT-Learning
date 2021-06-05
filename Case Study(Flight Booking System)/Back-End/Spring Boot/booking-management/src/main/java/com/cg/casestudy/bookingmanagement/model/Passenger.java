package com.cg.casestudy.bookingmanagement.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;
import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Passenger {
	
	@Id
	@NotEmpty(message = "passengerId must not be empty")
	private String id;
	@NotEmpty(message = "firstName must not be empty")
	private String firstName;
	private String middleName;
	@NotEmpty(message = "lastName must not be empty")
	private String lastName;
	@NotNull(message = "age must not be null")
	@Range(min=5, max=120, message="age must be 5 to 120")
	private Integer age;
	private String gender;
	private String seatNo;
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Passenger(@NotEmpty(message = "passengerId must not be empty") String id,
			@NotEmpty(message = "firstName must not be empty") String firstName, String middleName,
			@NotEmpty(message = "lastName must not be empty") String lastName,
			@NotNull(message = "age must not be null") @Range(min = 5, max = 120, message = "age must be 5 to 120") Integer age,
			String gender, String seatNo) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.seatNo = seatNo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}
	@Override
	public String toString() {
		return "Passenger [id=" + id + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", age=" + age + ", gender=" + gender + ", seatNo=" + seatNo + "]";
	}
	
}