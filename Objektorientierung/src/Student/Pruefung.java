package Student;


public class Pruefung {
	
	/* Instanzvariablen */
	
	String name;
	String datum;
	int credits;
	Ergebnis[] ergebnisse;
	
	
	/* Konstruktor */
	
	public Pruefung(String name, String datum, int credits) {

		this.name = name;
		this.datum = datum;
		this.credits = credits;
		this.ergebnisse = new Ergebnis[0];
		
	}
	
	/* Instanzmethode*/
	
	public void neuesErgebnis(Ergebnis e) {
		
		Ergebnis[] tmp = new Ergebnis[this.ergebnisse.length + 1];
		
		for (int i = 0; i < this.ergebnisse.length; i++) {
			
			tmp[i] = this.ergebnisse[i];
				
		}
		
		tmp[tmp.length -1 ] = e;
		this.ergebnisse = tmp; 
		
	}
	public String toString() {
		
		String erg = "Pruefung: " + this.name + " vom " + this.datum + " mit " + this.credits + " Credits\n";
		for (int i = 0; i < ergebnisse.length; i++) {
			erg += ergebnisse[i] + "\n";
		}
		return erg;
		
	}
}

 