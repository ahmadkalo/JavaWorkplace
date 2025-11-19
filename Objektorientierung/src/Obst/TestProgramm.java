package Obst;

public class TestProgramm {
	
	public static void main(String[] args) {
		
	
	Obst[] korb = {new Apfel(), new Apfel(), new Banane(), new Banane(), new Banane()};
	Apfel ap = new Apfel(3); 

	
	for (int i = 0; i < korb.length; i++) {
		if (korb[i] instanceof Banane) {
			((Banane) korb[i]).schaelen();  // Downcast (vertrau mir es ist eine Banane
			   
			
			}
		}
	
		System.out.println(Banane.getGewicht());
		System.out.println(Apfel.getGewicht());
		System.out.println(Banane.getAnzahl());
		System.out.println(Apfel.getAnzahl());
		System.out.println(ap);

	}
	
}
