package Mitgleidsverwaltung;

public class Aktiv extends Mitglied {

	public Aktiv(String name, int gebJahr) {
		super(name, gebJahr);

	}

	@Override
	public void setJahresBeitrag(double jahresBeitrag) {
		this.jahresBeitrag = jahresBeitrag;

	}
	

	public void arbeiten(int std) {
		if (jahresBeitrag <= 0) {
			System.out.println("Jahresbeitrag kann nicht mehr reduziert werden");
			return;
		}
		this.jahresBeitrag -= std * 5;

	}

}
