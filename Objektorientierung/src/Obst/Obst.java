package Obst;

public class Obst {
	
	private static int anzahl;
	
	public static int getAnzahl() {
		return anzahl++;
	}
	
	
	private int gewicht;
	
	public Obst(int gewicht) {
		this.gewicht = gewicht;
	}
	
	
	public String toString() {
		
		return "Gewicht: " + gewicht;
	}

}
