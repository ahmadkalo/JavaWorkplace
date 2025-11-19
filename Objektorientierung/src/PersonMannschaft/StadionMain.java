package PersonMannschaft;

public class StadionMain {


	    public static void main(String[] args) {
	    	
	        // Erzeugung der Spieler für die rote Mannschaft
	    	Fußballspieler spielerRot1 = new Fußballspieler("Spieler-rot-1", 10000 * 1);
	    	Fußballspieler spielerRot2 = new Fußballspieler("Spieler-rot-2", 10000 * 2);
	    	Fußballspieler spielerRot3 = new Fußballspieler("Spieler-rot-3", 10000 * 3);
	    	Fußballspieler spielerRot4 = new Fußballspieler("Spieler-rot-4", 10000 * 4);
	    	Fußballspieler spielerRot5 = new Fußballspieler("Spieler-rot-5", 10000 * 5);

	        // Erzeugung der Spieler für die blaue Mannschaft
	    	Fußballspieler spielerBlau1 = new Fußballspieler("Spieler-blau-1", 20000 * 1);
	    	Fußballspieler spielerBlau2 = new Fußballspieler("Spieler-blau-2", 20000 * 2);
	    	Fußballspieler spielerBlau3 = new Fußballspieler("Spieler-blau-3", 20000 * 3);
	        Fußballspieler spielerBlau4 = new Fußballspieler("Spieler-blau-4", 20000 * 4);
	        Fußballspieler spielerBlau5 = new Fußballspieler("Spieler-blau-5", 20000 * 5);

	        // Erzeugung der Mannschaften
	        Mannschaft roteMannschaft = new Mannschaft(null, 0, spielerRot1, spielerRot2, spielerRot3, spielerRot4, spielerRot5);
	        Mannschaft blaueMannschaft = new Mannschaft(null, 0, spielerBlau1, spielerBlau2, spielerBlau3, spielerBlau4, spielerBlau5);
	        
	        // Erzeugung des Zuschauers
	        Person zuschauer = new Person("Zuschauer-1");

	        
	        System.out.println(roteMannschaft.toString() + "\n"); 
	        System.out.println(blaueMannschaft + "\n");
	        System.out.println(roteMannschaft.einkommen());
	        System.out.println(blaueMannschaft.einkommen());
	        System.out.println(zuschauer.toString());
	    }
	}


