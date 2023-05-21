package com.cursojava.curso.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cursojava.curso.models.User;

@Repository    //Referencia a conexión con la BD
@Transactional //funcionalidad de poder armar consultas de SQL a base de datos
public class UserDaoImp implements UserDao{
	
	@PersistenceContext
	private EntityManager entityManager; //variable para conectar con la base de datos

	
	@Override
	@Transactional
	public boolean verificarCredenciales(User user) {
		String query = "FROM User WHERE email = :email AND password = :password";
		List<User> lista = entityManager.createQuery(query).setParameter("email", user.getEmail()).setParameter("password", user.getPassword()).getResultList();
		return !lista.isEmpty();
	}
}
