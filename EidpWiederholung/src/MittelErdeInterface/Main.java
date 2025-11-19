package MittelErdeInterface;

public class Main {

	public static void main(String[] args) {
		
		// Gegenstände
		Gegenstand axt = new Gegenstand("Axt", 1.0);
		Gegenstand stein = new Gegenstand("Stein", 21.0);
		Gegenstand sattel = new Gegenstand("Sattel", 5.0);
		
		//Waffen
		Waffe waffe = new Waffe("Waffe", 2.0,20.0 );
		
		//Lebewesen
		Hobbit frodo = new Hobbit("Frodo", 94, 21.0, waffe);
		Magier gandalf = new Magier("Gandalf", 2000, 22.0, waffe);
		Hobbit sam = new Hobbit("Sam", 89, 14.0, waffe);
		Pferd rotsh = new Pferd("Rotsh", 3, 0.0, 20.0, sattel);

		Wesen[] AnzahlVonWesen = { frodo, gandalf, sam, rotsh };

		// Ausgabe des Status aller Lebewesen
		for (int i = 0; i < AnzahlVonWesen.length; i++) {
			status(AnzahlVonWesen[i]);
		}
		// Test für Frodo
		frodo.wirdVerwundet(30);
		gandalf.heilt(frodo);
		frodo.gruss();
		frodo.traegt(axt);
		frodo.nehmen(waffe);
		frodo.kaufen(rotsh);
		frodo.traegt(stein);
		status(frodo);

	}

	public static void status(Wesen wesen) {
		System.out.println("-----------------------------------------------");
		System.out.println(wesen);

	}

}
