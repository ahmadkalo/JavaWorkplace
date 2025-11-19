package Zahlendarstellung;

public class Zahlendarstellung {

	public static int[] ermittleZiffern(int x, int b) {

		if (x <= 0) { // Sonderfall
			return new int[0];
		}
		// Schritt 1: Ermittle die Anzahl der Ziffern
		int AnzahlDerZiffern = ermittleAnzahlDerZiffern(x, b);

		// Schritt 3: Initialisiere das Array
		int[] ergebnis = new int[AnzahlDerZiffern];

		// Schritt 4: Berechne die Ziffern des Ergebnises
		for (int i = 0; i < ergebnis.length; i++) {
			ergebnis[i] = x % b; // Aktuelle Ziffer
			x = x / b; // dividiere, um die Ziffer loszuwerden
		}

		return ergebnis;
	}

	// Schritt 3: Hilfsmethode zur Berechnung der Anzahl der Ziffern
	private static int ermittleAnzahlDerZiffern(int x, int b) {
		int Ziffern = 0;
		while (x > 0) {
			x = x / b;
			Ziffern++;
		}
		return Ziffern;
	}

	public static void main(String[] args) {

		int[] ergebnis = ermittleZiffern(4711, 10);

		System.out.print("{");

		for (int i = 0; i < ergebnis.length; i++) {
			System.out.print(ergebnis[i]);

			if (i < ergebnis.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("}");

	}

}
