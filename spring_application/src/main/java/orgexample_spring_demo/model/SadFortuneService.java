package orgexample_spring_demo.model;

public class SadFortuneService implements FortuneService{
	
	public String getDailyFortune()  {
	
		return "today is your bad day";
}
}