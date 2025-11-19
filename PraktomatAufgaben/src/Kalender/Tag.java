package Kalender;

public class Tag {

	String beschreibung = null;
	int prioritaet = 0;
	
	
	public void eintragen(String was, int prioritaet) {
		this.beschreibung = was;
		this.prioritaet = prioritaet;
	}
	
	
	public String getVerabredung() {
		return this.beschreibung;
	}
	
	public int getPrioritaet() {
		return this.prioritaet;
	}
	
	
}
