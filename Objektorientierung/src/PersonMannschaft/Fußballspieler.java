package PersonMannschaft;


public class Fußballspieler extends Person {
	
	
	int einkommen = 0;
	
	
	public Fußballspieler(String nachname, int einkommen) {
		super(nachname);
		this.einkommen = einkommen;
		
	}
	
	
	public int getEinkommen() {
		return this.einkommen;
		
	}
	
	
	public String toString() {
		
		return super.toString();
	}


	

}
