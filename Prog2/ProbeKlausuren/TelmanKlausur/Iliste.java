package TelmanKlausur;

public interface Iliste<T> {
	
	// Schnittstelle für Listen beliebiger Datentypen T
	 public void insert(T e);
	 // Einfügen eines neuen Elements am Listenanfang
	 public T removeFirst(); // Entnahme des ersten Elements; gibt den Wert des ersten Listenelements zurück (oder ’null’ bei leerer Liste)
	 }


