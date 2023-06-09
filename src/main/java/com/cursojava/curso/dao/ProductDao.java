package com.cursojava.curso.dao;

import java.util.List;

import com.cursojava.curso.models.Product;

public interface ProductDao {

	List<Product> getProducts();


	List<Product> getProductByName(String name);


	void deleteProductById(int id);


	void registrar(Product product);
}
