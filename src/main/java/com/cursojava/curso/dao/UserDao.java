package com.cursojava.curso.dao;

import com.cursojava.curso.models.User;


public interface UserDao {

	boolean verificarCredenciales(User user);

}
