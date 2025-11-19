package PostbotenIterator;

import java.util.Iterator;

class Person {

	private String name;
	private int hausnummer;

	public Person(String name, int hausnummer) {
		this.name = name;
		this.hausnummer = hausnummer;
	}

	@Override
	public String toString() {
		return name + " in Hausnummer " + hausnummer;
	}
}

public class Main {
	
	public static void main(String[] args) {
		Person[] strasse = new Person[5];
		strasse[1] = new Person("Anna", 1);
		strasse[2] = new Person("Ben", 2);
		strasse[3] = new Person("Chris", 3);
		strasse[4] = new Person("Didi", 4);
		
		
	
		

		iterriere(strasse);
	}

	public static void iterriere(Person[] strasse) {

		Iterator<Person> iterator = new PostboteIterator<>(strasse);
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
