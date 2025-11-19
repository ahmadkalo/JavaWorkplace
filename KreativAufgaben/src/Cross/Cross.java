package Cross;
public class Cross{  

	//Zwei Bedingungen für 2 Diagonalen sollten erfüllt sein, um ein Kreuz aus Sternen zu erzeugen
	//Ertste Bedingung: Für die erste Diagonale soll das Ergenbis der Höhe und Breite nach jeder Zeile gleich sein
	//Zweite Bedingung: Für die zweite Diagonale soll das Ergebnis der Höhe und Breite nach jeder Zeile gleich 6 sein
	
	
	public static void main(String[] args) {
		
		int x=10;
		
		for(int i=1;i<=x;i++) { 			 // Äußere Schleife für die Zeilen
			for(int f=1;f<=x;f++) {  		// Innere Schleife für die Spalten
				if(i==f||i+f==11)
					System.out.print("x"); // Wenn Bedingung erfüllt ist, drucke Stern 
				else				
					System.out.print(" "); // Wenn Bedingung nicht erfüllt ist, drucke Leerzeichen
				
			}
			System.out.println();   	// Zeilenumbruch nach jeder Zeile
			
		}
		
	}	
	
}