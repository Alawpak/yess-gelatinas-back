package com.cursojava.curso.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="c_dessert_category")
public class Category {
	@Id
	@Column(name="cv_dessert_category")
	@Getter @Setter
	private int id;
	

	@Column(name="ds_dessert_category")
	@Getter @Setter
	private int description;
}
