package com.example.ShopCRM.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ShopCRM.Entities.User;



public interface UserRepository extends JpaRepository<User, Integer> {
	  // Method to find users by their userName
    Optional<User> findByUserName(String userName);
}
