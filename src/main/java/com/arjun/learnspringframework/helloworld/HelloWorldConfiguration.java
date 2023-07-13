package com.arjun.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// Introduced in java16
//Eliminating the verbosity creating java beans
//public access modifiers and constructors,equals , hashcode and toString methods are automatically created of Person 
record Person (String name, int age, Address address) {};


record Address(String firstLane, String city) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "arjun";
	}
	
	@Bean
	public int age() {
		return 25;
	}
	
	@Bean
	public Person person() {
		 return new Person("Sailu", 24, new Address("9th phase", "Kukatpally"));
	}
	// two ways to 1. method call means call method directly
	// we can re-use the existing bean which spring managing
	@Bean
	public Person person2MethodCall() {
		 return new Person(name(), age(),address());
	}
	// 2. parameters
	@Bean
	public Person person3Parameters(String name, int age, Address address3) {
		 return new Person(name, age,address3);
	}
	
	@Bean
	@Primary
	public Person person4Parameters(String name, int age,Address address3) {
		 return new Person(name, age,address3);
	}
	
	@Bean
	public Person person5Qualifier(String name, int age,@Qualifier("address3qualifier") Address address3) {
		 return new Person(name, age,address3);
	}
	
	// default bean name is method name, you want change the bean name or custom bean 
	@Bean(name ="address2")
	@Primary
	public Address address() {
		return new Address("kphb", "Hyderabd");
	}
	
	@Bean(name ="address3")
	@Qualifier("address3qualifier")
	public Address address3() {
		return new Address("9th phase", "kukatpally");
	}

}
