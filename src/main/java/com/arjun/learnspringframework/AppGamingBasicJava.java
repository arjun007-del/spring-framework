package com.arjun.learnspringframework;

import com.arjun.learnspringframework.game.GameRunner;
import com.arjun.learnspringframework.game.MarioGame;
import com.arjun.learnspringframework.game.PacManGame;
import com.arjun.learnspringframework.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		
//		var game = new MarioGame();
//		var game = new SuperContraGame();
		
		var game = new PacManGame();  // 1. object creation
		var gameRunner = new GameRunner(game); 
		// 2. object creation + wiring of dependencies
		// GameConsole(Game) is a dependency of the GameRunner Class
		// line 16 new GameRunner(game) is injecting the GameRunner class
		gameRunner.run();

	}

}
