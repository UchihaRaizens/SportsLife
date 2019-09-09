package com.example.sportslife.managerMeals;

public abstract class DietManager {

	public void getRecommendedMealUnit() {
		calculateBMI();
		recommendMealUnits();
	}
	
	private void calculateBMI() {
		
		
	}

	public abstract int recommendMealUnits();
	
	
}
