package Übungen;
import java.util.Scanner;

public class OhneVokale {
	

		public static void main(String[] args) {


			
			String eingegebenesWort;
			String ausgabe = "";
			
			Scanner VokalScanner = new Scanner(System.in);
			
		
			System.out.println("Geben Sie ein beliebiges Wort ein: ");
			eingegebenesWort = VokalScanner.next();
			
			VokalScanner.close();
			
			for(int i = 0; i < eingegebenesWort.length(); i++) {
				
				if(eingegebenesWort.charAt(i) == 'a' || eingegebenesWort.charAt(i) == 'e' || eingegebenesWort.charAt(i) == 'i' || eingegebenesWort.charAt(i) == 'u' || eingegebenesWort.charAt(i) == 'o'  ) {
					// mach nichts
					
				} else {
					ausgabe = ausgabe + eingegebenesWort.charAt(i); 
				}
			}
			
			
			
			System.out.println("Eingegebenes Wort ohne Vokale " +  ausgabe);
		
		}

	}


