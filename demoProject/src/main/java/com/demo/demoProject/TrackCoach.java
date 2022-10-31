package com.demo.demoProject;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	public TrackCoach() {
	}
	

	@Override
	public String getDailyWorkout() {
		return "run hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "====>"+fortuneService.getFortune();
	}

}
