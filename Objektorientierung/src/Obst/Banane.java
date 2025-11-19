package Obst;

public class Banane extends Obst {
	
	private static int anzahl = 0;
	static int gesamtgewicht;

	public static int getAnzahl() {
		System.out.print( "So viele Bananen gibt es ");

		return anzahl++;
	}
	
	public Banane() {
		this(2);  // Standardgewicht für eine Banane, wenn kein Gewicht angegeben ist
		
	}

	public Banane(int gewicht) {
		super(gewicht);
		anzahl++;
		gesamtgewicht += gewicht;
		
	}
	
	public static int getGewicht() {
		System.out.print("Das Gesemtgewicht der Bananen ist ");
		return gesamtgewicht;
	}
	
	public void schaelen() {
		System.out.println("Banane wird geschaelt.");
	}
	
}
