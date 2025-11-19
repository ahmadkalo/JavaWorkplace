package EinzelneAufgaben;

import Rechteck.Punkt2D;

public class Strecke {

	Punkt2D startpunkt;
	Punkt2D endpunkt;

	public Strecke(Punkt2D startpunkt, Punkt2D endpunkt) {
		this.startpunkt = startpunkt;
		this.endpunkt = endpunkt;
	}

	public Punkt2D endpunkt() {
		return endpunkt;
	}

	public Punkt2D startpunkt() {
		return startpunkt;
	}

	public void setStart(Punkt2D p) {
		this.startpunkt = p;
	}

	public void setEnde(Punkt2D p) {
		this.endpunkt = p;
	}

	@Override
	public String toString() {

		return "[(" + this.startpunkt.x() + "," + this.startpunkt.y() + ")" + "," + "(" + this.endpunkt.x() + ","
				+ this.endpunkt.y() + ")]";

	}

	public boolean equals(Strecke s) {
		if (this.startpunkt.x() == s.startpunkt.x() && this.startpunkt.y() == s.startpunkt.y()
				&& this.endpunkt.x() == s.endpunkt.x() && this.endpunkt.y() == s.endpunkt.y()
				|| this.startpunkt.x() == s.endpunkt.x() && this.startpunkt.y() == s.endpunkt.y()
				|| s.startpunkt.x() == this.endpunkt.x() && s.startpunkt.y() == this.endpunkt.y())
			return true;
		else
			return false;

	}

	public static void main(String[] args) {
		Strecke AhmedStraße = new Strecke(new Punkt2D(1, 3), new Punkt2D(4, 3));
		Strecke mayarStraße = new Strecke(new Punkt2D(4, 3), new Punkt2D(2, 3));

		System.out.println(AhmedStraße);
		System.out.println(mayarStraße);

		System.out.println(AhmedStraße.equals(mayarStraße));
	}

}
