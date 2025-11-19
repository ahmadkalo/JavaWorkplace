package TelmanKlausur;

public abstract class AListe<T> implements Iliste<T> {

	int size = 0;
	String name = null;

	// Länge der Liste
	// Name der Liste
	public int size() {
		return size;
	}

	public void setName(String s) {
		name = s;
	}

	public String name() {
		return name;
	}

	public abstract void append(T v); // hänge v hinten an

	public abstract T removeLast();
	// lösche das letzte Element und gebe es zurück

	public abstract T get(int p); // liefert das erste Element

	public abstract void extend(int n); // Erweitere die Liste um n Elemente
}
