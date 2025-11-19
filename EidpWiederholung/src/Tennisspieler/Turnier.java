package Tennisspieler;


public class Turnier {

	private String name;
	private int atpPunkte;

	public Turnier(String name, int atpPunkte) {
		this.name = name;
		this.atpPunkte = atpPunkte;
	}

	public String getName() {
		return name;
	}

	public int getAtpPunkte() {
		return atpPunkte;
	}

	public static void main(String[] args) {

		Turnier turnier1 = new Turnier("Wimbledon", 5);
		Turnier turnier2 = new Turnier("USOpen", 6);
		Turnier turnier3 = new Turnier("RolandGarros", 7);

		Tennisspieler tennisspieler1 = new Tennisspieler("Ahmed", 2000, true);
		Tennisspieler tennisspieler2 = new Tennisspieler("Nahla", 2002, false);
		Tennisspieler tennisspieler3 = new Tennisspieler("Telman", 2001, false);

		tennisspieler1.gewinneTurnier(turnier1);
		tennisspieler1.gewinneTurnier(turnier2);
		tennisspieler1.gewinneTurnier(turnier3);
		
		tennisspieler2.gewinneTurnier(turnier3);
		tennisspieler3.gewinneTurnier(turnier2);

		System.out.println(tennisspieler1);
		System.out.println(tennisspieler1.getAtpPunkte());

	}

}
