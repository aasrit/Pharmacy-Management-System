package com.cartService.CartService.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@AllArgsConstructor

@NoArgsConstructor

@Document(collection ="cart")
public class Cart {
    @Id
	private int id;
	private String username;
	private int drugsId;
	private String drugsName;
	private double drugsCost;
	private int drugsQty;
	private int stockQty;
	private String drugsDescription;
	private double total;
	
	
	public Cart(int id, String username, int drugsId, String drugsName, double drugsCost, int drugsQty, int stockQty,
			String drugsDescription, double total) {
		super();
		this.id = id;
		this.username = username;
		this.drugsId = drugsId;
		this.drugsName = drugsName;
		this.drugsCost = drugsCost;
		this.drugsQty = drugsQty;
		this.stockQty = stockQty;
		this.drugsDescription = drugsDescription;
		this.total = total;
	}
	public Cart() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getDrugsId() {
		return drugsId;
	}
	public void setDrugsId(int drugsId) {
		this.drugsId = drugsId;
	}
	public String getDrugsName() {
		return drugsName;
	}
	public void setDrugsName(String drugsName) {
		this.drugsName = drugsName;
	}
	public double getDrugsCost() {
		return drugsCost;
	}
	public void setDrugsCost(double drugsCost) {
		this.drugsCost = drugsCost;
	}
	public int getDrugsQty() {
		return drugsQty;
	}
	public void setDrugsQty(int drugsQty) {
		this.drugsQty = drugsQty;
	}
	public int getStockQty() {
		return stockQty;
	}
	public void setStockQty(int stockQty) {
		this.stockQty = stockQty;
	}
	public String getDrugsDescription() {
		return drugsDescription;
	}
	public void setDrugsDescription(String drugsDescription) {
		this.drugsDescription = drugsDescription;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	

}