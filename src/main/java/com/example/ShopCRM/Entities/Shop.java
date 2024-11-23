package com.example.ShopCRM.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "SHOP")
public class Shop {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="SHOP_ID")
    private Integer shopId;
	
	@Column(name = "NAME") 
    private String name;
	
	@Column(name = "ADDRESS") 
    private String address;
	
	@Column(name = "LOGO") 
    private String logo;
	
	@Column(name = "CONTACTNO") 
    private String contactno;
	
	@Column(name = "IMAGE") 
    private String image;
	
	

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	

}
