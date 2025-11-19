package Kalender;

public class Kalender {

	public static void main(String[] args) {
		Jahr jahr23 = new Jahr(2023);
		Jahr jahr24 = new Jahr(2024);
		
		jahr23.eintragen(45, "Klausur", 1);
		jahr24.eintragen(37, "Treffen", 5);
		jahr23.eintragen(45, "lol", 9);
		System.out.println();
		
		String termin17 = jahr23.getTermin(17);
		String termin45 = jahr23.getTermin(45);
		
		if (termin17 == null)
			System.out.println("17. Tag ist frei");
		if (termin45 != null)
			System.out.println("45. Tag ist belegt");

		System.out.println("Belegte Tage insgesamt: "
							+ (jahr23.getBelegt() + jahr24.getBelegt()));
	}

}
