package com.sunil.collection.list.dto;

import java.io.Serializable;

public class ProductDTO implements Serializable,Comparable<ProductDTO>{
	
	private String name;
	private String brand;
	private double price;
	private int  quantity;
	
	public ProductDTO() {
		System.out.println("created productdto constructor");
	}

	public ProductDTO(String name, String brand, double price, int quantity) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.quantity = quantity;
	}
	
	@Override
	public int compareTo(ProductDTO arg) {
		System.out.println("compared" + arg);
		double refarg = arg.getPrice();
		if(this.price==refarg) return 0;
		if(this.price>refarg) return 1;
		if(this.price<refarg) return -1;
		return 0;
	}	

	@Override
	public String toString() {
		return "ProductDTO [name=" + name + ", brand=" + brand + ", price=" + price + ", quantity=" + quantity + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}

