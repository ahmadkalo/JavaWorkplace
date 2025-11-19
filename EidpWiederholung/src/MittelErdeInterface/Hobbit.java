package MittelErdeInterface;

public class Hobbit extends Wesen {

	int lebenserwartung;

	public Hobbit(String name, int alter, double geldbeutel, Tragbar ding) {
		super(name, alter, geldbeutel, ding);
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
	public void traegt(Gegenstand gegenstand) {
		if (gegenstand.getGewicht() < 20.0) {
			System.out.println(this.name + " " + "trägt " + gegenstand.getBezeichnung());
		} else {
			System.out.println(gegenstand.getBezeichnung() + " ist zu schwer für einen Hobbit");

		}
	}

	@Override
	public void kaufen(Kaufbar kaufbar) {
		if (kaufbar.preis() <= this.geldbeutel) {
			System.out.println(this.name + " kann ein " +  kaufbar.getClass().getSimpleName()  +  " kaufen");
		} else {
			System.out.println(this.name + " hat leider nicht genug Geld, um ein " + kaufbar.getClass().getSimpleName() +" zu kaufen");
		}
	}

	@Override
	public void nehmen(Tragbar ding) {
		if (ding.gewicht() < 20.0) {
			System.out.println(this.name + " hat jetzt " +  ding.getClass().getSimpleName() + " genommen");
		} else {
			System.out.println(ding.getClass().getSimpleName() + " ist zu schwer für einen Hobbit");

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
