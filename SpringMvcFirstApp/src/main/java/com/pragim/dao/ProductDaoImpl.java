package com.pragim.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pragim.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	private SessionFactory factory;
	
	@Override
	public List<Product> getAllProuducts() {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		List<Product> list = session.createQuery("from Product p").list();
		return list;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	@Override
	
	public String deleteProduct(int proId) {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		Product obj = (Product)session.get(Product.class, proId);
		if(obj!=null)
			session.delete(obj);
		session.beginTransaction().commit();
		
		return "success";
	}

	@Override
	public String saveProduct(Product product) {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		session.save(product);
		session.beginTransaction().commit();
		return "success";
	}

}
