package Modul;

import Menge.Menge;
import Menge.MengeDynArray;

public class Modul {
	private String bezeichnung;
	private int ectsPunkte;
	// Menge von Studierenden, die das Modul belegt haben
	private Menge<Stud> teilnehmer;

	public Modul(String bezeichnung, int ectsPunkte) {
		this.bezeichnung = bezeichnung;
		this.ectsPunkte = ectsPunkte;
		// Initialisiere die Menge von Teilnehmern
		this.teilnehmer = new MengeDynArray<>();
	}

	// Methode zum Anmelden eines Studierenden zum Modul
	public void anmelden(Stud stud) {
		teilnehmer.insert(stud);
	}

	// Methode zum Abmelden eines Studierenden vom Modul
	public void abmelden(Stud stud) {
		teilnehmer.delete(stud);
	}

	// Getter für die Bezeichnung des Moduls
	public String getBezeichnung() {
		return bezeichnung;
	}

	// Getter für die Anzahl der ECTS-Punkte des Moduls
	public int getEctsPunkte() {
		return ectsPunkte;
	}

	// Getter für die Menge der Teilnehmer des Moduls
	public Menge<Stud> getTeilnehmer() {
		return teilnehmer;
	}

	// Überschreiben der toString-Methode für die Modulklasse
	@Override
	public String toString() {
		return bezeichnung;
	}
}
