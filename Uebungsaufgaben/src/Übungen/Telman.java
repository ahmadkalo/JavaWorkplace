package Übungen;
import java.util.Scanner;

public class Telman {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String Geburtstag, Geburtstag2;

		boolean correctInput = false;
		
		while (!correctInput) {
			System.out.println("Schreiben Sie bitte 'Telman' ");
			Geburtstag = scanner.nextLine();
			
			if (Geburtstag.equalsIgnoreCase("Telman")) {
				correctInput = true;
				for(int i = 0; i < 1000 ; i++) {
					System.out.println("Alles Gute zum Geburtstag Telman");
				}
			} else {
				System.out.println("Flasch, schreiben Sie bitte nur 'Telman' sonst nichts");
			}
			
			
			if (Geburtstag.equalsIgnoreCase("Telman")) {
				System.out.println("Schreiben Sie nochmal Telman");
				Geburtstag2 = scanner.nextLine();
				correctInput = true;
				for(int i = 0; ; i++) {
					System.out.println("Der Bruder Telman ist 23 geworden");
					System.out.println("Bester Aserbaidschaner der Welt");
				}
			
					} 
			
			}
		
		scanner.close();
	}
}
