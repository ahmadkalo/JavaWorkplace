package Fußballspieler;



public abstract class Fußballspieler implements Finanzen {
	
	private String name;
	private int JahresEinkommen;
	
	public Fußballspieler(String name) {
		this.name = name;
		this.JahresEinkommen = 0;
	}
	
	
	
	
	
	
	public void gehaltBeziehen(int gehalt) {
		JahresEinkommen += gehalt;
    }
	
	
	
	public String toString() {
	        return this.name + " " + JahresEinkommen;
	        
	    }
	}
	
	

