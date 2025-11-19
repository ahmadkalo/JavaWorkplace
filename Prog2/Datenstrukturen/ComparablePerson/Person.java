package ComparablePerson;

public class Person implements Comparable<Person> {

	/* Instanzvariablen */

	private String name;
	private int alter;

	/* Konstruktoren */

	public Person(String name, int alter) {
		this.name = name;
		this.alter = alter;
	}

	/* Instanzmethoden */

	public String getName() {
		return name;
	}

	public int getAlter() {
		return alter;
	}

	@Override
	public int compareTo(Person other) {

        return this.name.equals(other.name) ? this.alter - other.alter : this.name.compareTo(other.name);
		/*
		 * if(this.alter > other.alter) { return 1;
		 * 
		 * } else if(this.alter < other.alter) { return -1; } else { return 0; }
		 * 
		 * 
		 */
	}

	@Override
	public String toString() {
		return "Person{" + "name='" + name + '\'' + ", alter=" + alter + '}';
	}
}