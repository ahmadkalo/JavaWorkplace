package Fußballspieler;

public class Torwart extends Fußballspieler implements Halten, TorSchiessen {
	

	
	public Torwart(String name) {
		super(name);
	}
	

	
	public String halten() {

		return "halten";
	}


	public String torSchiessen() {
		
		return "Tor Schiessen";
	}

}
