package com.cartService.CartService.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cartService.CartService.model.Cart;

@Repository public interface CartRepository extends MongoRepository<Cart,String>{

List<Cart> findByUsername(String username);

List<Cart> findByDrugsId(int id);

List<Cart> findById(int Id);

Cart findByUsernameAndId(int drugsId, String username);

Boolean existsByUsernameAndId(int drugsId, String username);

void deleteByUsername(String username); }
