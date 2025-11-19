package MittelErdeInterface;

public class Gegenstand implements Tragbar {

	private String bezeichnung;
	private double gewicht;

	public Gegenstand(String bezeichnung, double gewicht) {
		this.bezeichnung = bezeichnung;
		this.gewicht = gewicht;

	}

	public double getGewicht() {
		return gewicht;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	@Override
	public double gewicht() {

		return this.gewicht;
	}

	
	@Override
	public String toString() {
		
		return "Bezeichnung: " + this.bezeichnung + "Gewicht: " + this.gewicht; 
	}

}
