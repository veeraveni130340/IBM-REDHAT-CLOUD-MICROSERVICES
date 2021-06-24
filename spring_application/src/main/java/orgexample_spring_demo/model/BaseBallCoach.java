package orgexample_spring_demo.model;

	
public class BaseBallCoach implements Coach {

	@Override
	public String getDailyworkOut() {
	
		return "practice back volley today";
	}
	@Override
	public String getDailyFortune() {
		
		return null;
}
}