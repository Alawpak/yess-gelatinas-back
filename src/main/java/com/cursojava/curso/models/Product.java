package com.cursojava.curso.models;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="mProducts")
public class Product {

	@Id
	@Column(name="cv_product")
	@Getter @Setter
	private int id;
	
	@Column(name="product_name")
	@Getter @Setter
	private String name;
	
	@Column(name = "product_small_description")
	@Getter @Setter
	private String smallDescription;
	
	@Column(name = "product_description")
	@Getter @Setter
	private String description;
	
	@Column(name = "cv_dessert_category")
	@Getter @Setter
	private String category;
	
	@Column(name = "is_ready_to_delivery")
	@Getter @Setter
	private Boolean isReadyToDelivery;
	
	@Column(name = "length_cm")
	@Getter @Setter
	private Float length;
	 
	@Column(name = "width_cm")
	@Getter @Setter
	private Float width;
	
	@Column(name = "height_cm")
	@Getter @Setter
	private Float height;
	
	@Column(name = "price")
	@Getter @Setter
	private double price;
}
