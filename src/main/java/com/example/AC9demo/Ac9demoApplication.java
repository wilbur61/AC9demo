package com.example.AC9demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import myServices.Coach;

/* @SpringBootApplication
public class Ac9demoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ac9demoApplication.class, args);
	}

}
*/
//=============

@SpringBootApplication(scanBasePackages = {"myServices"})
// Note: in above linen, "myServices" is a package name
  public class Ac9demoApplication {
     public static void main(String[] args) {
     ConfigurableApplicationContext context =  SpringApplication.run(Ac9demoApplication.class, args);

     // get the bean from spring container
     Coach theCoach = context.getBean(Coach.class);

     // call a method on the bean
     System.out.println(theCoach.getDailyWorkout());

     // call method to get daily fortune
     System.out.println(theCoach.getDailyFortune());

     // close the context
     context.close();
  }
}

