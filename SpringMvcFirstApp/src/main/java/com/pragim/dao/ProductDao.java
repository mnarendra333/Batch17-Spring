package com.pragim.dao;

import java.util.List;

import com.pragim.model.Product;

public interface ProductDao {
	
	List<Product> getAllProuducts();

	String deleteProduct(int proId);

	String saveProduct(Product product);

}
