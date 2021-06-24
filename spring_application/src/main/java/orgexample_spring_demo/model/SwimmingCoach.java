package orgexample_spring_demo.model;

public class SwimmingCoach implements Coach {

	private FortuneService fortuneService;

	// constructor injection

	@Override
	public String getDailyworkOut() {
		
		return "practice back swimming today";
	}

	public SwimmingCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getDailyFortune();
	}

}