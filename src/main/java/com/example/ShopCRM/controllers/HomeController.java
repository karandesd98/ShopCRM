package com.example.ShopCRM.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ShopCRM.Entities.Shop;
import com.example.ShopCRM.manager.ShopManager;
import com.example.ShopCRM.repository.ShopRepo;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;


@RestController
public class HomeController {
	
	@Autowired
	ShopManager shopManager;

	@GetMapping("/welcome")
	ResponseEntity<String> welcome() {
		return new ResponseEntity<>("welcome to software development business", HttpStatus.OK); 
	}
	
	@GetMapping("/privateWelcome")
	ResponseEntity<String> privateWelcome() {
		return new ResponseEntity<>("privateWelcome",HttpStatus.CREATED) ;
	}
	
	@PostMapping("/saveShop")
	public String saveShop(@RequestBody Map<String, Object> shopDetails) {

		String name = (String) shopDetails.get("name");
		String address = (String) shopDetails.get("address");
		String logo = (String) shopDetails.get("logo");
		String contactno = (String) shopDetails.get("contactno");
		String image = (String) shopDetails.get("image");
		Integer shopId = shopDetails.get("shopId") != null && !shopDetails.get("shopId").toString().equalsIgnoreCase("") ? Integer.parseInt(shopDetails.get("shopId").toString()) : 0;

		Shop shop = null;
		if (shopId != null && !shopId.equals(0))
			shop = shopManager.get(shopId);
		else
			shop = new Shop();

		shop.setName(name);
		shop.setAddress(address);
		shop.setLogo(logo);
		shop.setContactno(contactno);
		shop.setImage(image);

		shopManager.save(shop);

		return "Shop saved successfully!";
	}
	
	
	
	    @GetMapping("/getAllShop.json")
	    public ResponseEntity<String> getAllShops() {
	    	
	        List<Shop> shops = shopManager.getAll(); 

	        JsonObject response = new JsonObject();
	        response.addProperty("status", "success");
	        response.addProperty("message", "Shops fetched successfully");

	        JsonArray shopsArray = new JsonArray();

	        for (Shop shop : shops) {
	            JsonObject shopObject = new JsonObject();
	            shopObject.addProperty("shopId", shop.getShopId());
	            shopObject.addProperty("name", shop.getName());
	            shopObject.addProperty("address", shop.getAddress());
	            shopObject.addProperty("logo", shop.getLogo());
	            shopObject.addProperty("contactno", shop.getContactno());
	            shopObject.addProperty("image", shop.getImage());

	            shopsArray.add(shopObject);
	        }

	        response.add("shops", shopsArray);

	        return new ResponseEntity<>(response.toString(), HttpStatus.OK);
	    }
	
	    
	    @DeleteMapping("/deleteShop/{id}")
	    public ResponseEntity<Void> deleteShop(@PathVariable Integer id) {
	    	shopManager.delete(id);
	        return ResponseEntity.noContent().build();
	    }
	
}
