package com.cursojava.curso.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="mOrders")
public class Order {

	@Id
	@Column(name="cv_order")
	@Getter @Setter
	private int id;
	
	@Column(name="order_date")
	@Getter @Setter
	private String dateOrder;
	
	@Column(name="delivery_date")
	@Getter @Setter
	private String deliveryDate;
	
	@Column(name="total")
	@Getter @Setter
	private Double total;
	
	@Column(name="customer_name")
	@Getter @Setter
	private String customerName;
	
	@Column(name="customer_phone_number")
	@Getter @Setter
	private String customerPhoneNumber;
	
	@Column(name="customer_email")
	@Getter @Setter
	private String customerEmail;
	
	@Column(name="customer_address")
	@Getter @Setter
	private String customerAddress;
	
	@Column(name="customer_address_references")
	@Getter @Setter
	private String customerAddressReferences;
	
	@Column(name="cv_product_status")
	@Getter @Setter
	private int productStatus;
}
