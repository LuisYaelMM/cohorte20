package com.example.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="usuarios")
public class UsuarioModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private Integer id;
	private String correo;
	private String password;
	private String nombre_completo;
	
	
	
	
	
	
	public UsuarioModel() {
	}
	
	public UsuarioModel(Integer id, String correo, String password, String nombre_completo) {
		this.id = id;
		this.correo = correo;
		this.password = password;
		this.nombre_completo = nombre_completo;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNombre_completo() {
		return nombre_completo;
	}
	public void setNombre_completo(String nombre_completo) {
		this.nombre_completo = nombre_completo;
	}
	
	
	
	
	
	
}
