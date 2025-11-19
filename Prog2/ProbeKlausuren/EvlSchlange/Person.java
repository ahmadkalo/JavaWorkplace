package EvlSchlange;

public class Person implements Comparable<Person>{

	String name;
	int alter;

	public Person(String name, int alter) {
		super();
		this.name = name;
		this.alter = alter;
	}

	public int getAlter() {
		return alter;
	}
	
	public String getName() {
		return name;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", alter=" + alter + "]";
	}



	@Override
	public int compareTo(Person o) {
		if(this.getAlter() > o.getAlter()) {
			return 1;
		} else if(this.getAlter() < o.getAlter()) {
			return -1;
		} else {
			return 0;
		}
	}

}
