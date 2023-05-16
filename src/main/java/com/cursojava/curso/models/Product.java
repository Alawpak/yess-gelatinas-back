package com.cursojava.curso.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "products")
public class Product {

	@Id
	@Column(name = "cvproduct")
	@Getter @Setter
	private int id;
	
	@Column(name = "productname")
	@Getter @Setter
	private String name;
	
	@Column(name = "productdescription")
	@Getter @Setter
	private String smallDescription;
	
	@Column(name = "productsmalldescription")
	@Getter @Setter
	private String description;
	
	@Column(name = "cvdessertcategory")
	@Getter @Setter
	private String category;
	
	@Column(name = "isreadytodelivery")
	@Getter @Setter
	private Boolean isReadyToDelivery;
	
	@Column(name = "lengthcm")
	@Getter @Setter
	private Float length;
	 
	@Column(name = "widthcm")
	@Getter @Setter
	private Float width;
	
	@Column(name = "heightcm")
	@Getter @Setter
	private Float height;
	
	@Column(name = "price")
	@Getter @Setter
	private double price;
}
