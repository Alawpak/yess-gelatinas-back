package com.cursojava.curso.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cursojava.curso.dao.ProductDao;
import com.cursojava.curso.models.Product;
import com.cursojava.curso.models.User;
import com.cursojava.curso.models.Usuario;

@RestController
public class ProductController {
	
	@Autowired //Automaticamente hace que la clase productDaoImplement y al guarda dentro de esta variable, no se crean tantos = new Product();
	private ProductDao productDao;
	
	@RequestMapping(value = "api/products")
	public List<Product> getProducts() {
		return productDao.getProducts();
	}
	
	@RequestMapping(value = "api/product")
	public List<Product> getProductByName(@RequestParam("name") String name) {
		return productDao.getProductByName(name);
	}

	@PostMapping(value = "api/product", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void registrar(@RequestBody Product product) {
		productDao.registrar(product);
	}
	

	@DeleteMapping(value = "api/product")
	public void deleteProductById(@RequestParam("id") int id) {
		productDao.deleteProductById(id);
	}
}
