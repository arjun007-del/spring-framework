package com.arjun.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.arjun.learnspringframework.game.GameRunner;
import com.arjun.learnspringframework.game.GamingConsole;

public class App3GamingSpringBeans {

	public static void main(String[] args) {
		
		try(var context =
				new AnnotationConfigApplicationContext(GamingConfiguration.class)){
			
			context.getBean(GamingConsole.class).up();
			
			context.getBean(GameRunner.class).run();
			
		}
		
		
		

	}

}
