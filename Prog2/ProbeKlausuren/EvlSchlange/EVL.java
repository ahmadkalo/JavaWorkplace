package EvlSchlange;

public class EVL<T> {

	private ListElement firstListElement = null; // erstes Listenelement
	private int numberOfElements = 0; // Länge der Liste

	private class ListElement {
		T elementValue; // der eigentliche Listenwert
		ListElement nextListElement; // das nächste Element

		ListElement(T v) { // neues Element
			elementValue = v;
		}
	}
	
	public int getSize() {
		return numberOfElements;
	}

	public boolean insert(T value) {

		ListElement newListElement = new ListElement(value);
		newListElement.nextListElement = firstListElement;
		firstListElement = newListElement;
		numberOfElements++;
		return true;
	}

	public boolean append(T value) {
		ListElement newListElement = new ListElement(value);

		if (firstListElement == null) {
			firstListElement = newListElement;
		} else {

			ListElement current = firstListElement;
			while (current.nextListElement != null) {
				current = current.nextListElement;
			}
			current.nextListElement = newListElement;

		}

		numberOfElements++;
		return true;

	}

	public T get(int pos) {
		if (pos < 0 || pos >= numberOfElements) {
			throw new IndexOutOfBoundsException("Index: " + pos + ", Size: " + numberOfElements);
		}

		ListElement current = firstListElement;
		for (int i = 0; i < pos; i++) {
			current = current.nextListElement;
		}

		return current.elementValue;
	}

	public T remove(int pos) {
		if (pos < 0 || pos >= numberOfElements) {
			throw new IndexOutOfBoundsException("Index: " + pos + ", Size: " + numberOfElements);
		}
		T removedElementValue;
		if (pos == 0) {
			// Sonderfall: Entfernen des ersten Elements
			removedElementValue = firstListElement.elementValue;
			firstListElement = firstListElement.nextListElement;
		} else {

			ListElement current = firstListElement;
			for (int i = 0; i < pos - 1; i++) {
				current = current.nextListElement;
			}

			ListElement toRemove = current.nextListElement;
			removedElementValue = toRemove.elementValue;
			current.nextListElement = toRemove.nextListElement;
		}
		numberOfElements--;
		return removedElementValue;
	}
	
	@Override
	public String toString() {

		String s = "{";
		ListElement tmp = firstListElement;
		if (tmp == null) {
			return "{}";
		}
		while (tmp != null) {
			s += tmp.elementValue;
			if (tmp.nextListElement != null) { // Überprüfe, ob tmp das letzte Element ist
				s += ", ";
			} else {
				s += "}";
			}
			tmp = tmp.nextListElement;
		}
		return s;
	}

}
