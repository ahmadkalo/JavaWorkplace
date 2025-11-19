package EinzelneAufgaben;
public class OOP1K {
	// Instanzattribute
	private double wert;
	private String text;

	// Konstruktoren
	public OOP1K(double wert, String text) {
		this.wert = wert;
		this.text = text;
	}

	public OOP1K() {
		this.wert = 0.0;
		this.text = "";
	}

	// Instanz-Methoden
	public double wert() {
		return this.wert;
	}

	public String text() {
		return this.text;
	}

	public void setWert(double wert) {
		this.wert = wert;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String toString() {
		return this.text + ", " + this.wert;
	}

	public static void main(String[] args) {
		// Erzeugung von Objekten, Initialisierung von Testdaten

		double x = 47.11; // Setzen einer Testwert für x
		double y = 0.815; // Setzen einer Testwert für y
		OOP1K p = new OOP1K(); // Erzeugung eines Objekts p der Klasse OOP1K ohne Parameter und es ist am
								// Anfang leer wegen der zweiten Konstruktor
		OOP1K q = new OOP1K(x, "Hallo"); // Erzeugung eines Objekts q der Klasse OOP1K mit gegebenem Wert x und Text
											// "Hallo"

		OOP1K r; // Deklaration eines Objekts r der Klasse OOP1K ohne Zuweisung

		// Arbeit mit den Objekten
		p.setWert(q.wert()); // Setzen des Wertes von p auf den Wert von q, p ist also jetzt ("",47,11);
		y = y + 0.001; // Veränderung des Wertes von y um 0.001, y ist jetzt 0.816
		p.setText("Hallo"); // Setzen des Textes von p auf "Hallo", p ist also jetzt ("Hallo",47,11);
		r = q; // Zuweisung von q zu r (beide referenzieren jetzt dasselbe Objekt), r ist jetzt ("Hallo", 47.11)

		q.setWert(y); // Setzen des Wertes von q auf den Wert von y, q ist jetzt ("Hallo", 0,816) und
						// r auch da sie dasselbe Objekt sind
		r.setText("Welt"); // Setzen des Textes von r auf "Welt", r ist also jetzt ("Welt" ,0,816) und q
							// auch da sie dasselbe Objekt sind

		// Ausgabe des End-Zustands
		System.out.println("p: " + p); // Ausgabe des Zustands von p ("Hallo",47,11)
		System.out.println("q: " + q); // Ausgabe des Zustands von q ("Welt" ,0,816)
		System.out.println("r: " + r); // Ausgabe des Zustands von r ("Welt" ,0,816)
	}
}
