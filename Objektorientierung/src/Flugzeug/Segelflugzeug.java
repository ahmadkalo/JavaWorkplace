package Flugzeug;

public class Segelflugzeug extends Flugzeug {

	private static int anzahl;

	public static int getAnzahl() {
		return anzahl;
	}

	public Segelflugzeug(double spannweite) {
		super(spannweite, 1);
		anzahl++;

	}

	public String toString() {

		return super.toString() + " (Segelflugzeug)";
	}
}
