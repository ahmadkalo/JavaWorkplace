package Rational;

public class Rational {

	/* Instanzvariablen */

	int zähler;
	int nenner;

	/* Konstruktor */

	public Rational(int x) {
		zähler = x;
		nenner = 1;
	}

	public Rational(int x, int y) { // Attribute bestimmen
		if (y == 0) {
			System.out.println("Fehler: Nenner ist 0");

		} else {
			int ggt = ggt(x, y);

			this.zähler = x / ggt;
			this.nenner = y / ggt;

			if (nenner < 0) {
				this.nenner *= -1;
				this.zähler *= -1;
			}
		}
	}

	/* Instanzmethoden */

	public int ggt(int x, int y) {
		int a = Math.abs(x); // 77
		int b = Math.abs(y); // 21
		int temp;

		while (b != 0) {
			temp = b;
			b = a % b;
			a = temp;
		}

		return a;
	}

	public String toString() {
		return zähler + "/" + nenner;
	}

	public Rational add(Rational b) {
		int zähler = this.zähler;
		int nenner = this.nenner;
		if (b.nenner != nenner) {
			zähler *= b.nenner;
			nenner *= b.nenner;

			b.zähler *= this.nenner;
			b.nenner *= this.nenner;
		}

		return new Rational(zähler + b.zähler, nenner);

	}

	public Rational sub(Rational b) {
		int zähler = this.zähler;
		int nenner = this.nenner;
		if (b.nenner != nenner) {
			zähler *= b.nenner;
			nenner *= b.nenner;

			b.zähler *= this.nenner;
			b.nenner *= this.nenner;
		}

		return new Rational(zähler - b.zähler, nenner);
	}

	public Rational mul(Rational b) {
		int zähler = this.zähler;
		int nenner = this.nenner;

		return new Rational(zähler * b.zähler, nenner * b.nenner);
	}

	@SuppressWarnings("unused")
	public Rational div(Rational b) {
		int zähler = this.zähler;
		int nenner = this.nenner;

		return this.mul(new Rational(b.nenner, b.zähler));
	}

}
