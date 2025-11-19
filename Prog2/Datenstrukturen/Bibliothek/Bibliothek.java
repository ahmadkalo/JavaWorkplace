package Bibliothek;

import java.util.Iterator;

import Menge.Menge;
import Menge.MengeDynArray;

public class Bibliothek<T extends Buch> implements Iterable<T> {
	
	private Menge<T> buecher;

	public Bibliothek() {
		this.buecher = new MengeDynArray<T>();
	}

	public void hinzufuegen(T buch) {
		buecher.insert(buch);
	}

	@Override
	public Iterator<T> iterator() {
	
		return buecher.iterator();
	}

	

	
}
