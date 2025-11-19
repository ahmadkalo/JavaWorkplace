
public class Strecke {

	Punkt2D startpunkt;
	Punkt2D endpunkt;

	public Strecke(Punkt2D startpunkt, Punkt2D endpunkt) {
		this.startpunkt = startpunkt;
		this.endpunkt = endpunkt;

	}

	public Punkt2D startpunkt() {
		return startpunkt;
	}

	public Punkt2D endpunkt() {
		return endpunkt;
	}

	public void setStart(Punkt2D p) {
		this.startpunkt = p;
	}
	
	

	public void setEnde(Punkt2D p) {
		this.endpunkt = p;
	}

	@Override
	public String toString() {

		return "[(" + this.startpunkt.getX() + "," + this.startpunkt.getY() + ")" + "," + "(" + this.endpunkt.getX()
				+ "," + this.endpunkt.getY() + ")]";
	}

	public boolean equals(Strecke strecke2) {

		if (this.startpunkt.getX() == strecke2.startpunkt.getX() && this.startpunkt.getY() == strecke2.startpunkt.getY()
				&& this.endpunkt.getX() == strecke2.endpunkt.getX() && this.endpunkt.getY() == strecke2.endpunkt.getY()
				|| this.startpunkt.getX() == strecke2.endpunkt.getX()
						&& this.startpunkt.getY() == strecke2.endpunkt.getY()) {
			return true;

		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		Punkt2D mayar = new Punkt2D(3, 4);
		Punkt2D ahmed = new Punkt2D(3, 5);

		Punkt2D mayar1 = new Punkt2D(1, 8);
		Punkt2D ahmed1 = new Punkt2D(3, 4);

		Strecke mayarstraße = new Strecke(mayar, ahmed);
		Strecke ahmedstraße = new Strecke(mayar1, ahmed1);
		
		System.out.println(mayarstraße);
		System.out.println(ahmedstraße);

		System.out.println(mayarstraße.equals(ahmedstraße));

	}

}
