package Übungen;
import java.util.Scanner;

public class KorrekturPrüfer {

	public static void main(String[] args) {


		String hinterlegtesWort = "Aufmerksamkeitsdefizit";
		String eingegebenesWort;
		int counterFehler = 0;
		int counterKorrekt = 0;
		
		Scanner KorrektScanner = new Scanner(System.in);
		
	
		System.out.println("Geben Sie folgendes Wort ein: 'Aufmerksamkeitsdefizit' ");
		eingegebenesWort = KorrektScanner.next();
		
		KorrektScanner.close();
		
		for(int i = 0; i < hinterlegtesWort.length(); i++) {
			
			if(eingegebenesWort.charAt(i) == hinterlegtesWort.charAt(i)) {
				counterKorrekt++;
				
			} else {
				counterFehler++;
			}
		}
		
		
		System.out.println("Anzahl richtig: " + counterKorrekt);
		System.out.println("Anzahl Fehler: " + counterFehler);
	}

}


