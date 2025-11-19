package Student;


public class UniTest {
	
	/* Klassenmethode */
	
	public static void main(String[] args) {
		
		Student willi = new Student ("Willi", "Wichtig", 900);
		Student helga = new Student ("helga", "Eifrig", 901);
		
		System.out.println(willi.toString());
		System.out.println(helga.toString());
		
		Ergebnis e1 = new Ergebnis(willi, 4.0f, 60);
		Ergebnis e2 = new Ergebnis(helga, 1.0f, 118);
		
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		
		Pruefung eidp = new Pruefung("Einführung in die Programmierung", "29.01.2024", 9);
		eidp.neuesErgebnis(e1);
		eidp.neuesErgebnis(e2);
		
		System.out.println(eidp);
	
	}

}
