package com.example.ShopCRM.managerImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ShopCRM.Entities.User;
import com.example.ShopCRM.exception.ResourceNotFoundException;
import com.example.ShopCRM.manager.UserManager;
import com.example.ShopCRM.repository.UserRepository;



@Service
public class UserManagerImpl implements UserManager {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User save(User u) {
		// TODO Auto-generated method stub
		return	userRepository.save(u);
	}

	@Override
	public User get(Integer id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id)
				 .orElseThrow(() -> new ResourceNotFoundException("data not fond"));
	}

	@Override
	public void deleteUserById(Integer id) {
		userRepository.deleteById(id);
		
	}
	
	@Override
	 public User getUserByUsername(String userName) {
	        Optional<User> userOptional = userRepository.findByUserName(userName);
	        return userOptional.orElse(null); 
	    }
	

}
