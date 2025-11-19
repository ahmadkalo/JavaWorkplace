package Student;


public class Ergebnis {

	
	/* Instanzvariablen*/
	
	Student student;
	float note;
	int punkte;

	
	/* Konstruktor */
	
	public Ergebnis(Student student, float note, int punkte) {
		this.student = student;
		this.note = note;
		this.punkte = punkte;
	}
	
	
	
	/* Instanzmethode */
	
	
	public String toString() { 
		
		return this.student + " Note = " + this.note + " Punktzahl = " + this.punkte;
	}
	

	
}
