package FeldIterable;

import java.util.Comparator;
import java.util.Iterator;

import java.util.ArrayList;

import java.util.List;

public class Feld<T> implements Iterable<T> {
	private List<T> elements;

	public Feld() {
		elements = new ArrayList<>();
	}

	public void addLast(T obj) {
		elements.add(obj);
	}

	@Override
	public Iterator<T> iterator() {
		return elements.iterator();
	}

	public static <U> Feld<Integer> giveMatchingIndices(Feld<U> f1, Feld<U> f2, Comparator<U> c) {
		Iterator<U> il = f1.iterator();
		Iterator<U> i2 = f2.iterator();
		int count = 0;
		Feld<Integer> result = new Feld<>();

		while (il.hasNext() && i2.hasNext()) {
			U el1 = il.next();
			U el2 = i2.next();
			if (c.compare(el1, el2) == 0) {
				result.addLast(count);
			}
			count++;
		}
		return result;
	}

	public static void main(String[] args) {
		// Beispiel-Arrays
		String[] array1 = { "kurz", "kurz", "laenger", "Zweiundvierzig" };
		String[] array2 = { "laenger", "auch", "kurz", "Zweiundvierzig", "welt" };

		// Erstellung der Feld-Objekte
		Feld<String> f1 = new Feld<>();
		Feld<String> f2 = new Feld<>();

		for (String s : array1) {
			f1.addLast(s);
		}
		for (String s : array2) {
			f2.addLast(s);
		}

		// Vergleich der Elemente mit StringLengthComp
		Comparator<String> c = new StringLengthComp();
		Feld<Integer> result = giveMatchingIndices(f1, f2, c);

		// Ausgabe der übereinstimmenden Indizes
		for (Integer index : result) {
			System.out.println(index);
		}
	}

}
