package com.demo.demoProject;

public class BaseballCoach implements Coach{
	
	private FortuneService fortuneService;
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	public BaseballCoach() {
		
	}
	
	@Override
	public String getDailyWorkout() {
	return "spend 30 mins";
}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
