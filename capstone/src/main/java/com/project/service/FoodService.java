package com.project.service;

import java.util.List;

import com.project.model.Items;


public interface FoodService {

	public Items addItems(Items items);
	public void deleteItemsById(int id);
	public Items updateItems(Items items);
	public List<Items> getAllItems();
    public Items getItemsById(int id);
}
