package com.example.ShopCRM.managerImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ShopCRM.Entities.Shop;
import com.example.ShopCRM.exception.ResourceNotFoundException;
import com.example.ShopCRM.manager.ShopManager;
import com.example.ShopCRM.repository.ShopRepo;

@Service
public class ShopManagerImpl implements ShopManager {
	
	@Autowired
	ShopRepo shopRepo;

	@Override
	public List<Shop> getAll() {
		// TODO Auto-generated method stub
		return shopRepo.findAll();
	}

	@Override
	public Shop save(Shop obj) {
		// TODO Auto-generated method stub
		return shopRepo.save(obj);
	}

	@Override
	public Shop get(Integer id) {
		return shopRepo.findById(id)
				 .orElseThrow(() -> new ResourceNotFoundException("data not fond"));
	}

	@Override
	public void delete(Integer id) {
		shopRepo.deleteById(id);
	}

}
