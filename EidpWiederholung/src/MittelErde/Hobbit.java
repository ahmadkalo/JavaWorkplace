package MittelErde;

public class Hobbit extends Wesen {

	int lebenserwartung;

	public Hobbit(String name, int alter) {
		super(name, alter);
		this.lebenserwartung = 150;

	}

	public boolean lebendig() {

		return (lebenserwartung > 0);
	}

	@Override
	public void gruss() {
		if (lebendig()) {

			System.out.println("Hallo");
		} else {
			System.out.println("Ein totes Wesen kann nicht grüßen");
		}
	}

	public void wirdVerwundet(int verwundung) {
		this.lebenserwartung -= verwundung;
		if (verwundung >= 50) {
			System.out.println("eine tödliche Verletzung");
		}
	}

	@Override
	public String toString() {

		if (this.lebenserwartung <= 0) {
			return super.toString() + " bereits verstorben";
		} else {
			return super.toString() + ", Lebenserwartung: " + this.lebenserwartung;
		}

	}

}
