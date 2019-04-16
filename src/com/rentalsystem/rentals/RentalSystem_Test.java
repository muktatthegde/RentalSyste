package com.rentalsystem.rentals;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class RentalSystem_Test {
	public final String RENT_BY_HOUR = "BY_HOUR";
	public final String RENT_BY_DAY = "BY_DAY";
	public final String RENT_BY_WEEK = "BY_WEEK";
	
	
	@Test
	void test() {
		RentByHour rentByHour = new RentByHour(2);
		assertEquals(10, rentByHour.totalCost(rentByHour.getNumberOfHours(), rentByHour.getCost()));
	}
	@Test
	void testRentByDay() {
		RentByDay rentByDay = new RentByDay(2);
		assertEquals(40, rentByDay.totalCost(rentByDay.getNumberOfHours(), rentByDay.getCost()));
	}
	@Test
	void testRentByWeek() {
		RentByWeek rentByWeek = new RentByWeek(1);
		assertEquals(60, rentByWeek.totalCost(rentByWeek.getNumberOfHours(), rentByWeek.getCost()));
	}
	
	@Test
	void testRentByFamily() {
		List<FamilyRental> familyRentals = new ArrayList<>();
		FamilyRental familyRental = new FamilyRental(RENT_BY_HOUR, 4);
		FamilyRental familyRental1 = new FamilyRental(RENT_BY_DAY, 4);
		FamilyRental familyRental2 = new FamilyRental(RENT_BY_WEEK, 2);
		familyRentals.add(familyRental);
		familyRentals.add(familyRental1);
		familyRentals.add(familyRental2);
		RentByFamily family = new RentByFamily(familyRentals);
		assertEquals(154, family.totalCost());
	}
}
