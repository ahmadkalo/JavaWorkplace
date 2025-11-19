package PersonMannschaft;


public class Person {

	
	String nachname;

	public Person(String nachname) {
		
		this.nachname = nachname;
	}
	
	public String getName() {
		return this.nachname;
	}
	
	
	public String toString() {
		
		return nachname;
	}
	
}
