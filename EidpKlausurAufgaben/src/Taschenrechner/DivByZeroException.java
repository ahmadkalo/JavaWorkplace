package Taschenrechner;

@SuppressWarnings("serial")
public class DivByZeroException extends RuntimeException {
	
	public DivByZeroException(String message) {
		super(message);
		
	}

}
