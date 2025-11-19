package Schach;

public abstract class Spielfigur {

	protected Punkt2D position;
	protected String farbe;

	public Spielfigur(Punkt2D position, String farbe) {
		this.position = position;
		this.farbe = farbe;

	}

	public Punkt2D getPosition() {
		return position;
	}

	public String getFarbe() {
		return farbe;
	}

	public abstract void step(int n, String r) throws UngueltigeBewegungException;

	
}
