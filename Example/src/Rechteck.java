
public class Rechteck {

	Punkt2D punktLU;
	double breite;
	double laenge;

	public Rechteck( double breite, double laenge) {

		this.breite = breite;
		this.laenge = laenge;
		this.punktLU = new Punkt2D(0,0);
	}

	
	public double getBreite() {
		return breite;

	}

	public void setBreite(double breite) {
		this.breite = breite;
	}

	public double getLaenge() {
		return breite;

	}

	public void setLaenge(double laenge) {
		this.laenge = laenge;
	}

	public void verschieben() {

	}

	public void skalieren(double faktor) {

		breite *= faktor;
		laenge *= faktor;

	}

	public double flaeche() {
		return breite * laenge;
	}

	public double umfang() {
		return 2 * (breite + laenge);
	}

	public Punkt2D mittelpunkt() {

		double MittelpunktX = punktLU.getX() + breite / 2;
		double MittelpunktY = punktLU.getY() + laenge / 2;

		return new Punkt2D(MittelpunktX, MittelpunktY);

	}

	public boolean testQuadrat() {
		return breite == laenge;
	}

	public static void main(String[] args) {

		Rechteck rechteck1 = new Rechteck(3, 4);
		System.out.println(rechteck1.umfang());

		System.out.println(rechteck1.flaeche());
		System.out.println(rechteck1.testQuadrat());
		System.out.println(rechteck1.mittelpunkt().getX() + rechteck1.mittelpunkt().getY());

	}

}
