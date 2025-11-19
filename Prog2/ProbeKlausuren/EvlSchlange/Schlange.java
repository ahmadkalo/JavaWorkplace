package EvlSchlange;

public interface Schlange<T> {
	
	boolean insert(T value); // fügt ’value’ am Ende der Schlange ein

	T head();

// liefert den Wert des ältesten Elements,ohne es zu entfernen

	T remove();

// entfernt ältestes Element aus der Schlange und gibt den Wert zurück

	int size();
// Länge der Schlange
}