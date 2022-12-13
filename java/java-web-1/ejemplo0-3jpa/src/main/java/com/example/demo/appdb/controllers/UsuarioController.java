package com.example.demo.appdb.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.appdb.models.UsuarioModel;
import com.example.demo.appdb.services.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	@Autowired
	UsuarioService usuarioServicio;
	
	@GetMapping()
	public ArrayList<UsuarioModel> obtenerUsuarios() {
		return usuarioServicio.obtenerUsuario();
	}
	
	@PostMapping()
	public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario) {
		return this.usuarioServicio.guardarUsuario(usuario);
	}
	
}
