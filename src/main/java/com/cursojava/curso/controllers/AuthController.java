package com.cursojava.curso.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cursojava.curso.dao.UserDao;
import com.cursojava.curso.models.User;

@RestController
public class AuthController {

	@Autowired
	private UserDao userDao;
	
	@PostMapping(value = "login", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String login(@RequestBody User user) {
		if(userDao.verificarCredenciales(user)) {
			return "OK";
		}else {
			return "FAIL";
		}
	}
	
}
