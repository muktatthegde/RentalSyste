package com.rentalsystem.rentals;

public class RentByHour extends RentalSystem{
	private int numberOfHours;
	private long totalCost;
	private long cost;
	public RentByHour(int numberOfHours) {
		this.numberOfHours = numberOfHours;
		this.cost = 5;
	}
	@Override
	public String toString() {
		return "RentByHour [cost= $" + cost + "]";
	}
	public int getNumberOfHours() {
		return numberOfHours;
	}
	public long getCost() {
		return cost;
	}
	
	
	
}
