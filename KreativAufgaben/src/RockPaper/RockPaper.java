package RockPaper;

import java.util.Random;

public class RockPaper {
	
	public static void main(String[] args) {
		
		String[] rps = {"rock", "paper", "scissors"};
		@SuppressWarnings("unused")
		String computerMove = rps[new Random().nextInt(rps.length)];
	}

}
