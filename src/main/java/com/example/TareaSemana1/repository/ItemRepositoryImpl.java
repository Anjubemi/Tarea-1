package com.example.TareaSemana1.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.TareaSemana1.model.Item;

@Repository
public class ItemRepositoryImpl implements IItemRepository {

	public List<Item> listaItems=new ArrayList<Item>();
	
	@Override
	public void guardar(Item item) {
		listaItems.add(item);
	}

	@Override
	public void actualizar(Item item) {
		listaItems.remove(listarId(item.getId()));
		listaItems.add(item);
	}

	@Override
	public void eliminar(Integer id) {
		listaItems.remove(listarId(id));
	}

	@Override
	public List<Item> listar() {
		return listaItems;
	}

	@Override
	public Item listarId(Integer id) {
		
		return listaItems.stream().filter(i ->i.getId()==id).findFirst().orElse(null);
	}
}
