package com.cursojava.curso.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursojava.curso.dao.OrderDao;
import com.cursojava.curso.models.Order;

@RestController
public class OrderController {

	@Autowired
	private OrderDao orderDao;
	
	@RequestMapping(value = "api/orders")
	public List<Order> getOrders() {
		return orderDao.getOrders();
	}
	
	
}
