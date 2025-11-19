package EinzelneAufgaben;

public class Tarif {

	private double grundgebuehr;
	private double kursgebuehr;

	// Methode zum Setzen der Grundgebühr und Kursgebühr
	public void setTarif(double grundgebuehr, double kursgebuehr) {
		this.grundgebuehr = grundgebuehr;
		this.kursgebuehr = kursgebuehr;
	}

	// Methode zur Berechnung der Gesamtkosten
	public double rechnung(int anzahlKurse) {
		return grundgebuehr + (kursgebuehr * anzahlKurse);
	}

	public static void main(String[] args) {
		// Tarif 1
		Tarif tarif1 = new Tarif();
		tarif1.setTarif(48.90, 2.50);
		System.out.println("Kosten für Tarif 1 mit 5 Kursen: " + tarif1.rechnung(5));

		// Tarif 2
		Tarif tarif2 = new Tarif();
		tarif2.setTarif(18.90, 12.80);
		System.out.println("Kosten für Tarif 2 mit 10 Kursen: " + tarif2.rechnung(10));
	}
}



