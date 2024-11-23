package com.example.ShopCRM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ShopCRM.Entities.Shop;


@Repository
public interface ShopRepo extends JpaRepository<Shop, Integer> {

}
