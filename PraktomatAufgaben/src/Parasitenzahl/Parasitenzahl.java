package Parasitenzahl;


public class Parasitenzahl {

	public static boolean parasitenZahl(long n) {

		long letzteZiffer = n % 10; // Hier wird die letzte Ziffer von n ermittelt, indem der Rest der Division
									// durch 10 genommen wird.
		long multiErg = letzteZiffer * n; // die Multiplikation der letzten Ziffer von n mit n
		if (multiErg == 0)
			return false;

		n = n / 10; // Die letzte Ziffer wird von n entfernt, um mit der nächsten Ziffer
					// fortzufahren
		long letzteZifferVonMulti = multiErg % 10;
		long letzteZifferVonN = n % 10;
		while (letzteZifferVonMulti == letzteZifferVonN) {
			multiErg = multiErg / 10;
			n = n / 10;

			letzteZifferVonMulti = multiErg % 10;
			letzteZifferVonMulti = n % 10;

		}

		return letzteZiffer == multiErg;

	}

	public static void main(String[] args) {
		long m = Long.parseLong(args[0]);

		for (int i = 1; i <= m; i++) {
			if (parasitenZahl(i)) // Für jede Zahl wird überprüft, ob sie eine Parasitenzahl ist, indem die
									// Methode parasitenZahl() aufgerufen wird.
				System.out.println(i);
		}

	}

}

