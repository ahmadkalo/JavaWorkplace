package Feldsuche;
public class Feldsuche {

	public static int[] suche(int[] zahlen) {
		int zaehler = 0;
		for (int i = 0; i < zahlen.length; i++) {
			if (zahlen[i] >= 0 && zahlen[i] % 2 == 0) {
				zaehler++;
			}
		}
		int[] ergebnis = new int[zaehler];
		int j = 0;
		for (int i = 0; i < zahlen.length; i++) {
			if (zahlen[i] > 0 && zahlen[i] % 2 == 0) {
				ergebnis[j] = zahlen[i];
				j++;
			}
		}
		return ergebnis;
	}

	public static void main(String[] args) {
		int[] testArray = { 1, 2, -3, 3, 4, 5, -6, 6, 7, 8, 9, 0 };

		int[] ergebnisArray = suche(testArray);

		System.out.println("ErgebnisArray:");
		for (int i = 0; i < ergebnisArray.length; i++) {
			System.out.print(ergebnisArray[i] + " ");
		}
	}
}
