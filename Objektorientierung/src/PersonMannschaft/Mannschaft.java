package PersonMannschaft;

public class Mannschaft extends Fußballspieler {
	
	Fußballspieler s1;
	Fußballspieler s2;
	Fußballspieler s3;
	Fußballspieler s4;
	Fußballspieler s5;
	
	
	
	public Mannschaft(String nachname, int einkommen, Fußballspieler s1, Fußballspieler s2, Fußballspieler s3,
			Fußballspieler s4, Fußballspieler s5) {
		super(nachname, einkommen);
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.s4 = s4;
		this.s5 = s5;
	}


	public int einkommen() {
		return s1.getEinkommen() + s2.getEinkommen() + s3.getEinkommen() + s4.getEinkommen() + s5.getEinkommen();
	}
	
	
	public String toString() {
		
		return "1. " + this.s1 + "\n" + "2. " +  this.s2 + "\n" + "3. " + this.s3 + "\n" + "4. " + this.s4 + "\n" + "5. " + this.s5;
	}
}


