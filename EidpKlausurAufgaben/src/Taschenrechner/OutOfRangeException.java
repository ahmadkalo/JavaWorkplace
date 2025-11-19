package Taschenrechner;

@SuppressWarnings("serial")
public class OutOfRangeException extends Exception {

	public OutOfRangeException () {}
	
	public OutOfRangeException(String message) {
		super(message);
	} 

}
