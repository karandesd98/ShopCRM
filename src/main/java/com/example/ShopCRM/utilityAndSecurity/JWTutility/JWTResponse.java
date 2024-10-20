package com.example.ShopCRM.utilityAndSecurity.JWTutility;




public class JWTResponse {
	
	
 private String jwtToken;
 private String userName;
 

public JWTResponse(String jwtToken, String userName) {
	super();
	this.jwtToken = jwtToken;
	this.userName = userName;
}


public JWTResponse() {
	super();
	// TODO Auto-generated constructor stub
}


public String getJwtToken() {
	return jwtToken;
}
public void setJwtToken(String jwtToken) {
	this.jwtToken = jwtToken;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
@Override
public String toString() {
	return "JWTResponse [jwtToken=" + jwtToken + ", userName=" + userName + "]";
}



 
 
}
