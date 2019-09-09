package com.example.sportslife.createTGPlans;

public class ManagerTGPlans {

	private TGPlanStrategy tGPlanStrategy;

	public int calculateRecommendedNumberOfTU() {
		return tGPlanStrategy.calculateNumberRecommenderTU();
	}
	
	public TGUnit recommendTU() {
		return tGPlanStrategy.calculateTypeOfTU().get(0);
	}
	
	
	public TGPlanStrategy gettGPlanStrategy() {
		return tGPlanStrategy;
	}

	public void settGPlanStrategy(TGPlanStrategy tGPlanStrategy) {
		this.tGPlanStrategy = tGPlanStrategy;
	}
	
	
}
