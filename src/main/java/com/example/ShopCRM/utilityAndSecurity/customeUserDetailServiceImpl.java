package com.example.ShopCRM.utilityAndSecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.example.ShopCRM.Entities.User;
import com.example.ShopCRM.manager.UserManager;



public class customeUserDetailServiceImpl implements UserDetailsService {

	@Autowired 
	public UserManager userManager;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userManager.getUserByUsername(username);
		
		if (user == null) {
			throw new UsernameNotFoundException("could not found usre");
		}

		CustomUserDetail customUserDetail = new CustomUserDetail(user);
		return customUserDetail;
		
	}

}
