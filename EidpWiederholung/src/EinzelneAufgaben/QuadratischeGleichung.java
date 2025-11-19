package EinzelneAufgaben;

public class QuadratischeGleichung {

	public static String quadratisch(double a, double b, double c) {
		if (a == 0) {
			if (b == 0) {
				if (c == 0) {
					return "allgemeingültig";
				} else {
					return "Keine Lösung";
				}

			} else {
				return "Keine Lösung";
			}

		} else {
			double d = Math.pow(b, 2) - 4 * a * c;
			if (d < 0) {
				return "Keine Lösung";

			} else {
				if (d == 0) {
					return "eine Lösung";
				} else {
					return "Zwei Lösungen";
				}
			}
		}

	}

	public static void main(String[] args) {
		double a = 1.0;
		double b = -3.0;
		double c = 2.0;

		String result = quadratisch(a, b, c);
		System.out.println("Ergebnis: " + result);
	}
}
