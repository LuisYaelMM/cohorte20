package com.example.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name="order_has_products")
public class OrdenProductoModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	/*---------empiezan las relaciones--------*/
	@ManyToOne
	private OrdenModel orden;
	@ManyToOne
	private ProductosModel producto;
	public OrdenProductoModel() {
		super();
	}
	public OrdenProductoModel(OrdenModel orden, ProductosModel producto) {
		super();
		this.orden = orden;
		this.producto = producto;
	}
	public OrdenModel getOrden() {
		return orden;
	}
	public void setOrden(OrdenModel orden) {
		this.orden = orden;
	}
	public ProductosModel getProducto() {
		return producto;
	}
	public void setProducto(ProductosModel producto) {
		this.producto = producto;
	}
	
	
	
	
}
