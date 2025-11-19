package GoldGame;

import java.util.Random;
import java.util.Scanner;

import Schach.Punkt2D;

public class GoldGame {
	
	static Random random = new Random();
	
	public static void main(String[] args) {
	
		Punkt2D snake = new Punkt2D(random.nextInt(39), random.nextInt(9));
		Punkt2D player = new Punkt2D(random.nextInt(39), random.nextInt(9));
		Punkt2D gold = new Punkt2D(random.nextInt(39), random.nextInt(9));
		Punkt2D door = new Punkt2D(random.nextInt(39), random.nextInt(9));
		boolean play = true;
		boolean gotTheGold = false;
		
		playTheGame(snake, player, gold, door, play, gotTheGold);
		
	}


	private static void playTheGame(Punkt2D snake, Punkt2D player, Punkt2D gold, Punkt2D door, boolean play, boolean gotTheGold) {
		
		while(play) {
			
		System.out.println("+----------------------------------------+");
		for (int y = 0; y < 10; y++) {
			System.out.print("|");
			for (int x = 0; x < 40; x++) {
				Punkt2D p = new Punkt2D(x, y);
				if (p.equals(player)) {
					System.out.print("P");
				} else if (p.equals(snake)) {
					System.out.print("S");
				} else if (p.equals(gold)) {
					System.out.print("G");
				} else if (p.equals(door)) {
					System.out.print("D");
				} else {
					System.out.print(".");
				}

			}
			System.out.print("|");
			System.out.println();
			
		}
		System.out.println("+----------------------------------------+");
		if(snake.equals(player)) {
			play = false;
			System.out.println("Game over");
			askToPlayAgain(snake, player, gold, door, play, gotTheGold);
			
			
		}
		
		if(player.equals(gold)) {
			gotTheGold = true;
			gold = new Punkt2D(-1,-1);
			
		}
		if(player.equals(door) && gotTheGold ) {
			play  = false;
			System.out.println("You won the game");
			askToPlayAgain(snake, player, gold, door, play, gotTheGold);
		}
		MovePlayer(player);
		moveSnake(snake, player);
		}
	}


	@SuppressWarnings("resource")
	private static void askToPlayAgain(Punkt2D snake, Punkt2D player, Punkt2D gold, Punkt2D door, boolean play, boolean gotTheGold) {
		System.out.println("Do you want to play again? Yes | No ");
		
		Scanner scannerYesNo = new Scanner(System.in);
		String input2 = scannerYesNo.next();
		if(input2.equalsIgnoreCase("yes")) {
		
			 snake = new Punkt2D(random.nextInt(39), random.nextInt(9));
			 player = new Punkt2D(random.nextInt(39), random.nextInt(9));
			 gold = new Punkt2D(random.nextInt(39), random.nextInt(9));
			 door = new Punkt2D(random.nextInt(39), random.nextInt(9));
			 play = true;
			 gotTheGold = false;
			 playTheGame(snake, player, gold, door, play, gotTheGold);
		} else {
			System.out.println("See you later then");
		}
	}

	@SuppressWarnings("resource")
	private static void MovePlayer(Punkt2D player) {
		Scanner scannerYX = new Scanner(System.in);
		String input = scannerYX.next();

		if (input.equals("w")) {
			if (player.y > 0) {
				player.y--;
			} else {
				return;
			}
		} else if (input.equals("s")) {
			if (player.y < 9) {
				player.y++;
			} else {
				return;
			}

		} else if (input.equals("a")) {
			if (player.x > 0) {
				player.x--;
			} else {
				return;
			}
		} else if (input.equals("d")) {
			if (player.x < 39) {
				player.x++;
			} else {
				return;

			}

		}
	}

	private static void moveSnake(Punkt2D snake, Punkt2D player) {
		if(player.x < snake.x) {
			snake.x--;	
		} else if(player.x > snake.x) {
			snake.x++;	
		} else if(player.y < snake.y) {
			snake.y--;	
		}else if(player.y > snake.y) {
			snake.y++;
		}
		
	}

}
