package orgexample_spring_demo.model;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	/*
	 * public FortuneService getFortuneService() { return fortuneService; }
	 */

	// setter injection
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyworkOut() {

		return "practice batting today";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getDailyFortune();
	}

}