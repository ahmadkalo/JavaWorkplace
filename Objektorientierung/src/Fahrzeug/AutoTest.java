package Fahrzeug;

public class AutoTest {
	
	/* Klassenmethoden */

	
public static void main(String[] args) {
		
		Fahrzeug f1 = new Fahrzeug(4, 5);
		Fahrzeug f2 = new Kraftfahrzeuge(2, 1, 2000);
		
		System.out.println(f1);
		System.out.println(f2);
		
		System.out.println(Fahrzeug.getAnzahl());
		System.out.println(Kraftfahrzeuge.getAnzahl());
	}
}

