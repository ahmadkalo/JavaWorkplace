package Obst;

public class Apfel extends Obst {

	private static int anzahl;
	static int gesamtgewicht;
	
	public static int getAnzahl() {
		System.out.print( "So viele Äfpeln gibt es ");
		return anzahl;
	}

	public Apfel() {
		this(2);
	}

	public Apfel(int gewicht) {
		super(gewicht);
		anzahl++;
		gesamtgewicht += gewicht;
		
	}
	
	public static int getGewicht() {
		System.out.print("Das Gesemtgewicht der Äpfeln ist ");
		return gesamtgewicht;
	}

}
