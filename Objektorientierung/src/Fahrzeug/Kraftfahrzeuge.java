package Fahrzeug;


public class Kraftfahrzeuge extends Fahrzeug {
	
	/* Klassenvariablen */
	private static int anzahl; 
	
	
	/* Klassenmethoden */
	public static int getAnzahl() {
		
	
		return Kraftfahrzeuge.anzahl;
	}
	
	/* Instanzvariablen*/

	int motroleistungInKW;
	
	
	/* Konstruktoren */

	public Kraftfahrzeuge(int raeder, int sitze, int motroleistungInKW) {
		super(raeder, sitze);
		this.motroleistungInKW = motroleistungInKW;
		Kraftfahrzeuge.anzahl++;
	}


	/* Instanzmethoden */
	
	public int getMotroleistungInKW() {
		return motroleistungInKW;
	}


	
	public String toString() {
		return "Kraftfahrzeuge (Motor Leistung = " + motroleistungInKW + ", Räder = " + getRaeder()
				+ ", Sitze = " + getSitze() + ")";
	}


}
