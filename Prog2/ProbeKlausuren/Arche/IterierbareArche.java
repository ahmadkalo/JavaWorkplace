package Arche;

import java.util.Iterator;

public class IterierbareArche<T> extends Arche<T> implements Iterable<T> {
	@Override
	public Iterator<T> iterator() {
		return new ArchIterator();
	}

	class ArchIterator implements Iterator<T> {

		int i = 0;

		@Override
		public boolean hasNext() {
			return i < size;
		}

		@Override
		public T next() {
			T tier = elemente[i++];
			return tier;
		}

	}

	public static void main(String[] args) {
		IterierbareArche<Tier> arche = new IterierbareArche<Tier>();
		Tier[] tfeld = { new Igel("Isidor", 3), new Hase("Hubertus", 6), new Amsel("Amadeus", 2) };

		for (Tier t : tfeld) {
			arche.insert(t);
		}

		for (Tier t : arche) {
			System.out.println(t);
		}
	}
	
}
