package Mitgleidsverwaltung;

public class Person {

	private String name;
	private int gebJahr;

	public Person(String name, int gebJahr) {
		this.name = name;
		this.gebJahr = gebJahr;
	}

	public String getName() {
		return name;
	}

	public int getGebJahr() {
		return gebJahr;
	}
	
	@Override
	public String toString() {
		
		return "Name: "+ this.name + ", Geburtsjahr: " + this.gebJahr ;
	}
}
