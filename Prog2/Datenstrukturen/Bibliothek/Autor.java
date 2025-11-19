package Bibliothek;

public class Autor implements Comparable<Autor> {

	String name;

	public Autor(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Autor: " + this.name;

	}

	@Override
	public int compareTo(Autor o) {

		return this.name.compareTo(o.name);

	}

}
