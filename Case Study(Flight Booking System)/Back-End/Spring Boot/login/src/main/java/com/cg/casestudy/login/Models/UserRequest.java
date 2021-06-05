package com.cg.casestudy.login.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserRequest {

    private String email;
    private String password;
    
	public UserRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UserRequest(String email, String password) {
		super();
		this.email = email;
		this.password = password;
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

	@Override
	public String toString() {
		return "UserRequest [email=" + email + ", password=" + password + "]";
	}

}
