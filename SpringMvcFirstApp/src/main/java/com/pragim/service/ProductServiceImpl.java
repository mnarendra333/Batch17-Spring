package com.pragim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pragim.dao.ProductDao;
import com.pragim.model.Product;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao productDao;

	public void setDao(ProductDao dao) {
		this.productDao = dao;
	}

	@Override
	public List<Product> getAllProuducts() {
		// TODO Auto-generated method stub
		return productDao.getAllProuducts();
	}

	@Override
	public String deleteProduct(String id) {
		// TODO Auto-generated method stub
		
		int proId = Integer.parseInt(id);
		productDao.deleteProduct(proId);
		return "success";
	}

	@Override
	public String saveProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.saveProduct(product);
		return "success";
	}

}
