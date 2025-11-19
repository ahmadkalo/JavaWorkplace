package KomplexeZahlen;

public class ReeleZahl extends Zahl {

	/* Instanzvariablen */

	private double wert;

	/* Klassenmethoden */

	public static void main(String[] args) {
		Zahl z1 = new ReeleZahl(5.0);
		Zahl z2 = new ReeleZahl(7.0);

		Zahl z3 = z1.addieren(z2);
		System.out.println(z3);
	}

	/* Konstruktor */

	public ReeleZahl(double wert) {
		this.wert = wert;

	}

	/* Instanzmethoden */

	@SuppressWarnings("unused")
	public Zahl addieren(Zahl z) {
		double ergebnis = this.wert + ((ReeleZahl) z).wert;
		return null;
	}

	public Zahl subtrahieren(Zahl z) {

		return null;
	}

	public Zahl multiplizieren(Zahl z) {

		return null;
	}

	public Zahl dividieren(Zahl z) {

		return null;
	}

	public String toString(String s) {

		return null;
	}

}
