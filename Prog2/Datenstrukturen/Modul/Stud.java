package Modul;

import Menge.Menge;
import Menge.MengeDynArray;

public class Stud {
	private String name;
	private int matrikelnummer;
	// Menge von Modulen, die der Studierende belegt hat
	private Menge<Modul> belegt;

	// Statische Variable für die nächste zu vergebende Matrikelnummer
	private static int nextMatrikelnummer = 100;

	// Konstruktor für die Studierendenklasse
	public Stud(String name) {
		this.name = name;
		// Vergeben einer Matrikelnummer und Inkrementieren des Zählers für die nächste
		// Matrikelnummer
		this.matrikelnummer = nextMatrikelnummer++;
		// Initialisieren der Menge von belegten Modulen
		this.belegt = new MengeDynArray<>();
	}

	// Methode zum Anmelden eines Moduls
	public void anmelden(Modul modul) {
		belegt.insert(modul);
		// Den Studierenden auch zum Modul hinzufügen
		modul.anmelden(this);
	}

	// Methode zum Abmelden eines Moduls
	public void abmelden(Modul modul) {
		belegt.delete(modul);
		// Den Studierenden auch vom Modul entfernen
		modul.abmelden(this);
	}

	// Methode zur Rückgabe der Menge von Modulen, die der Studierende belegt hat
	public Menge<Modul> belegt() {
		return belegt;
	}

	// Getter für den Namen des Studierenden
	public String getName() {
		return name;
	}

	// Getter für die Matrikelnummer des Studierenden
	public int getMatrikelnummer() {
		return matrikelnummer;
	}

	// Überschreiben der toString-Methode für die Studierendenklasse
	@Override
	public String toString() {
		return name + " " + matrikelnummer;
	}
}
