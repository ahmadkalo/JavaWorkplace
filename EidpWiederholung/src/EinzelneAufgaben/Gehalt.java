package EinzelneAufgaben;



public class Gehalt {

	 /*Klassenvariable*/ 
	
	int grundgehalt = 1250;
	
	/* Klassenmethode */ 
	 
	public int berechneGehalt(int Gehaltsstufe, int Firmenzugehorigkeit) {
		
		int SummeVonGehaltsstufe = Gehaltsstufe*300;
		int SummeVonFirmenzugehorigkeit = Firmenzugehorigkeit* 60;	
		
		int Gesamtgehalt = grundgehalt +SummeVonGehaltsstufe + SummeVonFirmenzugehorigkeit;
		
		return Gesamtgehalt;
		
	}
	
	/* Klassenmethode */ 
	public static void main(String[] args) {
		
		Gehalt Gesamt  = new Gehalt();
		
		
		int Gesamtgehalt = Gesamt.berechneGehalt(2, 2);
		
		System.out.println("Das Gesamtgehalt lautet: " + Gesamtgehalt + "€");
		
	}
	
}