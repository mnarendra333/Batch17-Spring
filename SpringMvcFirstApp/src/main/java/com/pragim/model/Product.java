package com.pragim.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Product {
	
	@Id
	@GeneratedValue
	private int proId;
	
	@Column(length=30,unique=true,nullable=false)
	private String proName;
	private double price;
	private int qty;
	
	@Column(length=30)
	private String category;
	
	public Product(){
		
	}
	
	
	public Product(int proId, String proName, double price, int qty,
			String category) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.price = price;
		this.qty = qty;
		this.category = category;
	}
	
	
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	

}
