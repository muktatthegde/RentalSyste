package com.rentalsystem.rentals;

import java.util.List;

public class RentByFamily extends RentalSystem {
	public final String RENT_BY_HOUR = "BY_HOUR";
	public final String RENT_BY_DAY = "BY_DAY";
	public final String RENT_BY_WEEK = "BY_WEEK";
	private List<FamilyRental> familyRental;
	RentByFamily(List<FamilyRental> familyRental){
		this.familyRental = familyRental;
	}
	
	public long totalCost() {
			long totalCost = 0;
		for (int i = 0; i < familyRental.size(); i++) {
			totalCost += getIndividualCost(familyRental.get(i).getRentalType(), familyRental.get(i).getRentalTime());
		}
		
		totalCost = totalCost- (totalCost*30/100);
		return totalCost;
	}
	
	private long getIndividualCost(String rentalType, int rentalTime) {
		long cost= 0;
		if(rentalType.equals(RENT_BY_HOUR)) {
			RentByHour rentByHour = new RentByHour(rentalTime);
			cost = rentByHour.totalCost(rentByHour.getNumberOfHours(), rentByHour.getCost());
			return cost;
		}else if(rentalType.equals(RENT_BY_DAY)) {
			RentByDay rentByDay = new RentByDay(rentalTime);
			cost = rentByDay.totalCost(rentByDay.getNumberOfHours(), rentByDay.getCost());
			return cost;
		}else {
			RentByWeek rentByWeek = new RentByWeek(rentalTime);
			cost = rentByWeek.totalCost(rentByWeek.getNumberOfHours(), rentByWeek.getCost());
			return cost;
		}
	}
}
