package orgexample_spring_demo.model;

public class HappyFortuneService implements FortuneService {
	
	@Override
	public String getDailyFortune() {
		
		return "today is your lucky day";

}
}