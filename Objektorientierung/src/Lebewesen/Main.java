package Lebewesen;


public class Main {

	public static void main(String[] args) {
		
		
		 /* Objekt zum Testen */
		Lebewesen lebewesen = new Lebewesen(12, 127);
		lebewesen.fortPflanzen();
		System.out.println("------------------------");
		
		
		 /* Erstes Objekt */
		Tier katze = new Tier(13, 120, "Miao", false);
		
		if(katze.kannFliegen == false) {
			
			System.out.println("Katze: \n" + katze.alter + ", " + katze.größe + ", " + katze.geräusch + ", Katze kann nicht fliegen");
			
		} else {
			System.out.println(katze.alter + ", " + katze.größe + ", " + katze.geräusch + ", Katze kann fliegen");
		}
		
		katze.fortPflanzen();
		katze.wachsen();
		System.out.println("----------------------");
	
		

		 /* Zweites Objekt */
		Hund hund = new Hund(12, 100, "Hau Hau", false, "rassist", "rot", true);
		
		System.out.println("Hund: \n" + hund);
		
		hund.fortPflanzen();
		hund.wachsen();
		System.out.println("--------------------");
		
		
		 /* Drittes Objekt */
		Pflanze baum = new Pflanze(2, 200, true);
		
		if ( baum.hatNadeln == true) {
			
			System.out.println("Pflanze: \n" +baum.alter + ", " + baum.größe + ", " + " Die Pflanze hat Nadeln");
			
		} else {
			System.out.println("Pflanze: \n" +baum.alter + ", " + baum.größe + ", " + " Die Pflanze hat keine Nadeln");
			
		}
		baum.gebeFrüchte();
		
	
	}
	
	
}
