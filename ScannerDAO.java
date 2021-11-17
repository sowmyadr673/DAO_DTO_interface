package com.xworkz.Scanner;

import com.xworkz.powerbank.DTO.PowerBankDTO;

public interface ScannerDAO {

	public void saveDTO(ScannerDTO dto);

	public void displayInfo();

	public void displayByBrandname(String Brand);

	public void UpdateByBrand(String Brand, int newPrice);

	public void deleteByBrand(String Brand);

}
