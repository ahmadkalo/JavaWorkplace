package Student;


public class Student {
	

	/* Instanzvariablen */
	
	String vorname;
	String nachname;
	int matrikelnummer;
	
	
	/* Konstruktor */
	
	public Student(String vroname, String nachname, int matrikelnummer) {
	
		this.vorname = vroname;
		this.nachname = nachname;
		this.matrikelnummer = matrikelnummer;
	}

	
	
	/* Instanzmethoden*/
	
	public String toString() {

		return this.vorname + " " + this.nachname + " (" + this.matrikelnummer + ")";
	}
}
