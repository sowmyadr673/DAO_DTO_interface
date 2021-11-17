package com.xworkz.Scanner;

public class Tester {

	public static void main(String[] args) {

		ScannerIMPL scanner = new ScannerIMPL("Epson", "epson567", "white", 6500, 65);

		ScannerDTO Epson = new ScannerDTO("Epson", "epson567", "white", 6500, 65);
		scanner.saveDTO(Epson);
		ScannerDTO HP = new ScannerDTO("HP", "HP45676", "black", 7000, 120);
		scanner.saveDTO(HP);
		ScannerDTO Canon = new ScannerDTO("Canon", "canon7652", "grey", 5000, 130);
		scanner.saveDTO(Canon);

		scanner.displayByBrandname("Canon");

		System.out.println("before update");
		scanner.displayByBrandname("Epson");
		scanner.UpdateByBrand("Epson", 8000);
		System.out.println("after update");
		scanner.displayByBrandname("Epson");

		scanner.deleteByBrand("HP");
		scanner.displayInfo();
	}
}
