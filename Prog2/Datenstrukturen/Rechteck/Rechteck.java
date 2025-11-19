package Rechteck;

import java.util.Comparator;

public class Rechteck {

	double laenge;
	double breite;

	public Rechteck(double laenge, double breite) {

		this.laenge = laenge;
		this.breite = breite;
	}

	public double umfang() {
		double summe = this.laenge + this.breite;
		double erg = 2 * summe;
		return erg;
	}

	public double fleache() {
		double f = this.laenge * this.breite;

		return f;
	}

	public static Comparator<Rechteck> vergleichNachUmfang = new Comparator<Rechteck>() {

		@Override
		public int compare(Rechteck o1, Rechteck o2) {
			if (o1.umfang() > o2.umfang()) {
				return 1;
			} else if (o1.umfang() < o2.umfang()) {
				return -1;
			} else {
				return 0;
			}

		}

	};

	public static Comparator<Rechteck> vergleichNachFlaeche = new Comparator<Rechteck>() {

		@Override
		public int compare(Rechteck o1, Rechteck o2) {
			if (o1.fleache() > o2.fleache()) {
				return 1;
			} else if (o1.fleache() < o2.fleache()) {
				return -1;
			} else {
				return 0;
			}

		}

	};

	@Override
	public String toString() {

		return "Länge: " + this.laenge + ", Breite: " + this.breite;
	}

	public static void main(String[] args) {

		Rechteck r1 = new Rechteck(2.3, 3.2);

		double flaeche = r1.fleache();
		double umfang = r1.umfang();

		System.out.println(flaeche);
		System.out.println(umfang);
	}}
