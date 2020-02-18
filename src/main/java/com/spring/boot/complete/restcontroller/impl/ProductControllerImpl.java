package com.spring.boot.complete.restcontroller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.complete.model.Product;
import com.spring.boot.complete.repository.ProductRepository;
import com.spring.boot.complete.restcontroller.api.ProductController;

@RestController
@RequestMapping(value = "/product")
public class ProductControllerImpl implements ProductController {
	
	@Autowired
	ProductRepository repository = null;
	
	public List<Product> getAllProduct() {
		return repository.findAll();
	}
	
	public Product getProduct(Long id) {
		return repository.findById(id).get();
	}
	
	public void saveProduct(Product product) {
		repository.save(product);
	}
	
	public void updateProduct(Long id, Product product) {
		Product productFromDb = repository.findById(id).get();
		productFromDb.setName(product.getName());
		productFromDb.setDescription(product.getDescription());
		productFromDb.setPrice(product.getPrice());
		repository.save(product);
	}
	
	public void deleteProduct(Long id) {
		repository.deleteById(id);
	}

}
