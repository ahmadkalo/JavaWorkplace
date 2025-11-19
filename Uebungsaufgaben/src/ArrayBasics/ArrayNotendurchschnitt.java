package ArrayBasics;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayNotendurchschnitt {

	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int anzahlNoten;
		double wert = 0;
		double schnitt, schnittGerundet;
		double aktuelleNote;
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Geben Sie bitte die Anzahl der Noten ein: ");
		anzahlNoten = scanner.nextInt();
		
		System.out.println("Geben Sie jetzt bitte die " + anzahlNoten + " Noten ein: ");
		double noten [] = new double[anzahlNoten];
		

		for (int i = 0; i < anzahlNoten; i++) {
			aktuelleNote = scanner.nextDouble();
			noten[i] = aktuelleNote;
			 wert = wert + aktuelleNote;
				
		} 
		
		schnitt = wert/anzahlNoten;
		schnittGerundet = Math.round(schnitt * 100);
		System.out.println(Arrays.toString(noten) + " und der Notendurchschnitt lautet: " + (schnittGerundet/100));
				
	}
	
}
