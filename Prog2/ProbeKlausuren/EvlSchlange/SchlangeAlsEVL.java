package EvlSchlange;



public class SchlangeAlsEVL<T> extends EVL<T> implements Schlange<T> {
	@Override
	public boolean insert(T value) { // Einfügen
		return append(value);
	}

	@Override
	public T head() { // Schauen
		if (0 == size())
			return null;
		T value = get(0);
		return value;
	}

	@Override
	public T remove() { // Entfernen
		if (0 == size())
			return null;
		else
			return remove(0);
	}

	@Override
	public int size() {

		return getSize();
	}
	
	
	public static void main(String[] args) {
		// Erstellen und Befüllen der ersten Schlange
		VergleichbareSchlangeAlsEVL<Person> schlange1 = new VergleichbareSchlangeAlsEVL<>();
		schlange1.append(new Person("Ahmed",22));
		schlange1.append(new Person("Delyar",23));
		schlange1.append(new Person("Mayar",20));

		// Erstellen und Befüllen der zweiten Schlange
		VergleichbareSchlangeAlsEVL<Person> schlange2 = new VergleichbareSchlangeAlsEVL<>();
		schlange1.append(new Person("Telman",20));
		schlange1.append(new Person("Delyar",25));
		schlange1.append(new Person("Mayar",19));

		// Vergleich der beiden Schlangen
		int result = schlange1.compareTo(schlange2);
		System.out.println("Vergleichsergebnis: " + result);

		// Hinzufügen eines Elements zu einer der Schlangen und erneuter Vergleich
		schlange2.append(new Person("Lava",25));
		result = schlange1.compareTo(schlange2);
		System.out.println("Vergleichsergebnis nach Hinzufügen eines Elements zu schlange2: " + result);

		// Entfernen eines Elements von einer der Schlangen und erneuter Vergleich
		schlange2.remove();
		result = schlange1.compareTo(schlange2);
		System.out.println("Vergleichsergebnis nach Entfernen eines Elements von schlange2: " + result);
	}
}
