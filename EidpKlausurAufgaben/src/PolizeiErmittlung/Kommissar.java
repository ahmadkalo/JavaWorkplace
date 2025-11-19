package PolizeiErmittlung;

public class Kommissar implements Ermittler {

	public Verdächtige ermitteln(Person[] personen) {
		for (int i = 0; i < personen.length; i++) {
			if (personen[i] instanceof Verdächtige) {
				Verdächtige v = (Verdächtige) personen[i];
				if (v.getVorstrafen() > 0 && v.getMotiv() != null && !v.HasAlibi()) {
					return v;
				}
			}
		}
		return null;
	}

	public static void main(String[] args) {
		Person[] personen = {new Person("Mandy", 0), new Verdächtige("Andy", 0, "", true), new Verdächtige("Candy", 3, "Geld", false)};
		
		Ermittler e = new Kommissar();
		
		System.out.println(e.ermitteln(personen));
	}
}

