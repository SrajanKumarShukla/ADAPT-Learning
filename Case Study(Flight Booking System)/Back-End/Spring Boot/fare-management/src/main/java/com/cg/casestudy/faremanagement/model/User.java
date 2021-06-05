package com.cg.casestudy.faremanagement.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {
	
	@Id
	private int id;
	private String fullname;
	private String username;
	private String email;
	private String password;
	private String role;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String fullname, String username, String email, String password, String role) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.username = username;
		this.email = email;
		this.password = password;
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", fullname=" + fullname + ", username=" + username + ", email=" + email
				+ ", password=" + password + ", role=" + role + "]";
	}

}
