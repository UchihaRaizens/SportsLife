package com.example.sportslife.createTGPlans;

public class TGPlanRepositoryImpl implements TGPlanRepository{

	private TGUnitRepository unitRepository;
	
	@Override
	public TGPlan findTGPlan() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int saveTGPlan() {		
		unitRepository.saveTGUnit();
		return 0;
	}

	
}
