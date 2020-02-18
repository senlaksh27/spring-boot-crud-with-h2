package com.spring.boot.complete.restcontroller.api;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.boot.complete.model.Product;

public interface ProductController {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Product> getAllProduct();
	
	@RequestMapping(method = RequestMethod.GET, value="/{id}")
	public Product getProduct(@PathVariable Long id);
	
	@RequestMapping(method = RequestMethod.POST)
	public void saveProduct(@RequestBody Product product);
	
	@RequestMapping(method = RequestMethod.PUT, value="/{id}")
	public void updateProduct(@PathVariable Long id, @RequestBody Product product);
	
	@RequestMapping(method = RequestMethod.DELETE, value="/{id11}")
	public void deleteProduct(@PathVariable Long id);

}
