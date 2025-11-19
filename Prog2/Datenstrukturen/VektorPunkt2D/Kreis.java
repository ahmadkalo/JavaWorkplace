package VektorPunkt2D;

public class Kreis extends GeoObjekt2D {
	// Instanzvariablen
	private Punkt2D mittelpunkt;
	private double radius;

	// Konstruktor
	public Kreis(Punkt2D mittelpunkt, double radius, String farbe) {
		super(farbe);
		this.mittelpunkt = mittelpunkt;
		this.radius = Math.abs(radius);
	}

	// Instanzmethoden
	@Override
	public double umfang() {
		// Berechnet den Umfang des Kreises
		return radius * 2.0 * Math.PI;
	}

	@Override
	public double flaeche() {
		// Berechnet die Fläche des Kreises
		return Math.PI * radius * radius;
	}

	@Override
	public Punkt2D position() {
		// Gibt den Mittelpunkt des Kreises zurück
		return mittelpunkt;
	}

	@Override
	public void moveTo(Punkt2D point) {
		// Verschiebt den Kreis zu einer neuen Position
		mittelpunkt = point;
	}

	public Punkt2D mittelpunkt() {
		// Gibt den Mittelpunkt des Kreises zurück
		return mittelpunkt;
	}

	public double radius() {
		// Gibt den Radius des Kreises zurück
		return radius;
	}

	@Override
	public void multiply(double faktor) {
		// Skaliert den Radius des Kreises um den angegebenen Faktor
		radius *= Math.abs(faktor);
	}

	@Override
	public void resize() {
		// Setzt den Radius des Kreises auf einen Standardwert zurück
		radius = 1.0;
	}
}
