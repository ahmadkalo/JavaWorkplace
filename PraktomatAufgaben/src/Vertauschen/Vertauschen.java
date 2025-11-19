package Vertauschen;
import java.util.Arrays;

public class Vertauschen {

	// Schritt 1: Eine Methode erstellen, die den Inhalt vertauscht und eine neue
	// Referenz bildet
	// {"A", "B", "C", "D", "E"};
	public static String[] vertauscheReferenz(String[] eingabeArray) {
		String[] ergebnisArray = new String[eingabeArray.length];

		for (int i = 0; i < eingabeArray.length; i++) {
			ergebnisArray[eingabeArray.length - 1 - i] = new String(eingabeArray[i]);
		}

		return ergebnisArray;
	}

	// Schritt 2: Eine Methode erstellen, die nur den Inhalt vertauscht
	public static String[] vertauscheInhalt(String[] eingabeArray) {
		String[] ergebnisArray = new String[eingabeArray.length];

		for (int i = 0; i < eingabeArray.length; i++) {
			ergebnisArray[eingabeArray.length - 1 - i] = eingabeArray[i];
		}

		return ergebnisArray;
	}

	// Schritt 3: Eine Methode erstellen, die nur den Inhalt von ErgebinsArray und
	// EingabeArrayInhalt vergleicht
	public static boolean testInhaltGleich(String[] array1, String[] array2) {
		return Arrays.equals(array1, array2);
	}

	// Schritt 4: Eine Methode erstellen, die vergleicht, ob der Inhalt von
	// ErgebinsArray und EingabeArrayInhalt in der gleichen Referenz sind
	public static boolean testReferenzGleich(String[] array1, String[] array2) {
		if (array1.length != array2.length) {
			return false;
		}

		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != array2[i]) {
				return false;
			}
		}

		return true;
	}
	


	public static void main(String[] args) {
		String[] eingabeArray = { "A", "B", "C", "D", "E" };
		

		// {"E", "D", "C", "B", "A"}
	
		String[] ergebnisReferenz = vertauscheReferenz(eingabeArray);
		String[] ergebnisInhalt = vertauscheInhalt(eingabeArray);
		


		System.out.println("VertauscheInhalt: " + Arrays.toString(ergebnisInhalt));

		System.out.println("VertauscheReferenz: " + Arrays.toString(ergebnisReferenz));

		System.out.println("Test Inhalt gleich: " + testInhaltGleich(ergebnisReferenz, ergebnisInhalt));

		System.out.println("Test Referenz gleich: " + testReferenzGleich(ergebnisInhalt, ergebnisReferenz));

	}
}
