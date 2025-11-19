package Übungen;
import java.util.Scanner;


public class FächerArray {
	
	public static void main(String[] args) {
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Geben Sie bitte die Anzahl der Fächer ein: ");
		
		int anzahlFaecher = scanner.nextInt();
		
		String[] faecher = new String[anzahlFaecher];
		System.out.println("Geben Sie jetzt bitte die " + anzahlFaecher + " Fächer ein: ");
		
		for(int i = 0; i < anzahlFaecher; i++) {
			
		faecher[i] = scanner.next();
		
		
		} scanner.close();
		
		System.out.println("Die Fächer sind: ");
		
		for(String fach : faecher) {
			System.out.println(fach);
			
			}
		
		}

	}


