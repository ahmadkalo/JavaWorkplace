package Übungen;
import java.util.Scanner;

public class PrüfChar {
	

	public static void main(String[] args) {
		
		String randomChar;
		
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Geben Sie bitte einen Buchstaben ein: ");
		randomChar = scanner.next();
		
		if(randomChar.equals("a") || randomChar.equals("e") || randomChar.equals("e") || randomChar.equals("i")  || randomChar.equals("o")  || randomChar.equals("u")) {
		System.out.println("Der eingegebene Buchstabe " + randomChar + " ist ein Vokal");
	} else
		System.out.println("Der eingegebene Buchstabe " + randomChar + " ist kein Vokal");
		scanner.close();
	}

}
