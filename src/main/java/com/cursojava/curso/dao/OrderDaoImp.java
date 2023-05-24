package com.cursojava.curso.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cursojava.curso.models.Order;

@Repository    
@Transactional 
public class OrderDaoImp implements OrderDao {

	@PersistenceContext
	private EntityManager entityManager; //variable para conectar con la base de datos
	
	@Override
	@Transactional
	public List<Order> getOrders() {
		String query = "FROM Order";
		return entityManager.createQuery(query).getResultList();
	}
}
