package MittelErdeInterface;

public class Waffe extends Gegenstand implements Kaufbar  {
	double preis;
	public Waffe(String bezeichnung, double gewicht, double preis) {
		super(bezeichnung, gewicht);
		this.preis = preis;
	}
	

	@Override
	public double gewicht() {

		return this.getGewicht();
	}
	
	@Override
	public double preis() {
		return this.preis();
	}

}
