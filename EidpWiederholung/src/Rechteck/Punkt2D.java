package Rechteck;

public class Punkt2D {

	// Globale Variable für die Genauigkeit
	private static double e = 0.0001;

	// Attribute
	private double x;
	private double y;

	// Standardkonstruktor
	public Punkt2D() {
		x = 0.0;
		y = 0.0;
	}

	// 2. Konstruktor
	public Punkt2D(double x, double y) {
		this.x = x;
		this.y = y;
	}

	// Methoden
	public double x() {
		return this.x;
	}

	public double y() {
		return this.y;
	}

	public void moveTo(double x, double y) {
		this.x = x;
		this.y = y;
	}

	// Getter und Setter für die Genauigkeit €
	public static double getE() {
		return e;
	}

	public static void setE(double e) {
		Punkt2D.e = e;
	}

	// Methode equals()
	public boolean equals(Punkt2D other) {
		double distance = Math.sqrt(Math.pow(this.x - other.x(), 2) + Math.pow(this.y - other.y(), 2));
		if (distance <= e)
			return true;
		else
			return false;

	}

	// Testen der Methode
	public static void main(String[] args) {
		Punkt2D p1 = new Punkt2D(1.0, 2.0);
		Punkt2D p2 = new Punkt2D(1.0, 2.0);

		Punkt2D.setE(0.0001);
		System.out.println("p1 und p2 sind gleich: " + p1.equals(p2));
	}
}
