package Person;

public class Boxer extends Person {
	
	private double gewicht;

	public Boxer(String name, int geburtsjahr, double gewicht) {
		super(name, geburtsjahr);
		this.gewicht = gewicht;
	
	}

	public double getGewicht() {
		return gewicht;
	}

	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}
	
	@Override
	public String toString() {
		return getName() + "(" + getGeburtsjahr() + ") Gewicht: " +  this.gewicht + "kg";
	}
	

}
