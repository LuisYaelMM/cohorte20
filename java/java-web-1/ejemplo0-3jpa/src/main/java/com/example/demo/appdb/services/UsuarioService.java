package com.example.demo.appdb.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.appdb.models.UsuarioModel;
import com.example.demo.appdb.repositories.UsuarioRepository;


@Service
public class UsuarioService {
	@Autowired
	UsuarioRepository usuarioRepositorio;
	public ArrayList<UsuarioModel> obtenerUsuario() {
		return (ArrayList<UsuarioModel>) usuarioRepositorio.findAll();
	}
	
	public UsuarioModel guardarUsuario(UsuarioModel usuario){
		return usuarioRepositorio.save(usuario);
	}
}
