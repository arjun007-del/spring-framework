package com.arjun.learnspringframework.helloworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
		// 1. launch a spring context
		
		// when use the try incase any exception came inside code context.close() automatically called.
		try(var context =
				new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
			// 2. configure the things that we want to spring to manage --
			// HelloWorldConfiguration class  --@Configuration
			// Inside this name method with @Bean
			
			// 3. retrieving beans managed by spring
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person"));
			
			System.out.println(context.getBean("address2")); 
			
			// retrieve beans using based in class
			// to retrieve the bean either name of the bean or type of the bean , retrieve back bean
			
			System.out.println(context.getBean(Address.class));
			
			System.out.println(context.getBean("person2MethodCall"));
			System.out.println(context.getBean("person3Parameters"));
			System.out.println(context.getBean(Person.class));
			
			System.out.println(context.getBean("person5Qualifier"));
			
			// list out the all beans managed by spring Framework
			Arrays.stream(context.getBeanDefinitionNames())
			    .forEach(System.out::println);
		}
		
		
				
	}

}
