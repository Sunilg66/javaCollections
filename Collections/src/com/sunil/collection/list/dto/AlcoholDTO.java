package com.sunil.collection.list.dto;

import java.io.Serializable;

import com.sunil.collection.list.dto.constants.AlcoholType;

public class AlcoholDTO implements Serializable, Comparable<AlcoholDTO>{
	
	private String brand;
	private double price;
	private boolean scotch;
	private int quantity;
	private AlcoholType type;

	public AlcoholDTO() {
		System.out.println("created alcohol constructor");
	}

	public AlcoholDTO(String brand, double price, boolean scotch, int quantity, AlcoholType type) {
		super();
		this.brand = brand;
		this.price = price;
		this.scotch = scotch;
		this.quantity = quantity;
		this.type = type;
	}

	@Override
	public int compareTo(AlcoholDTO dt) {
		System.out.println("compared" + dt);
		String brand = dt.getBrand();
		if (this.brand.compareTo(brand) == 0)
			return 0;
		if (this.brand.compareTo(brand) > 0)
			return 1;
		else if (this.brand.compareTo(brand) < 0)
			return -1;

		return 0;

	}

	@Override
	public String toString() {
		return "AlcoholDTO [brand=" + brand + ", price=" + price + ", scotch=" + scotch + ", quantity=" + quantity
				+ ", type=" + type + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isScotch() {
		return scotch;
	}

	public void setScotch(boolean scotch) {
		this.scotch = scotch;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public AlcoholType getType() {
		return type;
	}

	public void setType(AlcoholType type) {
		this.type = type;
	}

}

