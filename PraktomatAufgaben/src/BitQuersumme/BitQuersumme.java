package BitQuersumme;

public class BitQuersumme {

	public static void main(String[] args) {
	  
		int bitQuersumme  = 0;
		int eingabeZahl = Integer.parseInt(args[0]);
		
		while (eingabeZahl != 0) {
			// Füge das niederwertigste Bit der Zahl zur Bitquersumme hinzu, wenn es eine 1 ist
			if ((eingabeZahl & 1) == 1) {
				bitQuersumme++;
			}
			// Verschiebe alle Bits der Zahl um eine Position nach rechts
			eingabeZahl >>= 1; 
		}
		System.out.print(bitQuersumme);

		
	}	

}

