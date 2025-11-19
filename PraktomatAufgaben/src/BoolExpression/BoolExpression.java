package BoolExpression;

public class BoolExpression {
	
	
    public static void main(String[] args) {
        
        boolean wert1 = false;        // Erster Schritt: Deklaration und Initialisierung der Variablen
        boolean wert2 = true;

        
        boolean ergebnis1 = !wert1 & (wert1 | wert2); // Zweiter Schritt: Berechnung und Ausgabe des ersten Ausdrucks
        System.out.println(ergebnis1);

      
        wert1 = true;     // Dritter Schritt: Änderung des Werts von wert1

        
        boolean ergebnis2 = !wert1 & (wert1 | wert2);  // Vierter Schritt: Berechnung und Ausgabe des zweiten Ausdrucks
        System.out.println(ergebnis2);
        
    }
    
}
