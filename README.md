# AC9demo
AC9demo


# Guided LAB - 309.6.1- SP11 - Spring Dependency Injection with  Annotation and Autowiring

Lab Overview 
In this lab, we will first take a look at how to enable autowiring, as well as the various ways to autowire beans. Afterward, 
we will talk about resolving bean conflicts using the @Qualifier annotation and potential exception scenarios.
Lab Objectives
By the end of this lab, learners will be able to 
Utilize the Spring Dependency Injection with Annotation and Autowiring.
Describe the @Qualifier Annotation.

Review Concept: 
In the spring boot application, all loaded beans are eligible for auto wiring to another bean. The @Component annotation is 
used to load a Java class as a bean. All classes with an annotation, such as @Component, @bean, etc. are auto-wired in the 
spring boot application.
In Spring, you can use the @Autowired annotation to auto-wire beans on the setter method, constructor, or field. Moreover, it can “autowire” the property in a particular bean. In Spring Boot we do not need to enable the @Autowire annotation because @SpringBootApplication will take care of this.
Scenario:
We will use the scenario of Coach, where our Coach provides daily workouts. Now, we will also provide daily fortunes and will make use of the FortuneService and this is the dependency.
