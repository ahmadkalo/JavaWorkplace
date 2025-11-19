package Rechteck;
public class Rechteck {

	Punkt2D punktLU; // linker unterer Punkt
	double breite;
	double laenge;

	public Rechteck(double breite, double laenge) {
		this(new Punkt2D(0, 0), breite, laenge);
	}

	public Rechteck(Punkt2D punktLU, double breite, double laenge) {
		this.punktLU = punktLU;
		this.breite = breite;
		this.laenge = laenge;
	}

	public double getBreite() {
		return breite;
	}

	public double getLaenge() {
		return laenge;
	}

	public void setBreite(double breite) {
		this.breite = breite;
	}

	public void setLaenge(double laenge) {
		this.laenge = laenge;
	}

	public void verschieben(Punkt2D neuerPunkt) {
		punktLU = neuerPunkt;
	}

	public void skalieren(double faktor) {
		breite = breite * faktor;
		laenge = laenge * faktor;
	}

	public double flaeche() {
		return breite * laenge;
	}

	public double umfang() {
		return 2 * (breite + laenge);
	}

	public Punkt2D mittelpunkt() {
		double mittelX = punktLU.y() + breite / 2;
		double mittelY = punktLU.y() + laenge / 2;
		return new Punkt2D(mittelX, mittelY);
	}

	public boolean istQuadrat() {
		return breite == laenge;
	}

	@Override
	public String toString() {
		double rechts = punktLU.y() + breite;
		double oben = punktLU.y() + laenge;
		return "links: " + punktLU.y() + ", rechts: " + rechts + ", unten: " + punktLU.y() + ", oben: " + oben;
	}
	
	public static void main(String[] args) {
		// Test der Rechteck-Klasse
		Rechteck rechteck1 = new Rechteck(3, 4);
		System.out.println("Fläche: " + rechteck1.flaeche());
		System.out.println("Umfang: " + rechteck1.umfang());
		System.out.println("Mittelpunkt: (" + rechteck1.mittelpunkt().y() + ", " + rechteck1.mittelpunkt().y() + ")");
		System.out.println("Ist Quadrat? " + rechteck1.istQuadrat());
		System.out.println("Koordinaten: " + rechteck1);

		// Verschiebung des Rechtecks
		rechteck1.verschieben(new Punkt2D(2, 2));
		System.out.println("Verschobenes Rechteck: " + rechteck1);

		// Skalierung des Rechtecks
		rechteck1.skalieren(2);
		System.out.println("Skaliertes Rechteck: " + rechteck1);
	}
}