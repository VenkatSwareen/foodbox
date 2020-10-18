package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Items;
import com.project.service.FoodService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class FoodController {

	@Autowired 
    private FoodService service;
	
	@PostMapping("/item")
	public Items addItems(@RequestBody Items items) {
		return service.addItems(items);
	}

	@DeleteMapping("/item/{id}")
	public void deleteItemsById(@PathVariable int id) {
		 service.deleteItemsById(id);
	}

	@PutMapping("/item")
	public Items updateItems(@RequestBody Items items) {
		return service.updateItems(items);
	}

	@GetMapping("/items")
	public List<Items> getAllItems() {
		return service.getAllItems();
	}
	
	public Items getItemsById(@PathVariable int id) {
		return service.getItemsById(id);
	}
}
