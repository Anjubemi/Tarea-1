package com.example.TareaSemana1.servicio;

import java.util.List;

import com.example.TareaSemana1.model.Item;

public interface IItemServicio {
	
	public void guardar(Item item);
	
	public void actualizar(Item item);
	
	public void eliminar(Integer id);
	
	public List<Item> listar();
	
	public Item listarId(Integer id);
}
