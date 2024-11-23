package com.example.ShopCRM.manager;

import java.util.List;
import com.example.ShopCRM.Entities.Shop;


public interface ShopManager {
	
	public List<Shop> getAll();
	public Shop save(Shop u);
	public Shop get(Integer id);
	public void delete(Integer id);
	
}
