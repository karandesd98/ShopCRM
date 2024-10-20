package com.example.ShopCRM.manager;

import java.util.List;

import com.example.ShopCRM.Entities.User;



public interface UserManager {
	
	public List<User> getAllUser();
	public User save(User u);
	public User get(Integer id);
	public void deleteUserById(Integer id);
	User getUserByUsername(String userName);
	
}
