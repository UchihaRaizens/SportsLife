package com.example.sportslife.createTGPlans;

import java.util.List;

public abstract class TGPlanStrategy {

	public abstract int calculateNumberRecommenderTU();
	public abstract List<TGUnit> calculateTypeOfTU();

}
