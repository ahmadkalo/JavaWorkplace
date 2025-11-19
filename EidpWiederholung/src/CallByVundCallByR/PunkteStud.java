package CallByVundCallByR;

public class PunkteStud {

	int hausarbeit;
	int vortrag;
	int summe;
	
	
	  // Konstruktor
    public PunkteStud(int hausarbeit, int vortrag) {
        this.hausarbeit = hausarbeit;
        this.vortrag = vortrag;
        this.summe = 0; 
    }
    
    
    // Instanzmethode zum Bewerten
    public void bewerten() {
        this.hausarbeit = this.hausarbeit * 3;
        this.vortrag = this.vortrag * 2;
        this.summe = this.hausarbeit + this.vortrag;
    }
    
    @Override
    public String toString() {
    	return this.hausarbeit + " " + this.vortrag + " " + this.summe;
     }

    public static void main(String[] args) {
        // Erstellen einer Instanz der Klasse Stud
    	PunkteStud student = new PunkteStud(5, 8);
        student.bewerten();
        System.out.println("erreichte Punkte: " + student);
        
	
	
    }
    
}
    	/*
    	Vor dem Aufruf der Methode `bewerten()`:
    	
    	┌─────────────────────────────────────┐
    	│ student                             │
    	│ ┌─────────────┬───────────────────┐ │
    	│ │ Attribut    │ Wert              │ │
    	│ ├─────────────┼───────────────────┤ │
    	│ │ hausarbeit  │ 5                 │ │
    	│ │ vortrag     │ 8                 │ │
    	│ │ summe       │ 0                 │ │
    	│ └─────────────┴───────────────────┘ │
    	└─────────────────────────────────────┘

    	Während des Aufrufs der Methode `bewerten()`:
    	┌─────────────────────────────────────┐
    	│ student                             │
    	│ ┌─────────────┬───────────────────┐ │
    	│ │ Attribut    │ Wert              │ │
    	│ ├─────────────┼───────────────────┤ │
    	│ │ hausarbeit  │ 15                │ │
    	│ │ vortrag     │ 16                │ │
    	│ │ summe       │ 0                 │ │
    	│ └─────────────┴───────────────────┘ │
    	└─────────────────────────────────────┘

    	Nach dem Aufruf der Methode `bewerten()`:
    	┌─────────────────────────────────────┐
    	│ student                             │
    	│ ┌─────────────┬───────────────────┐ │
    	│ │ Attribut    │ Wert              │ │
    	│ ├─────────────┼───────────────────┤ │
    	│ │ hausarbeit  │ 15                │ │
    	│ │ vortrag     │ 16                │ │
    	│ │ summe       │ 31                │ │
    	│ └─────────────┴───────────────────┘ │
    	└─────────────────────────────────────┘
		*/

