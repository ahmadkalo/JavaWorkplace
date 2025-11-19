package Person;

import java.util.Objects;

public class Person {

	String name;
	int gebJahr;

	public Person(String name, int gebJahr) {

		this.name = name;
		this.gebJahr = gebJahr;
	}

	@Override
	public String toString() {

		return "Name: " + name + "Geburtsjahr: " + gebJahr;

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return gebJahr == other.gebJahr && Objects.equals(name, other.name);
	}

	public String getName() {
		return name;
	}

}
