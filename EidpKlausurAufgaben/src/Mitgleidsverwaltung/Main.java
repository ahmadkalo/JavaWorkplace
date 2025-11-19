package Mitgleidsverwaltung;

public class Main {

	public static void main(String[] args) {

		Aktiv mitgliedAktiv1 = new Aktiv("Ahmed", 2001);
		Aktiv mitgliedAktiv2 = new Aktiv("Mayar", 2002);
		Inaktiv mitgliedInaktiv1 = new Inaktiv("Telman", 2003);
		Inaktiv mitgliedInaktiv2 = new Inaktiv("Margarita", 2006);

		System.out.println(mitgliedAktiv1);
		System.out.println(mitgliedInaktiv1);
		
		System.out.println("Anzahl der Mitglider: " + Mitglied.anzahlDerMitglieder());
		mitgliedAktiv1.arbeiten(5);
		mitgliedAktiv1.arbeiten(3);
		mitgliedInaktiv1.spenden(100.00);
		System.out.println("------------------------------------------");
		System.out.println(mitgliedAktiv1);
		System.out.println(mitgliedAktiv2);
		System.out.println(mitgliedInaktiv1);
		System.out.println(mitgliedInaktiv2);

	}

}
