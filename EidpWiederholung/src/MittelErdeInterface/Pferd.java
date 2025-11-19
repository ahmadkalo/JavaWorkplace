package MittelErdeInterface;

public class Pferd extends Wesen implements Kaufbar {

	double preis;

	public Pferd(String name, int alter, double geldbeutel, double preis, Tragbar ding) {
		super(name, alter, geldbeutel, ding);
		this.preis = preis;

	}

	@Override
	public void gruss() {
		System.out.println("Mooooooooooooo");

	}

	@Override
	public void traegt(Gegenstand gegenstand) {
		System.out.println(this.name + " " + "trägt " + gegenstand.getBezeichnung());

	}

	@Override
	public void kaufen(Kaufbar kaufbar) {
		System.out.println("Ein kaufbares Wesen kann nicht kaufen");

	}

	@Override
	public double preis() {

		return this.preis;
	}

	@Override
	public void nehmen(Tragbar ding) {

		System.out.println(this.name + " hat jetzt " + ding.getClass().getSimpleName() + " genommen");
	}

	@Override
	public String toString() {
		return "Name: " + this.name + ", Alter: " + this.alter + ", Preis: " + this.preis;
	
	
	}
}
