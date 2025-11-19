
public class Punkt2D {

	private static double e = 0.0001;
	// Instanzvariablen
	private double x;
	private double y;

	// Konstruktor
	public Punkt2D(double x, double y) {
		this.x = x;
		this.y = y;

	}

	public double getX() {
		return x;

	}

	public double getY() {
		return y;

	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public static double getE() {
		return e;
	}

	public static void setE(double e) {
		Punkt2D.e = e;
	}

	public boolean equals(Punkt2D zweiterPunkt) {

		double distanz = Math.sqrt(Math.pow(x - zweiterPunkt.getX(), 2) + Math.pow(this.y - zweiterPunkt.getY(), 2));
		if (distanz < e) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public String toString() {

		return this.x + " " + this.y;
	}

	public static void main(String[] args) {

		Punkt2D mayar = new Punkt2D(3, 4);
		Punkt2D ahmed = new Punkt2D(2, 4);

		System.out.println(mayar);
		System.out.println(ahmed);
	}

}
