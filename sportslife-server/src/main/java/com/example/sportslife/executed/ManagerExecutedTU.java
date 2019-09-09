package com.example.sportslife.executed;

public class ManagerExecutedTU {

	private StateOfActivity stateOfActivity;
	
	public void setStateOfActivity(StateOfActivity state) {
		this.stateOfActivity = state;
	}
	
	public void executeActivity() {
		stateOfActivity.executeActivity(this);
	}
}
