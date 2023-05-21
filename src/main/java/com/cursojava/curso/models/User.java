package com.cursojava.curso.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="mUsers")
public class User {
	
	@Id
	@Column(name="cv_user")
	@Getter @Setter
	private int id;
	
	@Column(name="user_email")
	@Getter @Setter
	private String email;
	
	@Column(name = "user_name")
	@Getter @Setter
	private String name;
	
	@Column(name = "user_pass")
	@Getter @Setter
	private String password;
	
}
