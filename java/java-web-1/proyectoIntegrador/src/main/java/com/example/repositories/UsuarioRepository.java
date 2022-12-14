package com.example.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.example.models.UsuarioModel;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer>{
	public ArrayList<UsuarioModel> findByPassword(String password);
	public ArrayList<UsuarioModel> findByCorreo(String correo);
}
