package ArrayBasics;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListAutos {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<String> AutoMarken = new ArrayList<String>();
		
		boolean weitererDurchlauf = true;
		
		while(weitererDurchlauf) {
		System.out.println("Optionen für Auto Marken wählen: [Anzeigen], [Länge], [Hinzufügen], [Löschen], [Karte löschen], [Abfrage], [Ende]");
		String eingabe = scanner.next();
		
		if(eingabe.equalsIgnoreCase("Anzeigen")) {
			System.out.println(AutoMarken);
		
		} else if(eingabe.equalsIgnoreCase("Länge")) {
			System.out.println(AutoMarken.size());
			
			
		} else if(eingabe.equalsIgnoreCase("Hinzufügen")) {
			System.out.println("Automarke eingeben: ");
			AutoMarken.add(scanner.next());
			
		} else if(eingabe.equalsIgnoreCase("Löschen")) {
			System.out.println("Automarke eingeben: ");
			AutoMarken.remove(scanner.next());
			
		} else if(eingabe.equalsIgnoreCase("Karte löschen")) {
			AutoMarken.clear();
			
		} else if(eingabe.equalsIgnoreCase("Abfrage")) {
			System.out.println("Automarke eingeben: ");
			System.out.println(AutoMarken.contains(scanner.next()));
			
		} else if(eingabe.equalsIgnoreCase("Ende")) {
			System.out.println("Programm beenden? (true/false");
			weitererDurchlauf = scanner.nextBoolean();
		
		} else {
			System.out.println("Ungültiger Befehl");
			
			}
		
		System.out.println("-----------------------------------------------------------------------------");

		}

	}
	
}
