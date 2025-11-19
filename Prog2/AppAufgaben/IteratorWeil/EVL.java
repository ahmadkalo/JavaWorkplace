package IteratorWeil;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class EVL<T> {

	// Eine innere Klasse für die Elemente der verketteten Liste
	class ListenElem {
		T value; // Der Wert des Elements
		ListenElem next; // Eine Referenz auf das nächste Element

		ListenElem (T v) {
			value = v; // Initialisiert den Wert
			next = null; // Initialisiert den Verweis auf das nächste Element als null
		}

		@Override
		public String toString() {
			return value.toString(); // Gibt den Wert des Elements als String zurück
		}
	}

	// Eine innere Klasse für den Iterator
	class EVLIterator implements Iterator<T>{
		ListenElem crs = first; // Der aktuelle Zeiger auf ein Element

		public boolean hasNext() {
			// Überprüft, ob es ein weiteres Element gibt
			return crs != null;
		}

		public T next() {
			// Gibt den Wert des aktuellen Elements zurück und bewegt den Zeiger zum nächsten Element
			T v = crs.value;
			crs = crs.next;
			return v;
		}
	}

	// Das erste Element in der Liste
	protected ListenElem first;
	protected int size; // Die Anzahl der Elemente in der Liste

	// Konstruktor
	public EVL() {
		this.first = null; // Setzt das erste Element auf null, um eine leere Liste zu erstellen
	}

	// Methoden zur Verwaltung der Liste
	public int size() {
		return this.size; // Gibt die Größe der Liste zurück
	}

	public boolean isEmpty() {
		return (first == null); // Überprüft, ob die Liste leer ist
	}

	public T get() throws NoSuchElementException {
		// Gibt den Wert des ersten Elements zurück, wirft eine Ausnahme, wenn die Liste leer ist
		if (first == null)
			throw new NoSuchElementException("Liste leer");
		return first.value;
	}

	public void insert(T v) {
		// Fügt ein Element vorne in die Liste ein
		ListenElem neu = new ListenElem(v); // Erstellt ein neues ListenElem-Objekt mit dem übergebenen Wert
		neu.next = first; // Setzt das nächste Element des neuen Elements auf das aktuelle erste Element
		first = neu; // Setzt das neue Element als das erste Element der Liste
		size++; // Erhöht die Größe der Liste
	}

	public void remove() {
		// Entfernt das erste Element aus der Liste
		if (first == null) 
			return; // Wenn die Liste leer ist, wird nichts getan
		first = first.next; // Setzt das nächste Element als das neue erste Element
		size--; // Verringert die Größe der Liste
	}


	public void delete(T v) {
	// entfernt das Element mit Eintrag v
		if(this.isEmpty())
			return;
		ListenElem e = first;
		ListenElem tmp = first;
		
		// Liste durchlaufen bis zum Ende oder v gefunden
		while(e!= null && !e.value.equals(v)) {
			tmp = e; 
			e = e.next;
		}
		
		// Ausnahme: falls v nicht gefunden
		if (e == null)
			return;
		
		// Sonderfall: falls v = erstes
		if(e == first)
			first = first.next;
		
		// Normalfall: v hinter first gefunden
		tmp.next = e.next;
		size--;
	}
	
	/*
	@Override
	// ohne Iterator
	public String toString() {
		String s = "";
		ListenElem tmp = first;
		while (tmp!= null) {
			s += tmp.toString() + " ";
			tmp = tmp.next;
		}
		return s;
	}
	*/
	
	
	@Override
	// mit Iterator
	public String toString() {
		String s = "";
		Iterator<T> it = new EVLIterator();
		while(it.hasNext()) {
			s += it.next().toString() + " ";
		}
		return s;
	}
	
	
	/*
	@Override
	// rekursive Loesung
	public String toString() {
		return rekToString(first);
	}
	
	private String rekToString(ListenElem e) {
		if (e == null)
			return "";
		else
			return rekToString(e.next) + " "+  e.value;
		
	}
*/
}