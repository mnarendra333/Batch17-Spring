package com.pragim.service;

import java.util.List;

import com.pragim.model.Product;

public interface ProductService {

	List<Product> getAllProuducts();

	String deleteProduct(String id);

	String saveProduct(Product product);
}
