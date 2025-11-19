package Flugzeug;

public abstract class Flugzeug {

	/* Klassenvariablen */

	private static int anzahl;

	/* Klassenmethode */

	public static int getAnzahl() {
		return anzahl;
	}

	/* Instanzvariablen */
	private double spannweite;
	int sitze;

	/* Konstruktor */
	public Flugzeug(double spannweite, int sitze) {

		this.spannweite = spannweite;
		this.sitze = sitze;
		anzahl++;
	}

	/* Instanzmethoden */
	public String toString() {

		return "Spannweite: " + this.spannweite + ", Sitze: " + this.sitze;

	}

}
