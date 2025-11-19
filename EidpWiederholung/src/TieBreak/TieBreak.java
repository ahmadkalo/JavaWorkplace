package TieBreak;

public class TieBreak {

	private Spieler spielerA;
	private Spieler spielerB;
	private int punkteSpielerA;
	private int punkteSpielerB;
	private int runde;

	public TieBreak(Spieler spielerA, Spieler spielerB) {
		this.spielerA = spielerA;
		this.spielerB = spielerB;
		this.punkteSpielerA = 0;
		this.punkteSpielerB = 0;
		this.runde = 1;
	}

	public void spielen() {
		while (!fertig()) {
			Spieler schlaeger;
			if (runde % 4 < 2) {
				schlaeger = spielerA;
			} else {
				schlaeger = spielerB;
			}
			if (schlaeger.gewinnt()) {
				if (schlaeger == spielerA) {
					punkteSpielerA++;
				} else {
					punkteSpielerB++;
				}
			} else {
				if (schlaeger == spielerA) {
					punkteSpielerB++;
				} else {
					punkteSpielerA++;
				}
			}
			runde++;
			ansage();
		}
	}

	private boolean fertig() {
		return (punkteSpielerA >= 7 || punkteSpielerB >= 7) && Math.abs(punkteSpielerA - punkteSpielerB) >= 2;
	}

	private void ansage() {
		System.out.println(punkteSpielerA + " : " + punkteSpielerB);
	}

	public String getSieger() {
		if (punkteSpielerA > punkteSpielerB) {
			return spielerA.getName();
		} else {
			return spielerB.getName();
		}
	}

	public static void main(String[] args) {
		Spieler a = new Spieler("Ahmed", 0.6);
		Spieler b = new Spieler("Mayar", 0.6);
		TieBreak t = new TieBreak(a, b);
		t.spielen();
		System.out.println("Sieger: " + t.getSieger());
	}
}
