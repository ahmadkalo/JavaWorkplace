package ContainerTerminal;

public class Crane {
	
	
	/*die Position des Krans auf dem Terminal in der horizontalen Richtung speichert. 
	  Die Klasse hat einen Konstruktor, der die Startposition des Krans festlegt, 
	  und eine Methode toChar(), die den Kran als Zeichen (^) repräsentiert.*/
	
	int xPos;
	
	public Crane(int xPos) {
		this.xPos = xPos;
	}
	
	public char toChar() {
		return '^';
	}

}
