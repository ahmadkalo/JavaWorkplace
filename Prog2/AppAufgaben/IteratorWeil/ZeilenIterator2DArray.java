package IteratorWeil;

import java.util.Iterator;

public class ZeilenIterator2DArray<T> implements Iterator<T> {
    T a[][];  	// das Array, das durchlaufen werden soll
    int i; 		// Zeilennummer	
    int j; 		// Spaltennummer

    // Konstruktor
    public ZeilenIterator2DArray(T[][] a) {
        this.a = a; // Initialisiert das 2D-Array
        this.j = 0; // Setzt die Spaltennummer auf 0
        this.i = 0; // Setzt die Zeilennummer auf 0
    }

    @Override
    public boolean hasNext() {
        // Prüft, ob die aktuelle Position (i, j) eine gültige Nummer im Array darstellt
        return (i >= 0 && i < a.length &&
                j >=  0 && j < a[i].length);
    }
    
    @Override
    public T next() {
        T v = a[i][j]; // Speichert das aktuelle Element als Rückgabewert
        // Berechnet die Position des nächsten Elements
        j++;
        if(j >= a[i].length) {
            i++; 
            j = 0;
        }
        return v;
    }
}

