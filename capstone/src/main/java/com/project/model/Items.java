package com.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Items {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int price;
	private String cuisine;
	
	public Items() {
		super();
	}

	public Items(int id, String name, int price, String cuisine) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.cuisine = cuisine;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCuisine() {
		return cuisine;
	}

	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}

	@Override
	public String toString() {
		return "Items [id=" + id + ", name=" + name + ", price=" + price + ", cuisine=" + cuisine + "]";
	}

	public Items(String name, int price, String cuisine) {
		super();
		this.name = name;
		this.price = price;
		this.cuisine = cuisine;
	}
	
	
}