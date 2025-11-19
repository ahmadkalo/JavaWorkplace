package Klausurnoten;

public class Klausurnoten {

	public static void main(String[] args) {

		int[] punkte = { 30, 74, 81, 67, 95, 65 };
		int[] punktGrenzen = { 59, 69, 79, 89 };

		verarbeiteKlausurPunktzahl(punkte, punktGrenzen);
	}

	public static void verarbeiteKlausurPunktzahl(int[] punkte, int[] punktGrenzen) {

		// Schritt 1 Anzahl der Teilnehmer bestimmen
		int anzahlTeilnehmer = punkte.length;
		System.out.println(anzahlTeilnehmer);

		// Schritt 2 die beste und schlechste Note bestimmen
		int besteNote = punkte[0];
		int schlechtesteNote = punkte[0];

		for (int i = 0; i < punkte.length; i++) {
			if (punkte[i] <= schlechtesteNote) {
				schlechtesteNote = punkte[i];

			}
		}
		for (int i = 0; i < punkte.length; i++) {
			if (punkte[i] > besteNote) {
				besteNote = punkte[i];

			}
		}
		// In Note umwandeln
		besteNote = getNote(besteNote, punktGrenzen);
		schlechtesteNote = getNote(schlechtesteNote, punktGrenzen);

		System.out.println(besteNote + " " + schlechtesteNote);

		// Schritt 3 die bestandenene und nicht bestandene Note bestimmen
		int bestanden = 0;
		int nichtBestanden = 0;
		int BestandenOderNicht;
		for (int i = 0; i < punkte.length; i++) {
			BestandenOderNicht = getNote(punkte[i], punktGrenzen);
			if (BestandenOderNicht <= 4) {
				bestanden++;
			} else {
				nichtBestanden++;
			}
		}
		System.out.println(bestanden + " " + nichtBestanden);

		// Schritt 4 Durchschnitt berechnen
		double summe = 0.0;
		double durchschnitt = 0.0;
		for (int i = 0; i < punkte.length; i++) {
			summe = summe + punkte[i];
		}

		durchschnitt = summe / anzahlTeilnehmer;

		System.out.println(durchschnitt);

		// Schritt 5 Histogramm der Noten
		int note1 = 0, note2 = 0, note3 = 0, note4 = 0, note5 = 0;
		int note = 0;

		for (int i = 0; i < punkte.length; i++) {
			note = getNote(punkte[i], punktGrenzen);

			if (note == 1) {
				note1++;
			} else if (note == 2) {
				note2++;
			} else if (note == 3) {
				note3++;
			} else if (note == 4) {
				note4++;
			} else if (note == 5) {
				note5++;
			}
		}
		System.out.println("1 " + note1);
		System.out.println("2 " + note2);
		System.out.println("3 " + note3);
		System.out.println("4 " + note4);
		System.out.println("5 " + note5);

	}

	// Methode, um die Punkte in Schulnoten umzuwandeln
	private static int getNote(int punkt, int[] punktGrenzen) {
		for (int i = 0; i < punktGrenzen.length; i++) {
			if (punkt <= punktGrenzen[i]) {
				return 5 - i;
			}
		}
		return 1;

	}

}

