package StudentModul;

public class Person {
	
	// Instanzattribute
	private String name;
	private int gebJahr;
	
	// Konstruktor
	public Person(String n, int j) {
		this.name = n;
		this.gebJahr = j;
	}
	


	// Methoden
	public String getName() {
		return this.name;
	}
	
	public int getGebJahr() {
		return this.gebJahr;
	}
	
	public void setName(String n) {
		this.name = n;
	}
	
	public int alter(int jahr) {
		return jahr - gebJahr;
	}
	
	public String toString() {
		return this.name;
	}
	
}
