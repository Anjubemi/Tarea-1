package com.example.TareaSemana1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.TareaSemana1.model.Item;
import com.example.TareaSemana1.servicio.IItemServicio;

@RestController
@RequestMapping("/item/v1")
public class ItemController {

	@Autowired IItemServicio servicio;
	
	@RequestMapping(path ="/listar", method = RequestMethod.GET)
	public ResponseEntity<List<Item>> listarItems(){
		
		return new ResponseEntity<List<Item>>(servicio.listar(),HttpStatus.OK);
	}
	
	@RequestMapping(path = "/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardar(@RequestBody Item item){
		servicio.guardar(item);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping(path = "/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<Item> listarPorId(@PathVariable Integer id) {
		
		Item i=servicio.listarId(id);
		if(i!=null)
			return new ResponseEntity<Item>(i,HttpStatus.OK);
		
		return new ResponseEntity<Item>(HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(path = "/editar", method = RequestMethod.PATCH)
	public ResponseEntity<Void> editar(@RequestBody Item item){
		
		Item p=servicio.listarId(item.getId());
		
		if(p!=null) {
			servicio.actualizar(item);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(path = "/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> eliminar(@PathVariable Integer id){
		
		Item i=servicio.listarId(id);
		
		if(i!=null) {
			servicio.eliminar(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
}
