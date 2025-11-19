package EinzelAufgaben;

public class Grenze {

	public static int berechnen(double grenze) {
		int anzahl = 0;
		double sum = 0.0;

		while (sum <= grenze) {
			anzahl++;
			sum += 1.0 / anzahl;
		}

		return anzahl;
	}

	public static void main(String[] args) {
		double grenze = 2.0;

		System.out.println(berechnen(grenze));
	}
}
