package com.pragim.controller;

import java.util.List;

import javax.servlet.http.HttpServlet;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pragim.model.Product;
import com.pragim.service.ProductService;

@Controller
public class ProductController {
	
	private static final Logger logger = Logger.getLogger(ProductController.class);
	@Autowired
	private ProductService productService;
	
	
	public void setService(ProductService service) {
		this.productService = service;
	}


	@RequestMapping("/getproducts")
	public String getAllProuducts(Model model){
		
		logger.info("inside -> getAllProuducts");
		
		List<Product> listOfProducts = productService.getAllProuducts();
		model.addAttribute("prolist", listOfProducts);
		return "products";
	}
	
	
	@RequestMapping("/editproduct")
	public String editProduct(Model model,@RequestParam(name="id") String id){
		
		List<Product> listOfProducts = productService.getAllProuducts();
		model.addAttribute("prolist", listOfProducts);
		return "products";
	}
	
	@RequestMapping("/deleteproduct")
	public String deleteProduct(Model model,@RequestParam(name="id") String id){
		
		productService.deleteProduct(id);
		return "redirect:getproducts";
	}
	
	
	@RequestMapping("/getAddForm")
	public String displayAddForm(Model model){
		
		Product obj = new Product();
		model.addAttribute("product", obj);
		//service.deleteProduct(id);
		return "addProductForm";
	}
	
	@RequestMapping("/saveProduct")
	public String saveProduct(@ModelAttribute Product product){
		
		Product obj = new Product();
		productService.saveProduct(product);
		//model.addAttribute("product", obj);
		//service.deleteProduct(id);
		return "redirect:getproducts";
	}
	
	
	

}
