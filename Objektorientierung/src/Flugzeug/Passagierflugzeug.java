package Flugzeug;

public class Passagierflugzeug extends Flugzeug {

	private static int anzahl;

	public static int getAnzahl() {
		return anzahl;
	}

	private double gesamtschubInKn;

	public Passagierflugzeug(double spannweite, int sitze, double gesamtschubInKn) {
		super(spannweite, sitze);
		this.gesamtschubInKn = gesamtschubInKn;
		anzahl++;
	}

	public String toString() {

		return super.toString() + ", Schub " + this.gesamtschubInKn + " (Passagierflugzeuge)";
	}

}
