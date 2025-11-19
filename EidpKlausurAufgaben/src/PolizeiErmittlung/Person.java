package PolizeiErmittlung;

public class Person {
	
	private String name;
	private int vorstrafen;
	
	
	public Person(String name, int vorstrafen) {
		this.name = name;
		this.vorstrafen = vorstrafen;
	}
	
	public String toString() {
		return name + ", Vorstrafen: " + vorstrafen;
	}
	
	public int getVorstrafen() {
		return vorstrafen;
	}

}
