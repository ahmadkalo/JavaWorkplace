package TanteEmmaLaden;

import java.util.Scanner;

public class TanteEmmaLaden {
	
	
	public static void main(String[] args) {

		double playstationPreis = 199.0;
		double lakritzPreis = 0.3;
		double gummiBaerchenPreis = 0.05;

		double mwstPlaystation = 0.19;
		double mwstLebensmittel = 0.07;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Geben Sie die Anzahl gefolgt von dem Artikel (Gummibaerchen, Lakritzstangen, Playstation) ein:");
		int anzahl = scanner.nextInt();
		String artikel = scanner.next();
		scanner.close();
		double netto, mwst, zuZahlen;

		if (artikel.equals("gummibaerchen")) {
			netto = gummiBaerchenPreis * anzahl;
			mwst = netto * mwstLebensmittel;
			zuZahlen = netto + mwst;
		} else if (artikel.equals("lakritzstangen")) {
			netto = lakritzPreis * anzahl;
			mwst = netto * mwstLebensmittel;
			zuZahlen = netto + mwst;
		} else if (artikel.equals("playstation")) {
			netto = playstationPreis * anzahl;
			mwst = netto * mwstPlaystation;
			zuZahlen = netto + mwst;
		} else {
			System.out.println("Falscher Artikelname!");
			return;
		}

		System.out.println("Netto ohne MwSt: " + netto);
		System.out.println("MwSt: " + mwst);
		System.out.println("Zu Bezahlen: " + zuZahlen);
	}
}
