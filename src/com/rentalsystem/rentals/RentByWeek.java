package com.rentalsystem.rentals;

public class RentByWeek extends RentalSystem{
	private int numberOfHours;
	private long totalCost;
	private long cost;
	public RentByWeek(int numberOfHours) {
		this.numberOfHours = numberOfHours;
		this.cost = 60;
	}
	@Override
	public String toString() {
		return "RentByWeek [cost= $" + cost + "]";
	}
	public int getNumberOfHours() {
		return numberOfHours;
	}
	public long getCost() {
		return cost;
	}
}
