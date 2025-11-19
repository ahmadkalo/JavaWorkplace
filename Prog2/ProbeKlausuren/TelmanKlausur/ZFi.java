package TelmanKlausur;

import java.util.Iterator;

public class ZFi extends ZF implements Iterable<Integer> {

	public Iterator<Integer> iterator() {
		return new ZFiterator(); // liefere den Iterator
	}
	
	private class ZFiterator implements Iterator<Integer> { // Iterator als innere Klasse
		int nextPos = 0; // Position des Iterators

		ZFiterator() {
		}

		public boolean hasNext() { // gibt es noch ein Element?
			return (nextPos < size);
		}

		public Integer next() { // liefere das nächste Element
			return get(nextPos++);
		}
	}

	
}
