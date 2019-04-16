package com.rentalsystem.rentals;

public class FamilyRental {
	private String rentalType;
	private int rentalTime;
	
	public FamilyRental(String rentalType, int rentalTime) {
		
		this.rentalType = rentalType;
		this.rentalTime = rentalTime;
	}

	public String getRentalType() {
		return rentalType;
	}

	public int getRentalTime() {
		return rentalTime;
	}
	
	

}
