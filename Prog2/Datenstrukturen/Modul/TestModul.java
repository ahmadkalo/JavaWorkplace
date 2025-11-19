package Modul;

public class TestModul {

	public static void main(String[] args) {
		Modul mathe = new Modul("Mathematik", 6);
		Modul wirtschaftsinformatik = new Modul("Wirtschaftsinformatik", 6);
		Modul informatik = new Modul("Informatik", 9);
		Modul bwl = new Modul("Bwl", 6);

		Stud ahmed = new Stud("Ahmed");
		Stud telman = new Stud("Telman");
		Stud margarita = new Stud("Margarita");
		Stud mayar = new Stud("Mayar");
		Stud naz = new Stud("Naz");

		ahmed.anmelden(mathe);
		ahmed.anmelden(informatik);
		ahmed.anmelden(wirtschaftsinformatik);
		ahmed.anmelden(bwl);
		ahmed.abmelden(mathe);
		

		telman.anmelden(mathe);
		telman.anmelden(informatik);
		telman.anmelden(wirtschaftsinformatik);
		telman.anmelden(bwl);
		telman.abmelden(bwl);
		

		margarita.anmelden(mathe);
		margarita.anmelden(informatik);
		margarita.anmelden(wirtschaftsinformatik);
		margarita.anmelden(bwl);
		margarita.abmelden(bwl);
		margarita.abmelden(wirtschaftsinformatik);
		
		naz.anmelden(mathe);
		naz.anmelden(informatik);
		naz.anmelden(wirtschaftsinformatik);
		naz.anmelden(bwl);
		
		mayar.anmelden(mathe);
		mayar.anmelden(informatik);
		mayar.anmelden(wirtschaftsinformatik);
		mayar.anmelden(bwl);
		mayar.abmelden(mathe);
		mayar.abmelden(informatik);
	
		
		System.out.println("Belegte Module von Ahmed: " + ahmed.belegt());
		System.out.println("Belegte Module von Telman: " + telman.belegt());
		System.out.println("Belegte Module von Margarita: " + margarita.belegt());
		System.out.println("Belegte Module von Naz: " + naz.belegt());
		System.out.println("Belegte Module von Mayar: " + mayar.belegt());
		System.out.println("------------------------------------------------------------------------------------------------------------");
		System.out.println("Teilnehmer im Mathematikmodul: " + mathe.getTeilnehmer());
		System.out.println("Teilnehmer im Wirtschaftsinformatiksmodul: " + wirtschaftsinformatik.getTeilnehmer());
		System.out.println("Teilnehmer im Informatikmodul: " + informatik.getTeilnehmer());
		System.out.println("Teilnehmer im Bwlmodul: " + bwl.getTeilnehmer());
	}

}
