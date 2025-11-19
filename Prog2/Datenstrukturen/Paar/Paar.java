package Paar;

import Simpsons.EinElternTeilFehltException;

public class Paar<E, Z> {

	private E erstes;
	private Z zweites;

	public Paar(E erstes, Z zweites) {
		this.erstes = erstes;
		this.zweites = zweites;

	}

	public E getErstes() {
		return erstes;
	}

	public Z getZweites() {
		return zweites;
	}

	public void setErstes(E erstes) {
		this.erstes = erstes;
	}

	public void setZweites(Z zweites) {
		this.zweites = zweites;
	}

	@Override
	public String toString() {

		return "(" + this.erstes + " " + this.zweites + ")";
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Paar<?, ?>)) // Schritt 1: Überprüfen, ob das übergebene Objekt ein Paar ist
			return false;
		Paar<?, ?> paar = (Paar<?, ?>) o; // Schritt 2: Objekt auf den Paar-Typ casten, damit wir auf die Komponenten
											// zugreifen können

		// Schritt 3: Überprüfen, ob die Komponenten der beiden Paare gleich sind
		// Wir verwenden die equals-Methode, um die Gleichheit der Objekte zu überprüfen
		try {

			return this.erstes.equals(paar.erstes) && this.zweites.equals(paar.zweites);
		} catch (NullPointerException e) {
			throw new EinElternTeilFehltException("Ein Elternteil fehlt");
		}
	}

	public static void main(String[] args) {

		Paar<Integer, String> paar1 = new Paar<>(1, "Eins");
		Paar<String, Double> paar2 = new Paar<>("Zwei", 2.0);
		Paar<Boolean, Character> paar3 = new Paar<>(true, '3');

		// Ausgabe der Paar-Objekte
		System.out.println("Paar 1: " + paar1);
		System.out.println("Paar 2: " + paar2);
		System.out.println("Paar 3: " + paar3);

		// Ändern der Werte von Paar 1
		paar1.setErstes(10);
		paar1.setZweites("Neu");

		// Ausgabe der geänderten Werte von Paar 1
		System.out.println("Paar 1 nach Änderung: " + paar1);

		// Vergleich von Paar-Objekten
		System.out.println("Paar 1 ist gleich Paar 2: " + paar2.equals(paar3));
		System.out.println("Paar 1 ist gleich Paar 3: " + paar1.equals(paar3));

	}

}
