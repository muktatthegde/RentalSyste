package com.rentalsystem.rentals;

public abstract class RentalSystem {
	
	
	public long totalCost(int numberOfHours, long cost) {
		return numberOfHours*cost;
	}
	
	
}
