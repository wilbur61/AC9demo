package myServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/* @Component
public class TennisCoach implements Coach {

	private FortuneServices fortuneService;
	public TennisCoach() { 
    // this is default constructor
}
 
  @Autowired
  public TennisCoach(FortuneServices theFortuneService) {
     fortuneService = theFortuneService;
  }
  @Override
  public String getDailyWorkout() {
     return "Practice your backhand volley";
  }
  @Override
  public String getDailyFortune() {
     return fortuneService.getFortune();
  }
  */

//************************************
// demonstrate for Field base injection 
//************************************
@Component
public class TennisCoach implements Coach {
	
	public TennisCoach() { 
    // this is default constructor
	}	
	
  @Autowired
  
  // @Qualifier together with the name of the specific 
  // implementation we want to use in this example 
  // randomFortuneService. This helps Spring identify 
  // the right bean to autowire.

  @Qualifier("randomFortuneService")

  private FortuneServices fortuneService;


  public TennisCoach(FortuneServices theFortuneService) {
     fortuneService = theFortuneService;
  }

  @Override
  public String getDailyWorkout() {
     return "Practice your backhand volley";
  }

  @Override
  public String getDailyFortune() {
     return fortuneService.getFortune();
  }
}