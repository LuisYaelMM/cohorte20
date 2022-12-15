package com.example.demo.appdb.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table (name="orden")
class OrdenModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private Long id;
	private String nombreOrden;
	/**********************************/
	@ManyToOne
	private UsuarioModel usuario;
	
	@OneToOne(mappedBy = "orden")
	private DetalleOrdenModel detalle;
	
	public UsuarioModel getUsuario() {
		return usuario;
	}
	public void setUsuario(UsuarioModel usuario) {
		this.usuario = usuario;
	}
	public OrdenModel() {
		super();
	}
	
	
	public OrdenModel(Long id, String nombreOrden, UsuarioModel usuario, DetalleOrdenModel detalle) {
		super();
		this.id = id;
		this.nombreOrden = nombreOrden;
		this.usuario = usuario;
		this.detalle = detalle;
	}
	public DetalleOrdenModel getDetalle() {
		return detalle;
	}
	public void setDetalle(DetalleOrdenModel detalle) {
		this.detalle = detalle;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombreOrden() {
		return nombreOrden;
	}
	public void setNombreOrden(String nombreOrden) {
		this.nombreOrden = nombreOrden;
	}
	
	
	
}
