package com.example.ShopCRM.utilityAndSecurity.JWTutility;

public class JWTRequest {

	private String email;
	private String password;
	
	
	
	public JWTRequest() {
		super();
	}
	
	
	public JWTRequest(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "JWTRequest [email=" + email + ", password=" + password + "]";
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
	
}
