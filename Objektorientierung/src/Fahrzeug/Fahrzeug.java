package Fahrzeug;


public class Fahrzeug {
	

	 /* der Zähler sollte objekt unabhängig sein, da es sonst
	    für jedes Fahrzeug ein zähler entsehen kann, der nicht höher als eins gehen kann, also nur sich selber zählt. 
	    Wir brauchen also objektunabhänigien Zähler, klassenvariablen kommen immer mit "static" 
	    
	    für Klassenvariablen gibt es auch so eine Art Konstruktor, den nennt man den statischen Instialisier,
	    der wird einmalig aufgerufen sobald man die Klasse benutzt */
	
		
	/* Klassenvariablen */
	private static int anzahl; 
	
	/* Klassenmethoden */
	public static int getAnzahl() {
		return Fahrzeug.anzahl;
	}
	
	
	/* Instanzvariablen */   
	
	private int raeder;
	private int sitze;
	
	
	
	/* Konstruktoren */
	
	public Fahrzeug(int raeder, int sitze) {
		  
		this.raeder = raeder;
		this.sitze = sitze;
		Fahrzeug.anzahl++;
	}
	
	
	/* Instanzmethoden */
	
	public int getRaeder() {
		return this.raeder;
		
	}
	
	public int getSitze() {
		return this.sitze;
		
	}

	public String toString() {
		return "Fahrzeug (Raeder = " + raeder + ", Sitze = " + sitze + ")";
	}
	
}

