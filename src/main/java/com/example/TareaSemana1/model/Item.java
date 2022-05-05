package com.example.TareaSemana1.model;

import java.io.Serializable;

public class Item implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String item;
	private Integer cantidad;
	private Integer total;
	
	public Item() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}
}
