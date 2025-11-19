package Konto;

public class Person {
	
	private String name;
	private String nachname;

	public Person(String name, String nachname) {
		this.name = name;
		this.nachname = nachname;
	}

	public String getName() {
		return name;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {

	}

	public void setName(String name) {
		this.name = name;
	}

}
