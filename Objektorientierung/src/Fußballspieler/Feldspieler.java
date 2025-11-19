package Fußballspieler;

public class Feldspieler extends Fußballspieler implements TorSchiessen {
	
	public Feldspieler(String name) {
		super(name);
		
	}

	
	public String torSchiessen() {
		return "Tor Schiessen";
	}
}