package Schach;

public abstract class Schachfigur extends Spielfigur {

	boolean istWeiß;
	public Schachfigur(Punkt2D postion, boolean istWeiß) {
		super(postion);
		this.istWeiß = istWeiß;
	
	}
	
	@Override
	public String toString() {
		
		return ((istWeiß ? "Farbe: Weiß " : "Farbe: Schwarz ") + "Position: " + postion);
		
	
	}
	
	
	public abstract void step(int n, String r) throws UngueltigeBewegung;
	 
	

}
