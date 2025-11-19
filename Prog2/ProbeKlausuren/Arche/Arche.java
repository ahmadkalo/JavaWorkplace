package Arche;

import java.util.NoSuchElementException;

public class Arche<T>  {

	T[] elemente; // Das Array, das die Elemente speichert
	int size; // Die aktuelle Anzahl der Elemente im Array
	private int capacity;

	@SuppressWarnings("unchecked") // wird verwendet, um Compilerwarnungen zu unterdrücken, die auftreten können,
									// wenn ein generisches Array erstellt wird
	public Arche() {
		capacity = 2;
		elemente = (T[]) new Object[capacity]; // Initialisierung des Arrays mit der Anfangsgröße
		size = 0; // Die Anfangsgröße ist 0, da das Array leer ist

	}
	
	
	public int getSize() {
		return size;
	}

	public int getCapacity() {
		return capacity;
	}

	public boolean contains(T t) {
		for (int i = 0; i < elemente.length; i++) {
			if (elemente[i].equals(t))
				return true;

		}
		return false;
	}

	// Methode zum Hinzufügen eines Elements zum Array
	public int insert(T t) {
		// Überprüfen, ob das Array voll ist; falls ja, wird die Größe erhöht
		if (size == capacity) {
			capacity *= 2;

			@SuppressWarnings("unchecked")
			T[] neu = (T[]) new Object[capacity];
			// Kopieren der Elemente aus dem alten Array in das neue Array
			for (int i = 0; i < size; i++)
				neu[i] = elemente[i];
			elemente = neu;
		}

		elemente[size++] = t; // Hinzufügen des Elements an der aktuellen Größe des Arrays und Inkrementieren
								// der Größe
		return capacity;
	}

	public T remove() {
		if (size == 0) {
			throw new NoSuchElementException("Arche is empty");
		}
		T removedElement = elemente[--size];
		elemente[size] = null; // Avoid memory leak
		if (size > 0 && size == capacity / 4) {
			@SuppressWarnings("unchecked")
			T[] neu = (T[]) new Object[capacity / 2];
			// Kopieren der Elemente aus dem alten Array in das neue Array
			for (int i = 0; i < size; i++)
				neu[i] = elemente[i];
			elemente = neu;
		}
		return removedElement;
	}

	@Override
	public String toString() {
		String s = "";
		for (int i = 0; i < elemente.length; i++) {
			s += elemente[i] + " ";
		}
		return s;
	}

	public static void main(String[] args) {
		Arche<String> arche = new Arche<String>();
		arche.insert("Elephant");
		arche.insert("Tiger");
		arche.insert("Lion");
		arche.insert("Giraffe");
		
		System.out.println(arche);

		arche.remove();

		System.out.println(arche);
		arche.remove();
		arche.remove();
		System.out.println(arche);

	}
}
