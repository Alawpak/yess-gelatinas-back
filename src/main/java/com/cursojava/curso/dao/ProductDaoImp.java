package com.cursojava.curso.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cursojava.curso.models.Product;

@Repository    //Referencia a conexión con la BD
@Transactional //funcionalidad de poder armar consultas de SQL a base de datos
public class ProductDaoImp implements ProductDao {

	@PersistenceContext
	private EntityManager entityManager; //variable para conectar con la base de datos
	
	@Override
	@Transactional
	public List<Product> getProducts() {
		String query = "FROM Product";
		return entityManager.createQuery(query).getResultList();
	}
	
	@Override
	@Transactional
	public List<Product> getProductByName(String name) {
		String query = "FROM Product WHERE name = :name";
		return entityManager.createQuery(query).setParameter("name", name).getResultList();
	}
	
	@Override
	public void deleteProductById(int id) {
		Product product = entityManager.find(Product.class, id);
		entityManager.remove(product);
	}
	
	@Override
	public void registrar(Product product) {
		entityManager.merge(product);
	}
	
}
