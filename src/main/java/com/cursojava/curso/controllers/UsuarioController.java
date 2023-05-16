package com.cursojava.curso.controllers;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursojava.curso.models.Usuario;

//los controllers están pendiente a la url
//url/usuario => se ejecutaran las acciones de este controlador

@RestController
public class UsuarioController {

	@RequestMapping(value = "usuario/{id}")
	public Usuario getUsuario(@PathVariable String id) {
		Usuario usuario = new Usuario();
		usuario.setId(id);
		usuario.setNombre("Alan");
		usuario.setApellido("Perez");
		usuario.setTelefono("916152341");
		usuario.setEmail("Alan281@hotmail.es");
		usuario.setPassword("HOLA");
		
		return usuario;
	}
	
	@RequestMapping(value = "usuario")
	public Usuario updateUsuario() {
		Usuario usuario = new Usuario();
		usuario.setNombre("Alan");
		usuario.setApellido("Perez");
		usuario.setTelefono("916152341");
		usuario.setEmail("Alan281@hotmail.es");
		usuario.setPassword("HOLA");
		
		return usuario;
	}
}
