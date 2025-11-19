
public class Artikel2 {
	// Klassenvariable
	static int NextNr;

	// Instanzvarialben
	String bez;
	int nr;
	double nettoPreis;
	double mwst;

	public Artikel2(String bez, double nettoPreis) {
		this.bez = bez;
		this.nettoPreis = nettoPreis;
		this.nr = NextNr++;
		this.mwst = 0.19;

	}
	// Instanzvarialben
	public void setMwst(double mwst) {
		this.mwst = mwst;
	}

	public double bruttoPreis() {
		double bruttoPreis = nettoPreis * (1 + mwst);
		return bruttoPreis;
	}

	@Override
	public String toString() {
		return "Artikel: bez= " + this.bez + ", nummer = " + (nr + 1) + ", nettoPreis= " + nettoPreis + ", mwst= "
				+ mwst + "]";
	}

	public static void main(String[] args) {

		Artikel2 artikel = new Artikel2("Dove", 2.99);
		Artikel2 artikel2 = new Artikel2("Chips", 1.25);
		Artikel2 artikel3 = new Artikel2("EcoCharge", 50.0);

		System.out.println(artikel3.bruttoPreis());

		System.out.println(artikel);
		System.out.println(artikel2);
		System.out.println(artikel3);

	}

}
