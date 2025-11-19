package DreiecksFlaeche;

import java.util.Scanner;

public class DreiecksFlaeche {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Eingabe der Seitenlängen von der Kommandozeile
		System.out.print("Bitte geben Sie die Seitenlänge a ein: ");
		double a = scanner.nextDouble();

		System.out.print("Bitte geben Sie die Seitenlänge b ein: ");
		double b = scanner.nextDouble();

		System.out.print("Bitte geben Sie die Seitenlänge c ein: ");
		double c = scanner.nextDouble();

		// Berechnung von s (Halbsumme der Seitenlängen)
		double s = (a + b + c) / 2;

		// Berechnung der Fläche nach der Heron'schen Formel
		double flaeche = Math.sqrt(s * (s - a) * (s - b) * (s - c));

		// Ausgabe des Ergebnisses
		System.out.println("Der Flächeninhalt des Dreiecks beträgt: " + flaeche);

		scanner.close();
	}
}
