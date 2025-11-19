
public class MayarsTraummann {

	public static boolean religios(Traummann ehemann) {

		return ehemann.betet == true && ehemann.fastet == true && ehemann.trinkt == false && ehemann.raucht == false
				&& ehemann.weissWieErEineFrauzuBehanelnHat == true && ehemann.gibtDerFrauIhreRechte == true
				&& ehemann.respektiertSeineFrau == true;
	}

	public static boolean selbstKontrolle(String[] selbstKontrolle) {

		if (selbstKontrolle[0].equals("Lügt nicht") && selbstKontrolle[1].equals("Loyal")
				&& selbstKontrolle[2].equals("Gut mit Probleme umgehen"));
		return true;

	}

	public static boolean physik(String[] physik) {
		
		return physik[0].equals("Macht regelmäßig Sport") &&  physik[1].equals("Verliert sich nicht in ungesundes Essen"); 

	}
	
	

	public static void main(String[] args) {

		Traummann khaled = new Traummann(true, true, false, true, false, true, false, true);

		System.out.println(religios(khaled) ? "Religiosität passt" : "Religiosität passt nicht");

		String[] selbstKontrolle = { "Lügt nicht", "Loyal", "Gut mit Probleme umgehen",
				"Kann sein Wut kontrollieren" + "Läuft keine Frauen hinterher" };
		String physik[] = { "Macht regelmäßig Sport", "Verliert sich nicht in ungesundes Essen" };

		System.out.println(selbstKontrolle(selbstKontrolle) ? "ok super SelbstKontrolle passt" : "das passt leider nicht");
		
		System.out.println(physik(physik) ? "ok super Physik passt" : "Physik leider nicht");

	}
}
