package DifferenzierbareFunktionen;

public interface Diffbar extends Funktion {
    Diffbar derivat(); // liefert die Ableitungs-Funktion
    double derivat(double x); // liefert den Wert der Ableitung an der Stelle x
	
}

