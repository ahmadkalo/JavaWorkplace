package EinzelneAufgaben;

public class Punkt2D {


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
	
	
	@Override
	public String toString() {
		
		return this.x + ", " + this.y;
	}
	
	 public double distanz(Punkt2D other) {
		 double x = Math.pow(this.x - other.x, 2);
		 double y = Math.pow(this.y - other.y, 2);
		 double distanz = Math.sqrt(x + y);
	        return distanz;
	    }
	
}