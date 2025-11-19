package PersonGetraenkStudent;


public class Person {
	
	/* Klassenmethoden */
	
	public static void main(String[] args) {
		Person paul = new Person("Paul", 16);
		System.out.println(paul.toString());
	}


	/* Instanzvariablen */
	String vorname;
	int alter;
	
	
	/* Konstruktor */
	
	public Person(String vorname, int alter) {
		
		this.vorname = vorname;
		this.alter = alter;
	}
	
	/* Instanzmethoden */
	
	public String toString() {
		
		return vorname + "(" + alter + ")";
	}
	

}


