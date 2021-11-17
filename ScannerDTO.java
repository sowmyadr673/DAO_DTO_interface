package com.xworkz.Scanner;

public class ScannerDTO {

	private String Brand;
	private String model;
	private String color;
	private int price;
	private int weight;

	public ScannerDTO(String brand, String model, String color, int price, int weight) {
		super();
		Brand = brand;
		this.model = model;
		this.color = color;
		this.price = price;
		this.weight = weight;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}
