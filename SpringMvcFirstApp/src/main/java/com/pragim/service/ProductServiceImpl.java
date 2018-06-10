package com.pragim.service;

import java.util.List;

import com.pragim.dao.ProductDao;
import com.pragim.model.Product;

public class ProductServiceImpl implements ProductService {
	
	
	private ProductDao dao;

	public void setDao(ProductDao dao) {
		this.dao = dao;
	}

	@Override
	public List<Product> getAllProuducts() {
		// TODO Auto-generated method stub
		return dao.getAllProuducts();
	}

	@Override
	public String deleteProduct(String id) {
		// TODO Auto-generated method stub
		
		int proId = Integer.parseInt(id);
		dao.deleteProduct(proId);
		return "success";
	}

	@Override
	public String saveProduct(Product product) {
		// TODO Auto-generated method stub
		dao.saveProduct(product);
		return "success";
	}

}
