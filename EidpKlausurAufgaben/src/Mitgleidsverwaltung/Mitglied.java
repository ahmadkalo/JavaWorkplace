package Mitgleidsverwaltung;

public abstract class Mitglied extends Person {

	static int naechgsterMitgleidsnummer = 0;

	int mitgliedsnummer;
	double jahresBeitrag;

	public Mitglied(String name, int gebJahr) {
		super(name, gebJahr);

		this.mitgliedsnummer = naechgsterMitgleidsnummer++;
		if (this instanceof Aktiv) {
			this.jahresBeitrag = 75.00;
		} else {
			this.jahresBeitrag = 20.00;
		}

	}

	public static int anzahlDerMitglieder() {
		return naechgsterMitgleidsnummer;
	}
	
	public double getJahresBeitrag() {
		return jahresBeitrag;
	}

	public abstract void setJahresBeitrag(double jahresBeitrag);
	
	@Override
	public String toString() {
		
		return super.toString() + ", JahresBeitrag: " + this.getJahresBeitrag();
	}

}
