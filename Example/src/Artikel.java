
public class Artikel {

	/* Instanzvariablen */
	String bezeichnung;
	double verkaufspreis;
	int bestand;
	double umsatz;

	/* Konstruktor */

	public Artikel(String bezeichnung, double verkaufspreis) {
		this.bezeichnung = bezeichnung;
		this.verkaufspreis = verkaufspreis;
		this.bestand = 0;
		this.umsatz = 0;
	}

	/* Instanzmethoden */

	public String getBezeichnung() {
		return bezeichnung;

	}

	public double getVerkaufspreis() {
		return verkaufspreis;

	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;

	}

	public void setVerkaufspreis(double verkaufspreis) {
		this.verkaufspreis = verkaufspreis;

	}

	public double getUmsatz() {
		return umsatz;

	}

	public int getBestand() {
		return bestand;

	}

	public void liefern(int anzahl) {
		this.bestand += anzahl;

	}

	public void verkaufen(int anzahl) {
		if (this.bestand >= anzahl) {
			this.bestand -= anzahl;
			this.umsatz = anzahl * verkaufspreis;

		} else {
			System.out.println("Nicht genug Artikel im Lager");

		}

	}

	/* Klassenmethoden */

	public static void main(String[] args) {

		Artikel tisch = new Artikel("Tisch", 120.0);
		Artikel stuhl = new Artikel("Stuhl", 40.0);

		tisch.liefern(10);
		stuhl.liefern(20);

		tisch.verkaufen(6);
		stuhl.verkaufen(11);

		System.out.println("Betand der Tische ist jetzt " + tisch.getBestand() + " Stück");
		System.out.println("Betand der Stühle ist jetzt " + stuhl.getBestand() + " Stück");

		System.out.println("Umsatz von dem Verkauf der Tische ist: " + tisch.getUmsatz() + " Euro");
		System.out.println("Umsatz von dem Verkauf der Stühle ist: " + stuhl.getUmsatz() + " Euro");
	}

}
