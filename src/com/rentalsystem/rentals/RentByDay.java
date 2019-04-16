package com.rentalsystem.rentals;

public class RentByDay extends RentalSystem {
	
	private int numberOfHours;
	private long totalCost;
	private long cost;
	public RentByDay(int numberOfHours) {
		this.numberOfHours = numberOfHours;
		this.cost = 20;
	}
	@Override
	public String toString() {
		return "RentByDay [cost= $" + cost + "]";
	}
	public int getNumberOfHours() {
		return numberOfHours;
	}
	public long getCost() {
		return cost;
	}

}
