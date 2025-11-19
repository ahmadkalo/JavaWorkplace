package IteratorWeil;

import java.util.Iterator;

public class DynArrayIterator<T> implements Iterator<T> {
	
	private DynArray<T> dArr; // Eine Referenz auf ein DynArray-Objekt
	private int index; // Ein Index für die aktuelle Position im DynArray

	// Konstruktor
	public DynArrayIterator(DynArray<T> dArr) {
		this.dArr = dArr; // Initialisiert das DynArray-Objekt
		index = 0; // Setzt den Index auf den Anfang
	}

	@Override
	public boolean hasNext() {
		// Überprüft, ob es noch Elemente im DynArray gibt
		return (index < dArr.size());
	}

	@Override
	public T next() {
		// Gibt das nächste Element im DynArray zurück und erhöht den Index
		return dArr.get(index++);
	}
}
