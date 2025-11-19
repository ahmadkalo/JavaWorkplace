package Rekrusion;
public class PotenzBerechnung { // rekrusiv

	public static int potenz(int x, int y) {
		// Basisfall: Wenn y gleich 0 ist, ist das Ergebnis 1
		if (y == 0) {
			return 1;
		} else {
			// rekursiver Aufruf: x^y = x * x^(y-1)
			return x * potenz(x, y - 1);
		}
	}

	public static void main(String[] args) {
		int basis = 2; // Beispiel für die Basis
		int exponent = 3; // Beispiel für den Exponenten

		// Berechnung der Potenz
		int ergebnis = potenz(basis, exponent);

		// Ausgabe des Ergebnisses
		System.out.println(basis + " hoch " + exponent + " = " + ergebnis);
	}
}
