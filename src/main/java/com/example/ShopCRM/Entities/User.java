package com.example.ShopCRM.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "MY_USER")
public class User {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="USER_ID")
    private Integer userId;

    @Column(name = "USER_NAME") // we are login using user name column
    private String userName;

    @Column(name = "EMAIL") 
    private String email;
    
    @Column(name = "PASSWORD")
    private String password;
    
    @Column(name = "ROLE")
    private String role;
    
    @Column(name = "IS_ENABLED", nullable = false, columnDefinition = "BOOLEAN DEFAULT true")
    private boolean isEnabled;
    
    @Column(name = "IMAGE")
    private String image;
    
    @Column(name = "ABOUT") 
    private String about;



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

	public boolean getIsEnabled() {
		return isEnabled;
	}

	public void setIsEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}


    
   
}

