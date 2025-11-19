package Mitgleidsverwaltung;

public class Inaktiv extends Mitglied {

	public Inaktiv(String name, int gebJahr) {
		super(name, gebJahr);
	}

	@Override
	public void setJahresBeitrag(double jahresBeitrag) {
		this.jahresBeitrag = jahresBeitrag;

	}

	public void spenden(double spende) {
		jahresBeitrag += spende;
	}

}
