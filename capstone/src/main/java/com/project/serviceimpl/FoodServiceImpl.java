package com.project.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.repository.FoodRepository;
import com.project.model.Items;
import com.project.service.FoodService;
import org.springframework.stereotype.Service;

@Service
public class FoodServiceImpl implements FoodService{

	@Autowired
	private FoodRepository dao;

	@Override
	public Items addItems(Items items) {
		return dao.save(items);
	}

	@Override
	public void deleteItemsById(int id)  {
		dao.deleteById(id);
	}

	@Override
	public Items updateItems(Items items) {
		return dao.save(items);
	}

	@Override
	public List<Items> getAllItems() {
		return dao.findAll();
	}

	@Override
	public Items getItemsById(int id) {
		return dao.findById(id).get();
	}

}
