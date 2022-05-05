package com.example.TareaSemana1.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TareaSemana1.model.Item;
import com.example.TareaSemana1.repository.IItemRepository;

@Service
public class ItemServicioImpl implements IItemServicio {

	@Autowired public IItemRepository repository;
	
	@Override
	public void guardar(Item item) {
		repository.guardar(item);
	}

	@Override
	public void actualizar(Item item) {
		repository.actualizar(item);
	}

	@Override
	public void eliminar(Integer id) {
		repository.eliminar(id);
	}

	@Override
	public List<Item> listar() {
		return repository.listar();
	}

	@Override
	public Item listarId(Integer id) {
		return repository.listarId(id);
	}

}
