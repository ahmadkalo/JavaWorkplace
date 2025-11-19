package Fehler;

@SuppressWarnings("serial")
public class Fehler2 extends Exception {  
  // eine überprüfte (checked) Exception 
  // verpflichtet
	
	public Fehler2(String message) {
		super(message);
	}  
}
