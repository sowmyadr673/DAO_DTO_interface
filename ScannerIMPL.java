package com.xworkz.Scanner;

public class ScannerIMPL extends ScannerDTO implements ScannerDAO {

	public ScannerIMPL(String brand, String model, String color, int price, int weight) {
		super(brand, model, color, price, weight);
		// TODO Auto-generated constructor stub
	}

	ScannerDTO scannerdto[] = new ScannerDTO[3];
	int index = 0;

	public void saveDTO(ScannerDTO dto) {
		System.out.println("inside save method");
		scannerdto[index] = dto;
		index++;
	}

	public void displayInfo() {

		for (int i = 0; i < scannerdto.length; i++) {
			if (scannerdto[i] != null) {
				System.out.println(scannerdto[i].getBrand());
				System.out.println(scannerdto[i].getColor());
				System.out.println(scannerdto[i].getModel());
				System.out.println(scannerdto[i].getPrice());
				System.out.println(scannerdto[i].getWeight());
				System.out.println("--------------------------");
			}
		}
	}

	@Override
	public void displayByBrandname(String Brand) {
		System.out.println("inside display method");
		for (int i = 0; i < scannerdto.length; i++) {
			if (scannerdto[i].getBrand().equals(Brand)) {
				System.out.println(scannerdto[i].getBrand());
				System.out.println(scannerdto[i].getColor());
				System.out.println(scannerdto[i].getPrice());
				System.out.println(scannerdto[i].getModel());
				System.out.println(scannerdto[i].getWeight());
				System.out.println("--------------------");
			}

		}
	}

	@Override
	public void UpdateByBrand(String Brand, int newPrice) {

		System.out.println("inside update method");
		for (int i = 0; i < scannerdto.length; i++) {
			if (scannerdto[i].getBrand().equals(Brand)) {
				scannerdto[i].setPrice(newPrice);

			}
		}
	}

	@Override
	public void deleteByBrand(String Brand) {
		System.out.println("delete method");
		for (int i = 0; i < scannerdto.length; i++) {
			if (scannerdto[i].getBrand().equals(Brand)) {
				scannerdto[i] = null;

			}

		}

	}
}